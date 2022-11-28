package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_reduce {

    /*
    reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
    kullanımı yaygındır pratiktir.
    Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
    bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
    reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
    reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
    İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

    */
        public static void main(String[] args) {

      List<Integer> sayi=new ArrayList<>(Arrays.asList(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));
        //List<Integer> sayi=new ArrayList<>(Arrays.asList(1,3,5,4,6,12,8)); //çift sayı filtrelendiğinde null deger vereceği için cıktısı : Optional.empty

        //Lambda -> stream API

            ciftKarelerinMax(sayi); // Optional[4356]
        elTopla(sayi);

            ciftCarp(sayi);

            enKckBul(sayi);

            denBykEnKck(sayi);

    }
    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz

    public static void ciftKarelerinMax(List<Integer> sayi) {

            Optional<Integer> maxEleman =sayi.stream().filter(C01_LambdaExpression::ciftMi).map(t->t*t).reduce(Math::max); //cift filtrelenen ve karesi alınan akış elemanları max elemana göre reduce(azaltıldı)
        System.out.println(maxEleman);
        //Optional<Integer> maxEleman = filter işlemi null değer return etme riskine karsı Optional class type data type casting yapıldı
        //reduce(Math::max) = cift filtrelenen  ve karesi alınan akış elemanları max elemanlara göre reduce -> azaltıldı
        System.out.println();
        System.out.println(sayi.stream().filter(C01_LambdaExpression::ciftMi).map(t->t*t).reduce(Math::max));

    }

    public static void elTopla(List<Integer> sayi) {

        System.out.println(sayi.stream().reduce(Integer::sum));

        Optional<Integer> toplam = sayi.stream().reduce(Integer::sum);

        System.out.println("toplam = " + toplam);

        System.out.println("Lambda expression = " + sayi.stream().reduce(0, (a, b) -> a + b)); //Lambda expression
        /*
        a : ilk degerini her zaman atanan identity degerden alır
        b : degerini her zaman stream() akıstan alır
        a ilk degerden sonraki degerlerini action (işlem body)'den alır
         */
    }

    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftCarp(List<Integer> sayi) {

        System.out.println("reduce(1, (t, u) -> t * u = " + sayi.stream().filter(C01_LambdaExpression::ciftMi).reduce(1, (t, u) -> t * u)); //lambda expression
        System.out.println("reduce(Math::multiplyExact) = " + sayi.stream().filter(C01_LambdaExpression::ciftMi).reduce(Math::multiplyExact));

        /*
        reduce(1, (t, u) -> t * u = 2304 :::: ilk deger olarak 1 verdigimiz için list bos olsa bile null dönmez o yüzden optional yok
        reduce(Math::multiplyExact) = Optional[2304] :::: list'in bo olması ve sonucun null olma ihtimaline binaen optional yaptı
         */
    }
    // Task : List'teki elemanlardan en kucugunu 4 farklı yontem ile print ediniz.

    public static void enKckBul(List<Integer> sayi) {

        System.out.println(sayi.stream().reduce(Integer::min)); //1.yol

        System.out.println(sayi.stream().reduce(Math::min)); //2.yol

        System.out.println(sayi.stream().reduce(C04_reduce::byHalukKckBul)); //3.yol

        System.out.println(sayi.stream().reduce(Integer.MAX_VALUE, (t, u) -> t<u ? t : u)); //4.yol
    }
    public static int byHalukKckBul(int a,int b) { //seed (tohum) method
            return a<b?a:b; //a buyukse a değilse b return et..
    }

    // Task : List'teki 24'ten buyuk en kucuk tek sayiyi print ediniz.

    public static void denBykEnKck(List<Integer> sayi) {

        System.out.println(sayi.stream().filter(t -> t > 24).filter(C01_LambdaExpression::tekMi).reduce(Math::min));

        System.out.println(sayi.stream().filter(t -> t > 24 && t % 2 == 1).reduce(Integer::min));

       // sayi.stream().filter(t -> t > 24 && C01_LambdaExpression::tekMi) -> CTE
    }


}

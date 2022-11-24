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
        //List<Integer> sayi=new ArrayList<>(Arrays.asList(1,3,5,7)); //çift sayı filtrelendiğinde null deger vereceği için cıktısı : Optional.empty

        //Lambda -> stream API

            ciftKarelerinMax(sayi); // Optional[4356]
        System.out.println("\n");


    }
    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz

    public static void ciftKarelerinMax(List<Integer> sayi) {

            Optional<Integer> maxEleman =sayi.stream().filter(C01_LambdaExpression::ciftMi).map(t->t*t).reduce(Math::max); //cift filtrelenen ve karesi alınan akış elemanları max elemana göre reduce(azaltıldı)
        System.out.println(maxEleman);
        //Optional<Integer> maxEleman = filter işlemi null değer return etme riskine karsı Optional class type data type casting yapıldı
        //reduce(Math::max) = cift filtrelenen  ve karesi alınan akış elemanları max elemanlara göre reduce -> azaltıldı
        System.out.println();
        System.out.println(sayi.stream().filter(C01_LambdaExpression::ciftMi).map(t->t*t).reduce(Math::max));
                                                                                        //.reduce(Integer::max)
    }


}

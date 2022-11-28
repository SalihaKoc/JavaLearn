package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_sorted {

    public static void main(String[] args) {

        List<Integer> sayi=new ArrayList<>(Arrays.asList(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));

        cftKareKB(sayi);
        System.out.println("\n");
        tkKareBK(sayi);

    }

    // Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.

    public static void cftKareKB(List<Integer> sayi) {

        sayi.stream(). //list elemanları akısa alındı
                filter(C01_LambdaExpression::ciftMi). //akıstaki elemanlar cift sartına gore filtrelendi
                map(t-> t*t). ///filtrelenen cift elemanlar karesine update edildi
                sorted(). //akıstaki karesine update edilen eleman sıralandı (naturel order)
                forEach(C01_LambdaExpression::yazdir);

        //sorted() => Doğal düzene göre sıralanmış, bu akışın elemanlarında oluşan bir akış döndürür.
        //sorted() methodu tekrarlı kullanılırsa en son kullanılan aktif olur.
    }

    // Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.

    public static void tkKareBK(List<Integer> sayi) {

        sayi.stream().filter(C01_LambdaExpression::tekMi).map(t->t*t).
                sorted(Comparator.reverseOrder()). //Comparator.reverseOrder() meth call ters sıra method sorted
                forEach(C01_LambdaExpression::yazdir);

        //reverseOrder() => Comparator Class'ının bir methodudur. Doğal sıralamanın tersini (büyükten küçüğe) uygulayan
    // bir Comparator (karşılaştırıcı) return eder.
    }
}

package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_distinct {

    public static void main(String[] args) {

        List<String> menu=new ArrayList<>(Arrays.asList("kuşleme","soğanli","trileçe","bicibici","büryan","küşleme","melemen","bicibici","cacix","kokorec","yağlama","güvec","bicibici","arabaşi","tantuni"));

        alfabetik(menu);

        System.out.println("\n");

        krktrTersSira(menu); // 8 7 6 5
        System.out.println("\n");

        krktKckByk(menu); //cacix güveç büryan küşleme soğanlı trileçe küşleme melemen kokoreç yağlama arabaşı tantuni bicibici bicibici bicibici

        System.out.println("\n");
        sonHarfTersSira(menu);
        System.out.println("\n");
        charKaresiCiftSirala(menu);

    }

    // Task : List elemanlarini alfabetik buyuk harf ve tekrarsiz print ediniz.
    public static void alfabetik(List<String> menu) {

        menu.stream().map(String::toUpperCase). //akıstaki degerleri buyuk harf yaptık
                sorted(). // distinct olmadan -> ARABAŞI BÜRYAN BİCİBİCİ BİCİBİCİ BİCİBİCİ CACİX GÜVEÇ KOKOREÇ KÜŞLEME KÜŞLEME MELEMEN SOĞANLI TANTUNİ TRİLEÇE YAĞLAMA
                distinct(). //tekrarsız sıraladı -> ARABAŞI BÜRYAN BİCİBİCİ CACİX GÜVEÇ KOKOREÇ KÜŞLEME MELEMEN SOĞANLI TANTUNİ TRİLEÇE YAĞLAMA
                forEach(t-> System.out.print(t+" "));
    }
    //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
    // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
    // Sıralı akışlar için, farklı elemanın seçimi sabittir
    // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
    // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

    // Task : list elemanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void krktrTersSira(List<String> menu) {

        menu.stream().map(String::length). //akıstaki String elemanlar karakter sayısına update edildi
                sorted(Comparator.reverseOrder()).distinct().forEach(t-> System.out.print(t+" "));
    }

    // Task : List elemanlarini character sayisina gore kckten byk e gore print ediniz..
    public static void krktKckByk(List<String> menu) {

        menu.stream().sorted(Comparator.
                comparing(String::length)). // akıstaki string elemanlarını lenght'ine göre dogal sıra yapıldı
                forEach(t-> System.out.print(t+" "));
    }

    // Task : list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHarfTersSira(List<String> menu) {

        menu.stream().sorted(Comparator.comparing(t-> t.toString().charAt(t.toString().length()-1)).reversed()).forEach(t-> System.out.print(t+" "));
    }

    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...

    public static void charKaresiCiftSirala(List<String> menu) {
      menu.stream().map(t->t.length()*t.length()).filter(C01_LambdaExpression::ciftMi).
              distinct().sorted(Comparator.reverseOrder()).forEach(C01_LambdaExpression::yazdir);
    }

}
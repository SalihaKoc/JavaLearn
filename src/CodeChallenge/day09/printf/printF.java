package CodeChallenge.day09.printf;

import java.util.Date;

public class printF {
    public static void main(String[] args) {

        // s – string
        // d – decimal
        // f – floating numbers
        // t– time

       // Java 'da Tamsayılar (int) için formatlı çıktı örnekleri
        int a = 5;
//düz formatsız çıktı
        System.out.println("a değişkeninin değeri " + a + "'tir");
//formatlı çıktı
//8 digit yer kaplasın
        System.out.printf("a değişkeninin değeri %8d'tir", a);

        //Java 'da Küsüratlı Sayılar (Double, Float) için formatlı çıktı örnekleri
        double a1 = 5.3135131;
       // düz formatsız çıktı
        System.out.println("a1 değişkeninin değeri " + a1 + "'tir");
//formatlı çıktı
//8 digit yer kaplasın, küsüratı 2 digit olsun
        System.out.printf("a1 değişkeninin değeri %8.2f'tir", a1);

       // Java 'da Yazılar (String) için formatlı çıktı örnekleri
       // Tümünü küçük harfle ya da büyük harfle yazdıralım.
        String b = "Merhaba Java";
        //düz formatsız çıktı
        System.out.println("b değişkeninin değeri " + b + "'dır");
//formatlı çıktı
//Tümü büyük harf olsun
        System.out.printf("b değişkeninin değeri %S'dır\n", b); //satşr sonu bir satır aşağı insin
//15 digit yer kaplasın
        System.out.printf("b değişkeninin değeri %15s'dır\n", b);
//sola hizalasın
        System.out.printf("b değişkeninin değeri %-15s'dır", b);

       // Java 'da Tarih (Date) için formatlı çıktı örnekleri
        Date tarih = new Date();
        System.out.printf("%tT%n", tarih);
//00:50:08
        System.out.printf("saat: %tH dakika: %tM saniye: %tS%n", tarih, tarih, tarih);
//saat: 00 dakika: 50 saniye: 08

//Biçimlendirerek tarih yazma
        Date tarh = new Date();
       // Haftanın günü, Ayı ve Yıl
        System.out.printf("%1$tA, %1$tB %1$tY %n", tarh); //Pazar, Aralık 2019
//gün ay yıl (DD.MM.YYYY) gösterimi olarak
        System.out.printf("%1$td.%1$tm.%1$ty %n", tarh); //29.12.19
    }
}
package J10_StringManipulation;

import java.util.Scanner;

public class C09_Replace_ReplaceAll {

    public static void main(String[] args) {

        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da
           metinle degistirilmesini (update -set) saglar. Sonuc String'dir.
         */

        String str="JavaCAN'lara selam olsun java ile bolcana offer";

        System.out.println(str.replace('a', '@'));

        System.out.println(str.replace("can", "kan"));

        /** ReplaceFirst
         * Replace ile aynı sadece ilk bulunanı değiştirir
         */

        System.out.println(str.replaceFirst("a", "@"));

        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

        //(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler

        str="    JavaCAN'lara selam olsun :) java ile 123455544 offer ***   ";

        System.out.println(str.replaceAll("\\s", "+")); //++++JavaCAN'lara+selam+olsun+:)+java+ile+123455544+offer+***+++
        System.out.println(str.replaceAll("\\S", "+")); //    ++++++++++++ +++++ +++++ ++ ++++ +++ +++++++++ +++++ +++
        System.out.println(str.replaceAll("\\w", "+")); //    +++++++'++++ +++++ +++++ :) ++++ +++ +++++++++ +++++ ***
        System.out.println(str.replaceAll("\\W", "+")); //++++JavaCAN+lara+selam+olsun++++java+ile+123455544+offer+++++++
        System.out.println(str.replaceAll("\\d", "+")); //    JavaCAN'lara selam olsun :) java ile +++++++++ offer ***
        System.out.println(str.replaceAll("\\D", "+")); //+++++++++++++++++++++++++++++++++++++++++123455544+++++++++++++

        // task  Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki formatta print eden code create ediniz.
        // isim-soyisim : M***** B*******
        // kart no : **** **** **** 1234
        //

        Scanner scan= new Scanner(System.in);
        System.out.print("İsim : ");
        String isim= scan.nextLine();
        System.out.print("Soyisim : ");
        String soyisim= scan.next();
        System.out.print("Kredi kart no giriniz : ");
        Long kartno=scan.nextLong();

        String kart= String.valueOf(kartno);

        String yeniisim= (isim.charAt(0) + isim.substring(1).replaceAll("\\w", "*"));
        String yenisoyisim= (soyisim.charAt(0) + isim.substring(1).replaceAll("\\w", "*"));
        String yenikartno = ("**** **** **** "+ kart.substring(12));

        System.out.println("isim-soyisim : " +yeniisim+" "+yenisoyisim+ "kart no : "+ yenikartno);



    }
}

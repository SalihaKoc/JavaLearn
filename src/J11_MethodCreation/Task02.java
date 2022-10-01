package J11_MethodCreation;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        //task-> girilen ad ve soyadın ilk harfleri buyuk digerlerini kucuk yapan method create

        Scanner scan = new Scanner(System.in);
        System.out.println("Ad Giriniz : ");
        String ad = scan.next();
        System.out.println("SoyAd Giriniz : ");
        String soyad = scan.next();

        isimKontrol(ad, soyad);
        System.out.println(isimHarfKontrol(ad, soyad));

    }

    private static void isimKontrol(String ad, String soyad) {

        ad=(ad.toUpperCase().charAt(0) + ad.substring(1).toLowerCase());
        soyad=(soyad.toUpperCase().charAt(0) + soyad.substring(1).toLowerCase());

        System.out.println("ad soyad = "+ad+" "+soyad);
    //return ad+" "+soyad;
    }

    private static String  isimHarfKontrol(String ad, String soyad) {

        ad=(ad.toUpperCase().charAt(0) + ad.substring(1).toLowerCase());
        soyad=(soyad.toUpperCase().charAt(0) + soyad.substring(1).toLowerCase());

        return ad+" "+soyad;
    }

}

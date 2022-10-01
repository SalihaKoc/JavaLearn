package javaForLife;

import java.util.Scanner;

public class dsgr {
    // Soru 4 Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("isim ve soyisim giriniz : ");
        String isim= scan.nextLine();
        String soyisim= scan.nextLine();

        //System.out.println((name.length() > surname.length()) ? (name.length() == surname.length()) ? "isim ve soyisim uzunlukları eşit" : "isim daha uzun" : "soyisim daha uzun"  );

        System.out.println(isim.length() > soyisim.length() ? "Isminiz, soyisminizden daha uzundur." : +
                soyisim.length() > isim.length() ? "Soyisminiz, isminizden daha uzundur" : "Isim ve soyisminizin uzunlugu aynidir.");
    }


}

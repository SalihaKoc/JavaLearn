package javaForLife.task01;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class a2 {

    // Soru 4 Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("İsim ve Soyisminizi Giriniz : ");
        String isim=scan.nextLine();
        String soyisim=scan.nextLine();

        System.out.println(isim.length() > soyisim.length() ? "Isminiz, soyisminizden daha uzundur." : +
                soyisim.length() > isim.length() ? "Soyisminiz, isminizden daha uzundur" : "Isim ve soyisminizin uzunlugu aynidir.");


    }




}

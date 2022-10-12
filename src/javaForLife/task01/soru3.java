package javaForLife.task01;

import java.util.Scanner;

public class soru3 {

    public static void main(String[] args) {

        /* Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle
         * baslayan gun isimlerini yazdirin Ornek: ilkHarf=P output = “Pazar, Pazartesi
                * veya Persembe” ilkHarf=S output = “Sali” Buyuk kucuk harf problem olmamasi
                * icin toUpperCase methodunu kullanin */

        Scanner scan= new Scanner(System.in);
        System.out.println ("gün isimlerinden birinin ilk harfini giriniz : ");

                char gun=scan.next().toUpperCase().charAt(0);

        if (gun=='P') {
            System.out.println("Pazar , Pazartesi veya Persembe");
        } else if (gun=='S') {
            System.out.println("Salı");
        } else if (gun == 'Ç'){
            System.out.println("Çarşamba");
        } else if (gun =='C') {
            System.out.println("Cuma");

        } else System.out.println("Geçersiz Giriş");

        /**
         *     char ilkHarf=scan.next().toUpperCase().charAt(0);
         *
         *         switch (ilkHarf){
         *             case 'P' :
         *                 System.out.println("Pazar, Pazartesi veya Persembe"); break;
         *             case 'S' :
         *                 System.out.println("Salı"); break;
         *             case 'C' :
         *                 System.out.println("Carsamba, Cuma veya Cumartesi"); break;
         *             default:
         *                 System.out.println("Hatalı Harf Girdiniz. ");
         */

    }
}

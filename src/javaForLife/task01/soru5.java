package javaForLife.task01;

import java.util.Scanner;

public class soru5 {

    public static void main(String[] args) {

        // Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        // Kullanicidan bir sifre girmesini isteyin
        // Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
        // Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.



        Scanner scan = new Scanner(System.in);
        System.out.println("Şifrenizi giriniz . ");
        String sifre = scan.next();
        char buyukHarf = sifre.toUpperCase().charAt(0);
        char kucukHarf = sifre.toLowerCase().charAt(0);


        if (sifre.charAt(0) == buyukHarf) {
            if (buyukHarf == 'A') {
                System.out.println("Geçerli giriş");
            } else {
                System.out.println("Geçersiz giriş");
            }
        }
        if (sifre.charAt(0) == kucukHarf) {
            if (kucukHarf == 'z') {
                System.out.println("Geçerli giriş");
            } else {
                System.out.println("Geçersiz şifre");


            }

        }

        /**
         *         Scanner scan= new Scanner(System.in);
         *         System.out.println("Sifrenizi giriniz : ");
         *         String sifre=scan.next();
         *
         *         char ilkHarf=sifre.charAt(0);
         *
         *         if (ilkHarf>= 'A' && ilkHarf<='Z') {
         *
         *             if(ilkHarf=='A'){
         *                 System.out.println("Gecerli Şifre ");
         *             } else
         *             System.out.println("Geçersiz Şifre");
         *
         *         } else if (ilkHarf>= 'a' && ilkHarf<='z') {
         *             if(ilkHarf=='z'){
         *                 System.out.println("Gecerli Şifre ");
         *             } else
         *             System.out.println("Geçersiz Şifre");
         *
         *         }
         */

   }}
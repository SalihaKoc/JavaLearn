package javaForLife.task01;

import java.util.Scanner;

public class soru7_flag {

    // Soru) Kullanicidan gün ve ismini alin ve haftaici veya haftasonu oldugunu yazdirin.
    // Ornek: gün=Pazar output = "Hafta sonu" - gün=Sali output = "Hafta ici"
    // String icin equals method'unu kullanin.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       // boolean flag = false;
        System.out.println("gün ismini giriniz : ");
        String gun = scan.next().toLowerCase();

        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Hafta sonu");
        } else System.out.println("Hafta içi");


        //if (flag) {
       //    System.out.println("Hafta sonu");
       //} else System.out.println("Hafta içi");

        /**
         *         switch (gun) {
         *             case "pazartesi":
         *             case "salı":
         *             case "çarşamba":
         *             case "perşembe":
         *             case "cuma":
         *                 System.out.println("hafta içi"); break;
         *             case "cumartesi":
         *             case "pazar":
         *                 System.out.println("hafta sonu"); break;
         *             default :
         *                 System.out.println("hatalı giriş");
         *         }
         */

    }
}

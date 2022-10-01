package javaForLife.task02;

import java.util.Scanner;

public class q8_ {
    /*Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
    isim-soyisim : M***** B*******
    kart no : **** **** **** 1234*/

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("isim ve soyisim giriniz :");
        String isim=scan.nextLine().toUpperCase();
        String soyisim=scan.nextLine().toUpperCase();

        System.out.println("kart no giriniz : ");
        String kart=scan.nextLine();

        System.out.println(isim.charAt(0) + isim.substring(1).replaceAll("\\w", "*"));
       System.out.println(soyisim.charAt(0) + soyisim.substring(1).replaceAll("\\w","*"));
        System.out.println(("**** **** **** " + kart.substring(12)));

    }

}

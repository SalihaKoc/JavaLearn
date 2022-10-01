package javaForLife.task02;

import java.util.Scanner;

public class aa {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz : ");
        String kelime=scan.nextLine();
        String kelime1=scan.nextLine();

        System.out.println("bir kelime giriniz : ");
        String kart=scan.next();

        System.out.println(kelime.toUpperCase().charAt(0) + kelime.substring(1).replaceAll("\\w", "*"));
        System.out.println(kelime1.toUpperCase().charAt(0) + kelime1.substring(1).replaceAll("\\w", "*"));



    }

}

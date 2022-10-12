package javaForLife.task01;

import java.util.Scanner;

public class soru6 {

    // Soru 1) Kullanicidan dikdörtgen kenar uzunluklarini isteyin ve
    // dikdörtgen kare olup olmadigini yazdirin.


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("kısa kenar uzunluğu : ");
        int a= scan.nextInt();
        System.out.println("uzun kenar uzunluğu : ");
        int b= scan.nextInt();

        if (a==b) {
            System.out.println("kare");
        } else System.out.println("dikdörtgen");

        //System.out.println(a == b ? "kare" : "dikdörtgen");

    }
}

package day01;

import java.util.Scanner;

public class Q08_Scanner {

    public static void main(String[] args) {

        // kullanicidan 2 tam sayi alin
        // bu tam sayilari toplayin ve sonucu yazdirin

        Scanner scan=new Scanner (System.in);
        System.out.print("Birinci Sayı Giriniz = ");
        int sayi1= scan.nextInt();
        System.out.print("İkinci Sayı Giriniz = ");
        int sayi2= scan.nextInt();

        int sum=sayi1+sayi2;
        System.out.println("sum = " + sum);

    }
}

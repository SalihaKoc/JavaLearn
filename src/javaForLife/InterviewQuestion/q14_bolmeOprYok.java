package javaForLife.InterviewQuestion;

import java.util.Scanner;

public class q14_bolmeOprYok {

    //Write a method that can divide two numbers without using division operator

    public static void main(String[] args) {

       // Scanner scan=new Scanner(System.in);
       // System.out.println("iki adet sayı giriniz : ");
       // int sayi1= scan.nextInt();
       // int sayi2=scan.nextInt();

        int sayi1=25;
        int sayi2=5;

        if (sayi2 == 0) {
            System.out.println("sıfıra bölünmez");
        }else if (sayi1<sayi2) {
            System.out.println(sayi1+" "+sayi2+" ye bölünmez");
        }
        else {
            int sayac = 0;
            while (sayi1 >= sayi2) {
                sayi1 -= sayi2;
                sayac++;
            }
            System.out.println(sayac + " kere var kalan " + sayi1);
        }
    }
}
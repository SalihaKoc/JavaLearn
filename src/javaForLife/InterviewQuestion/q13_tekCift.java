package javaForLife.InterviewQuestion;

import java.util.Scanner;

public class q13_tekCift {

    //Write a method which can identifies given number is even or odd

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi= scan.nextInt();
        System.out.println(sayi+" = " + tekMiCiftMi(sayi));

        String sonuc= sayi%2==0 ? "Çift" : "Tek";
        System.out.println(sonuc);
    }

    private static String tekMiCiftMi(int sayi) {

        if(sayi%2==0) {
            return "çift sayı";
        }else
        return "tek sayı";
    }
}

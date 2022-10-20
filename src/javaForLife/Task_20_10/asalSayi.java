package javaForLife.Task_20_10;

import jdk.swing.interop.DragSourceContextWrapper;

import java.util.Scanner;

public class asalSayi {

  //  Kullanıcıdan sayı isteyin. Alınan sayının asal sayı olup olmadığını yazdırın.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int sayi=scan.nextInt();

        int sayac=0;
        for (int i = sayi; i >0; i--) {
            if (sayi%i==0) {
                sayac++;
            }
        }
        if (sayac>2) {
            System.out.println(sayi+" sayısı asal değildir");
        } else System.out.println(sayi+" sayısı asaldır");


    }
}

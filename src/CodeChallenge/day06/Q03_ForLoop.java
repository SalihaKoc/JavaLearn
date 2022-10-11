package CodeChallenge.day06;

import java.util.Scanner;

public class Q03_ForLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int sayi = scan.nextInt();
        int sayac = 0;


       //while (sayi != 0) {
       //    if (sayi % 2 != 0) {
       //        System.out.print(sayi + " ");
       //        sayac++;
       //    }
       //    sayi--;
       //}
       //System.out.println();
       //System.out.println(sayac + " adet tek sayı ");

            for (int i = 0; i <= sayi; i++) {

                if (i % 2 != 0) {
                    System.out.print(i + " ");
                    sayac++;
                }
            }
            System.out.println();
            System.out.println(sayac + " adet tek sayı ");

        }


    }

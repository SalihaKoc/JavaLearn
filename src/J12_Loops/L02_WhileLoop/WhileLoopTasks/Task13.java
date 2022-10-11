package J12_Loops.L02_WhileLoop.WhileLoopTasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
        do-while lopp
         */

        Scanner scan = new Scanner(System.in);

        char karakter;

        do {
            System.out.println("Bir karakter giriniz : ");
            karakter = scan.next().toLowerCase().charAt(0);
            if (karakter=='x') {
                System.out.println("JAVATAR");
            } else System.out.println("javaCan");
        }while (karakter!='x');

     //char girKar;
     //do {
     //    System.out.print("Bir karakter giriniz : ");
     //    girKar = scan.next().charAt(0);
     //    System.out.println(girKar == 'x' ? "jAVATAR" : "javaCAN");
     //}while (girKar != 'x');
    }


    }


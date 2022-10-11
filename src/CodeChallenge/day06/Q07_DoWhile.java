package CodeChallenge.day06;

import java.util.Scanner;

public class Q07_DoWhile {

    /*
     Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
     ve x girildiğinde ise "Program bitti" yazan programı yazınız.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char karakter;

        do {
            System.out.println("karakter giriniz : ");
            karakter = scan.next().toLowerCase().charAt(0);
            if (karakter=='x') {
                System.out.println("program bitti");
            } else System.out.println("program çalışıyor");
        }while (karakter!='x');

        /**
         do{
         System.out.print("harf giriniz :");
         c=scan.next().toLowerCase().charAt(0);
         System.out.println("Program calisiyor");
         }while (c!='x');
         System.out.println("Program bitti");
         }
         */

scan.close();
    }
}

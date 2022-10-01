package J04_AritmeticOperators.KolayArtimetikTask;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */
        Scanner scan = new Scanner (System.in);

        System.out.println("Dört adet sayı giriniz : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        System.out.println("4 Sayının Farkı : "+ (num1-num2-num3-num4));

    }
}

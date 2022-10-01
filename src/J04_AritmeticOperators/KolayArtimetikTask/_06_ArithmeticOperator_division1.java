package J04_AritmeticOperators.KolayArtimetikTask;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /*    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         bölümünü print eden code create ediniz. */

        Scanner scan = new Scanner (System.in);

        System.out.println("İki adet sayı giriniz : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("2 Sayının Bölümü : "+ (num1/num2));
    }
}

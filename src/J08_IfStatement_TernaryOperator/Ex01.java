package J08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

         /*
        Task01 girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int sayi=scan.nextInt();
        if (sayi>0) {
            System.out.println("Sayı pozitif");
        }
        else if(sayi<0) {

            System.out.println("sayı negatif"); }

        else { System.out.println("Sayı Sıfır"); }
        }

    }


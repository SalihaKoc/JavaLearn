package J04_AritmeticOperators.KolayArtimetikTask;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */

        Scanner scan = new Scanner (System.in);

        System.out.println("Üç adet double sayı giriniz : ");
        double num1 = scan.nextDouble() ;
        double num2 = scan.nextDouble() ;
        double num3 = scan.nextDouble();
        double sonuc= num1*num2*num3 ;

        System.out.println("3 Double Sayının Çarpımı  : "+ sonuc);

    }
}

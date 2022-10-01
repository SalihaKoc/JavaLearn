package J04_AritmeticOperators.KolayArtimetikTask;

import java.util.Scanner;

public class _09_ArithmeticOperator_multiply2 {

    public static void main(String[] args) {

    /*    Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.   */

        Scanner scan = new Scanner (System.in);

        System.out.println("4 adet double sayı giriniz : ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble() ;
        double num3 = scan.nextDouble();
        double num4 = scan.nextDouble();
        double sonuc= num1*num2*num3*num4 ;

        System.out.println("4 Double Sayının Çarpımı  : "+ sonuc);


    }
}

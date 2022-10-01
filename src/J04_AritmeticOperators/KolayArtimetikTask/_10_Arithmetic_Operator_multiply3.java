package J04_AritmeticOperators.KolayArtimetikTask;

import java.util.Scanner;

public class _10_Arithmetic_Operator_multiply3 {

    public static void main(String[] args) {

        /* Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın. */


        Scanner scan = new Scanner (System.in);

        System.out.println("4 adet integer sayı giriniz : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int sonuc= num1*num2*num3*num4;

        System.out.println("4 Integer Sayının Çarpımı  : "+ sonuc);



    }
}

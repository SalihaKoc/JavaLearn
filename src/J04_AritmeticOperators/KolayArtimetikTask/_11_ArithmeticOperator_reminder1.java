package J04_AritmeticOperators.KolayArtimetikTask;

import java.util.Scanner;

public class _11_ArithmeticOperator_reminder1 {

    public static void main(String[] args) {

        /*  Verilen int ler hakkında (num1, num2),
            num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
            int sonucu yazdırın.  */
        Scanner scan = new Scanner (System.in);

        System.out.println("2 adet integer sayı giriniz : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int kalan= num1%num2;

        System.out.println("2 Sayının Bölümünden Kalan  : "+ kalan);


    }
}

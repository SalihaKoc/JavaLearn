package J12_Loops.L02_WhileLoop.WhileLoopTasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */

        Scanner scan = new Scanner(System.in);
        int toplam=0;
        int adet=0;
        while (toplam<=333) {
            System.out.print("Sayı Giriniz : ");
            int sayi= scan.nextInt();
            toplam += sayi;
            adet++;

        } System.out.println((adet)+" sayının " +" toplamı = "+ (toplam));

    }
}

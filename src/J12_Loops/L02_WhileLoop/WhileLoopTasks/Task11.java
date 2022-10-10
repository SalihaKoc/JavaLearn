package J12_Loops.L02_WhileLoop.WhileLoopTasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz : ");
        int sayi=scan.nextInt();
        int adet=1;
        int toplam=0;
        while (sayi!=0) {
            adet++;
            toplam+=sayi;
            sayi=scan.nextInt();
        }
        System.out.println(adet +" sayının toplamı = "+ toplam);

    }
}

package J12_Loops.L02_WhileLoop.WhileLoopTasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Beş adet sayı giriniz : ");
        int adet=1;
        int enBuyuk=0;
        while (adet<=5) {
            int sayi=scan.nextInt();
            enBuyuk = Math.max(enBuyuk, sayi);
            adet ++;
        }
        System.out.println("En büyük sayı : "+enBuyuk);
    }
}

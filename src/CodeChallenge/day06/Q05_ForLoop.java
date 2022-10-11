package CodeChallenge.day06;

import java.util.Scanner;

public class Q05_ForLoop {

    /* Kullanicidan sayilar girmesini isteyin
     * ve girdigi sayilari toplayip yazdirin.
     * yeni sayi isteyin
     * girilen sayilarin toplami 100 'u gecerse
     * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       // System.out.println("Sayılar Giriniz : ");
        int adet=0;
        int toplam=0;

        while (toplam<100) {
            System.out.print("Sayı Giriniz : ");
            int sayi =scan.nextInt();
            toplam+=sayi;
            adet++;
        }
        System.out.println(adet+" kere sayi girdin, toplamı = "+toplam);

        /**

         for (int i = 0; i < 100; i++) {
         System.out.print("sayi giriniz : ");
         count++;
         int sayi = scan.nextInt();
         toplam+=sayi;
         if (toplam>100){
         System.out.println(count + " kere sayi girdin. Bu kadar sayi yeter ");
         break;
         }
         System.out.println("toplam = " + toplam);
         }
         */

        scan.close();
    }
}

package J09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Onlar Basamağını Öğrenmek İstediğiniz Sayıyı Giriniz = ");
        int sayi = sc.nextInt();

        int onlar = (sayi/10)%10 ;

        switch (onlar) {
            case 0: System.out.println("Onlar Basamağı SIFIR"); break;
            case 1: System.out.println("Onlar Basamağı BİR"); break;
            case 2: System.out.println("Onlar Basamağı İKİ"); break;
            case 3: System.out.println("Onlar Basamağı ÜÇ"); break;
            case 4: System.out.println("Onlar Basamağı DÖRT"); break;
            case 5: System.out.println("Onlar Basamağı BEŞ"); break;
            case 6: System.out.println("Onlar Basamağı ALTI"); break;
            case 7: System.out.println("Onlar Basamağı YEDİ"); break;
            case 8: System.out.println("Onlar Basamağı SEKİZ"); break;
            case 9: System.out.println("Onlar Basamağı DOKUZ"); break;

            default:
                System.out.println("Hatalı Giriş...");

        }




    }
}

package J09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
    // 2- Girilen 3 basamaklı sayıyı kelime olarak print eden code create ediniz..

        Scanner scan = new Scanner(System.in);
        System.out.print("üç basamaklı sayi giriniz :");
        int sayi = scan.nextInt();
        int birler = sayi%10;
        int onlar = (sayi/10)%10;
        int yuzler=sayi/100;
        if (sayi>99 && sayi<1000){
            switch (yuzler) {
                case 1: System.out.print("Yüz"); break;
                case 2: System.out.print("İkiYüz"); break;
                case 3: System.out.print("ÜçYüz"); break;
                case 4: System.out.print("DörtYüz"); break;
                case 5: System.out.print("BeşYüz"); break;
                case 6: System.out.print("AltıYüz"); break;
                case 7: System.out.print("YediYüz"); break;
                case 8: System.out.print("SekizYüz"); break;
                case 9: System.out.print("DokuzYüz"); break;
                default: System.out.print("Hata");  break;

            }
            switch (onlar) {
                case 0 : System.out.print("");break;
                case 1: System.out.print("On");break;
                case 2: System.out.print("Yirmi"); break;
                case 3: System.out.print("Otuz"); break;
                case 4: System.out.print("Kırk");break;
                case 5: System.out.print("Elli");break;
                case 6: System.out.print("Altmış"); break;
                case 7: System.out.print("Yetmiş"); break;
                case 8: System.out.print("Seksen");break;
                default: System.out.print("Doksan");break;

            }
            switch (birler) {
               // case 0: System.out.print(""); break;
                case 1: System.out.print("Bir"); break;
                case 2: System.out.print("İki");break;
                case 3: System.out.print("Üç");break;
                case 4: System.out.print("Dört"); break;
                case 5: System.out.print("Beş"); break;
                case 6: System.out.print("Altı");break;
                case 7: System.out.print("Yedi");break;
                case 8: System.out.print("Sekiz"); break;
                case 9: System.out.print("Dokuz"); break;

            }

        } else System.out.println("Lütfen Üç Basamaklı Sayı");


    }
}

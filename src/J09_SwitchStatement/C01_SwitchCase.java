package J09_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {

    public static void main(String[] args) {

        /*
    witch Case deyimi islev bakimindan if deyimine çok benzemektedir.
    ok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
    rogrami izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
    karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
    ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
    Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
    Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
    çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
    Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

    ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
    */

        //TASK -> kullanıcının girdiği rakamı yazı ile print eden code

        Scanner scan = new Scanner(System.in);
        System.out.print("Rakam Giriniz : ");
        int rakam= scan.nextInt();

        System.out.println("   *** if-else   ***   ");
        if (rakam == 0) {
            System.out.println("girilen rakam SIFIR");
        } else if (rakam == 1) {
            System.out.println("girilen rakam BİR");
        } else if (rakam == 2) {
            System.out.println("girilen rakam İKİ");
        } else if (rakam == 3) {
            System.out.println("girilen rakam ÜÇ");
        } else if (rakam == 4) {
            System.out.println("girilen rakam DORT");
        } else if (rakam == 5) {
            System.out.println("girilen rakam BEŞ");
        } else if (rakam == 6) {
            System.out.println("girilen rakam ALTI");
        } else if (rakam == 7) {
            System.out.println("girilen rakam YEDİ");
        } else if (rakam == 8) {
            System.out.println("girilen rakam SEKİZ");
        } else if (rakam == 9) {
            System.out.println("girilen rakam DOKUZ");
        } else System.out.println("agam adam gibi rakam gir :(");

        System.out.println("   ***  switch case   ***   ");

        switch (rakam) {
            case 0 :
                System.out.println("Girdiğiniz rakam sıfır"); break ;
            case 1 :
                System.out.println("Girdiğiniz rakam bir"); break;
            case 2 :
                System.out.println("Girdiğiniz rakam iki"); break;
            case 3 :
                System.out.println("Girdiğiniz rakam üç"); break;
            case 4 :
                System.out.println("Girdiğiniz rakam dört"); break;
            case 5:
                System.out.println("Girdiğiniz rakam beş"); break;
            case 6 :
                System.out.println("Girdiğiniz rakam altı"); break;
            case 7 :
                System.out.println("Girdiğiniz rakam yedi"); break;
            case 8 :
                System.out.println("Girdiğiniz rakam sekiz"); break;
            case 9 :
                System.out.println("Girdiğiniz rakam dokuz"); break;
                    default :
                        System.out.println("Rakam girmelisiniz...");

        }
    }
}
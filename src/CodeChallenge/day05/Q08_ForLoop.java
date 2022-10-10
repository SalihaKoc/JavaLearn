package CodeChallenge.day05;

import java.util.Scanner;

public class Q08_ForLoop {

    public static void main(String[] args) {

        // Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum
        // tamsayilari toplayip, sonucu yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int sayi1=scan.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        int sayi2=scan.nextInt();

        int toplam=0;

        if (sayi1<sayi2){
            for (int i = sayi1; i <=sayi2 ; i++) {
                toplam+=i;
            }
            System.out.println(sayi1+" ile "+sayi2+" arasındaki sayılar toplamı = "+toplam);
        } else if (sayi1>sayi2){
            for (int i = sayi2; i <=sayi1 ; i++) {
                toplam+=i;
            }
            System.out.println(sayi1 +" ile "+sayi2 +" arasındaki sayılar toplamı = "+toplam);
        } else {
            System.out.println("sayılar eşittir");

        }

        /* Cuneyt bey den
        int sayi1 = scan.nextInt();
        int sayi2= scan.nextInt();
        int toplam=0;
        for (int i = (sayi1<sayi2 ? sayi1 : sayi2); i<= (sayi1>sayi2 ? sayi1 : sayi2); i++) {
            toplam+=i;
        }System.out.println("toplamları = " + toplam);
     */

        scan.close();
    }
}

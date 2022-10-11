package J13_Break_Continue.HaftanınTaskiii;

import java.util.Scanner;

public class T01_TopZiplamaMesafeSayisii {

       /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {

        topyuks();

    }
    private static void topyuks() {

        Scanner scan=new Scanner (System.in);
        System.out.println("Santimetre olarak yükseklik giriniz : ");
        double yuks=scan.nextDouble();
        double toplam = 0; int sayac=0;

       while (yuks>1000){
            yuks=yuks*3/4;
            toplam+=yuks;
            sayac++;
        }
        System.out.println(sayac + " kere zıpladı ve aldığı toplam yol = " + (toplam/1000)+ " m");
    }


}

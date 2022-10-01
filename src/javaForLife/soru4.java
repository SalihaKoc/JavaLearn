package javaForLife;

import java.util.Scanner;

public class soru4 {

    /*Verilen iki sayinin (sifirdan büyük veya sifira esit) toplamini hesaplayan ve yazdiran bir Java programi yazin.
    Verilen tamsayilar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdirin.
    Ornek:
            INPUT :
            25
            46
            OUTPUT :
            Numaralarin Toplami:
            71 */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println ("Birinci Sayıyı Giriniz : ");
        double d1=scan.nextDouble();

        System.out.println ("İkinci Sayıyı Giriniz : ");
        double d2=scan.nextDouble();

        double toplam=d1+d2;

        if (d1>=Math.pow(10,10) || d2>=Math.pow(10,10) || toplam>=Math.pow(10,10)) { //10,10 == 10 üzeri 10

            System.out.println("Owerflov");
        } else System.out.println("Toplam = " + toplam);
    }

//System.out.println(Integer.MAX_VALUE);
}

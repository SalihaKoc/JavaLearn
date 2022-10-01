package J08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {

    public static void main(String[] args) {

        // TASK-> girilen bir pozitif tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.

        Scanner scan= new   Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
         int sayi= scan.nextInt();

        System.out.println(sayi > 9 ? "Sayı iki basamaktan fazla" : "Sayı tek basamaklı");

        String sonuc=((sayi > 9 || sayi<-9) ? "Sayı iki basamaktan fazla" : "Sayı tek basamaklı");
        System.out.println(sonuc);

        int barısınolumyili=1999;
        System.out.println(barısınolumyili);


    }
}

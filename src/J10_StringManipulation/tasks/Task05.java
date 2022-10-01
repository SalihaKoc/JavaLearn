package J10_StringManipulation.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {

    /* Task->
    Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
     */

        Scanner scan=new Scanner(System.in);

        System.out.println("Adınızı girin : ");
        String ad=scan.nextLine();
        System.out.println("Soyadınızı girin : ");
        String soyad=scan.nextLine();

        System.out.println("Ad-Soyad : " + (ad.toUpperCase().charAt(0) + ad.substring(1))+" "+(soyad.toUpperCase().charAt(0) + soyad.substring(1)));



    }
}

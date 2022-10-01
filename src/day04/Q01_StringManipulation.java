package day04;

import java.util.Scanner;

public class Q01_StringManipulation {

    //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("İsminizi ve soyisminizi giriniz : ");
        
        String firstName=scan.nextLine(), surName=scan.nextLine();
        
        String fullName= firstName.concat(" "+surName).toUpperCase();

        System.out.println("fullName = " + fullName);

    }

}

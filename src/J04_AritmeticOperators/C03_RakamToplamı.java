package J04_AritmeticOperators;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C03_RakamToplamı {
    public static void main(String[] args) {

        //kulanıcıdan alınan 3 basamaklı bir sayının rakamları toplamını print eden code create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.print("3 Basamaklı Sayı Giriniz : ");
        int sayi=scan.nextInt();
        int Birler= sayi%10;
        sayi/=10;
        int Onlar=sayi%10;
        int Yüzler= sayi/10;
        int rakamtoplamı= Birler+Onlar+Yüzler;
        System.out.println("Rakam Toplamı : "+ rakamtoplamı);
    }
}

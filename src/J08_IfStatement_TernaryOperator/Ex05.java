package J08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
/*
        TASK -> girilen iki sayiyi seçilen dört işlemden birine uygulayıp sonucu print eden code crate ediniz
  */
        Scanner scan=new Scanner(System.in);

        System.out.println("1. sayıyı giriniz : ");

        double sayi1= scan.nextDouble();
        System.out.println("2. sayıyı giriniz : ");

        double sayi2= scan.nextDouble();

        System.out.println("işlem seçiniz : ");
        char islem=scan.next().charAt(0);

        if (islem=='+') System.out.println("Toplam = " + (sayi1+sayi2));
        else if (islem=='-') System.out.println("Çıkarma = " + (sayi1-sayi2));
        else  if (islem=='*') System.out.println("Çarpma = " +(sayi1*sayi2));
        else if (islem=='/') System.out.println("Bölme = "+ (sayi1/sayi2));
        else System.out.println("yanlış işlem girdiniz");


    }
}

package J04_AritmeticOperators.AritmeticOperatorTask;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("3 Basamaklı Sayı Giriniz :  ");
        int sayi=scan.nextInt();
        int BirlerBasamağı= sayi%10;
        int YüzlerBasamağı= sayi/100;
        int OnlarBasamağı=( (sayi- (YüzlerBasamağı*100+BirlerBasamağı*1))/10);

        // sayi/=10 -> sayı 10 bölümünden bölümü verir 853/10=85
        // int OnlarBasamagı==sayi%10; ->85in 10a bölümünden kalan =5
        // int YüzlerBasamagı= sayi/10; ->85in 10a bölümü =8

        System.out.println("Girdiğiniz sayının birler basamağı : "+BirlerBasamağı+ "\nGirdiğiniz sayının onlar basamağı : "+OnlarBasamağı+"\nGirdiğiniz sayının yüzler basamağı : "+YüzlerBasamağı);



    }
}

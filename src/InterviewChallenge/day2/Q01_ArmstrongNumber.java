package InterviewChallenge.day2;

import java.util.Scanner;

public class Q01_ArmstrongNumber {

    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
      gösteren program yazınız */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi= scan.nextInt();

        armstrong(sayi);
        girilenSayiyaKadarArmstrong(sayi);

    }

    private static void girilenSayiyaKadarArmstrong(int sayi) {

        for (int i = 0; i <= sayi; i++) {
            armstrong(i);
        }
    }

    private static void armstrong(int sayi) {

        int kupleriToplami=0;
        int basamaktakiSayi=0;
        int girilenSayi=sayi;

        while (sayi>0) {
            basamaktakiSayi=sayi%10; //her bir rakama erismek icin
            kupleriToplami+=basamaktakiSayi*basamaktakiSayi*basamaktakiSayi;
            sayi=sayi/10; //basamak sayısısnı eksiltmek icin
        }

        if (girilenSayi==kupleriToplami) {
            System.out.println(girilenSayi + " armstrong sayıdır");
        }else
        System.out.println(girilenSayi+" armstrong değildir");
    }
}

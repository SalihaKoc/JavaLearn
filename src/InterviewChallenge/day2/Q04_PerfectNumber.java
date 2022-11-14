package InterviewChallenge.day2;

import java.util.Scanner;

public class Q04_PerfectNumber {

    /* Perfect Number (Mukemmel sayi)
  Kullanici tarafindan bir sayiya kadar olan sayilarin,
  mukemmel olup olmadigini bulan method yaziniz.
  Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
  kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
  ORNEK: (6, 28, 496, 8128)
  INPUT      : 6
  OUTPUT     :  1,2,3
    */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi= scan.nextInt();

        perfectNumber(sayi);
        girilenSayiyaKadarOlanPerfect(sayi);

        scan.close();
    }

    private static void girilenSayiyaKadarOlanPerfect(int sayi) {
        int toplam=0;
        for (int i = 1; i < sayi; i++) { //girilen sayıya bakar
            for (int j = 1; j < i; j++) { //burada bölenler kontrol edilir
                if (i%j==0) { //sayının herhamgi bir böleni varsa
                    toplam+=j; //bölenleri toplama ekler
                }
            }
            if (toplam==i) {
                System.out.println(i + " mükemmel sayıdır");
            }
            toplam=0;
        }
    }

    private static void perfectNumber(int sayi) {

        int toplam=0;
        for (int i = 1; i < sayi; i++) { //1den baslayarak bolenleri kkontrol edecegiz, sayı dahil değil
            if (sayi%i==0) {
                toplam+=i;
                System.out.print(i+" "); //bolenleri gormek için
            }
        }
        System.out.println();
        if (toplam == sayi) { //bolenlerin toplamı sayıya esitse
            System.out.println(sayi+" sayısı mükemmel sayıdır");
        } else System.out.println(sayi+" sayısı mükemmel sayı değildir");
        }
    }

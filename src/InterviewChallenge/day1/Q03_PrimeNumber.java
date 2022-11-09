package InterviewChallenge.day1;

import java.util.Scanner;

public class Q03_PrimeNumber {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Pozitif bir sayı giriniz : ");
        int sayi = scan.nextInt();

        int sayac = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        if (sayac > 2) {
            System.out.println("Sayı asal değildir");
        } else System.out.println("Sayı asaldır");

        boolean flag = true;
        if (sayi >= 2) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) System.out.println("sayi asaldir");
            else System.out.println("sayi asal degildir");
        } else System.out.println("sayi asal degildir");// 0, 1 ve negatif sayılar icin calisan kod satiri

        scan.close();
    }
}

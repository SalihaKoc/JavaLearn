package CodeChallenge.day06;

import java.util.Scanner;

public class Q01_WhileDoWhile {

    public static void main(String[] args) {

        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz : ");
        int sayi =scan.nextInt();

        System.out.println(rakamTopla(sayi));

    }
    private static int rakamTopla(int sayi) {

        int toplam=0;
        while (sayi!=0) {
            toplam+=sayi%10;
            sayi/=10;
        }
        return toplam;
    }

    //do while
    //for ile çöz

}


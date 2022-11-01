package CodeChallenge.day09;

import java.util.Scanner;

public class Q05_Varargs {

    public static void main(String[] args) {

    // istedigimiz kadar sayi girdigimizde
    // toplamlari bize veren bir method yazalim...

        sayilariTopla(5,9,-12,0,100,8,3);
    }

    private static void sayilariTopla(int...sayi) {
        int toplam=0;
        for (int i:sayi) {
            toplam+=i;
        }
        System.out.println("toplam = " + toplam);
    }
}

package J12_Loops.L02_WhileLoop.WhileLoopTasks;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        int randomSayi = (int) (Math.random() * 100);
        int say = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int sayi = scan.nextInt();
        while (sayi != randomSayi) {
            if (sayi < randomSayi) {
                System.out.println("büyült");
                sayi = scan.nextInt();
                say++;
            } else System.out.println("küçült");
            sayi = scan.nextInt();
            say++;
        }
        System.out.println(say + " tahminde buldunuz");

    }

}

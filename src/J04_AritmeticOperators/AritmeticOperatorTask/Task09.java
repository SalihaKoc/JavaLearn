package J04_AritmeticOperators.AritmeticOperatorTask;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Çiftlikteki inek sayısını giriniz : ");
        int inek = scanner.nextInt();
        System.out.println("Çiftlikteki koyun sayısını giriniz : ");
        int koyun = scanner.nextInt();
        System.out.println("Çiftlikteki tavuk sayısını giriniz : ");
        int tavuk = scanner.nextInt();
        int toplamayaksayisi = (inek * 4 + koyun * 4 + tavuk * 2);
        System.out.println("Çiftlikteki Toplam Ayak Sayısı : "+toplamayaksayisi);

    }

}





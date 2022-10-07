package J12_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {

    public static void main(String[] args) {

        //task -Z girilen sayı 17den küçükse kazandınız büyükse kaybettiniz do while loop ile print eden code

        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int sayi= scan.nextInt();

        do {
            System.out.println(sayi + " için kaybettiniz");
                sayi++;
        } while (sayi<=17);
        System.out.println(sayi +" için kazandınız");

    }
}

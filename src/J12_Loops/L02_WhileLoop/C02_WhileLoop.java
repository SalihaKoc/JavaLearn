package J12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {

    public static void main(String[] args) {

        //task-> girilen tam sayının rakamları toplamını print eden code

        Scanner scan = new Scanner(System.in);
        System.out.println("Tam sayı giriniz : ");
        int sayi= scan.nextInt();
        System.out.println("rakamların toplamı = " + rakamTopla(sayi));

        scan.close();
    }
    private static int rakamTopla(int sayi) {

        int rakamToplamı=0;
        while (sayi>0) { //sayı 1 olana dek body action çalış
            rakamToplamı+=sayi%10; //sayıjın birler basamağı rakamToplamına eklendi
            sayi/=10; //sayı 1 basamak eksiltildi
        }
        return rakamToplamı;

    }

}

package J11_MethodCreation.methodCreationsTasks;

import java.util.Scanner;

public class Task07_enKucuk {

    public static void main(String[] args) {

    /* Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34
    Beklenen Çıktı:
    12
    */
        Scanner scan = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.print("3. Sayıyı giriniz: ");
        int sayi3 = scan.nextInt();

        enKucuk(sayi1,sayi2,sayi3);

    }

    public static void enKucuk (int i, int j, int k){

        int enkucuk = i;

        if(j < enkucuk) {
            enkucuk = j;
        }
        if(k < enkucuk) {
            enkucuk = k;
        }

        System.out.println("Sayıların en enkucugu = " + enkucuk);

    }



    }


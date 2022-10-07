package J12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {

    public static void main(String[] args) {

        //task-> girilen tamsayının pozitif tam bölen sayısını print eden code
        //20 ->1,2,4,5,10,20 : 20'nin 6 tane böleni var

        Scanner scan = new Scanner(System.in);
        System.out.println("Tam sayı giriniz : ");
        int sayi= scan.nextInt();

        int bolenSayi=1;
        int tamBolenAdedi=0;
        while (bolenSayi<=sayi) {
            if (sayi%bolenSayi==0) { //sayı bölen sayıya tam bölünme şartı
                tamBolenAdedi++;
                System.out.print(bolenSayi+" ");
            }
            bolenSayi++; //loop sonsuza düşmemesi için ve diğer sayıların böldüğü kontrol edilmesi için
        }
        System.out.println("-> Girilen sayı "+sayi+" nın "+tamBolenAdedi+" tane tam böleni var");
        scan.close();
    }
}

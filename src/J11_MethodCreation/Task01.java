package J11_MethodCreation;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        //task-> girilen iki sayının eşitliğini kontrol eden method create edin

        Scanner scan=new Scanner(System.in);
        System.out.println("ilk sayı girin : ");
        int sayi1= scan.nextInt();;
        System.out.println("ikinci sayı girin : ");
        int sayi2= scan.nextInt();

        System.out.println(esitKontrol(sayi1, sayi2));
        System.out.println(esitKontrol(3, 5));
        System.out.println(esitKontrol(33, 33));

        esitKontrol1(56,67);
       esitKontrol1(61,61);
       esitKontrol1(sayi1,sayi2);

    }

    private static boolean esitKontrol(int sayi1, int sayi2) {
         boolean esitMi;
         if (sayi1==sayi2){
             esitMi=true;
         }else esitMi=false;
         return esitMi;

    }

    public static void esitKontrol1 (int a, int b) {

        if(a==b){
            System.out.println("sayılar EŞİT");
        } else System.out.println("sayılar eşit değil");
    }
}

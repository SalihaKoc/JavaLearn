package J13_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {

    public static void main(String[] args) {

        //task-> girilen tam sayının asal olmasını kontrol eden code

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz : ");
        int sayi=scan.nextInt();

        boolean asalMi=true ;

        for (int i = 2; i < sayi; i++){
            if(sayi%i==0) {
                asalMi=false;
                break;
            }

        }if (asalMi& sayi!=1){
            System.out.println("Girilen sayı asal");
        } else System.out.println("Girilen sayı asal değil");

        }

    }

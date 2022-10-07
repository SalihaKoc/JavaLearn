package J12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {

    public static void main(String[] args) {

        /*
        başlangıç ve bitiş değerleri net(bilinen değerler) olan tekrarlarda for loop ama adım sayısı belli olmayıp bir
        şarta (duruma) bağlı olan tekrarlarda while loop kullanılmalı
         */

        //task01-> 11den 20ye kadar olan tamsayıları print eden code
        System.out.println("   *** for çözüm ***   ");
        for (int i=11; i<=20;i++) {

            System.out.print(i+" " );
        }
        System.out.println("   *** while çözüm ***   ");
        int basla=11;
        while(basla<21) {
            System.out.print(basla +" ");
            basla++;
        }

        //task02-> 7kere javaCan print eden code
        System.out.println("   *** task02 ***   ");
        int yaz=1;
        while (yaz<8){
            System.out.println(yaz+". javaCan");
            yaz++;
        }

       //task03-> 2basmaklı tek sayıları yanyana print eden code
       int tek=11;
        while (tek<100) {
            System.out.print(tek+" ");
            tek+=2;
        }  //if (tek%2==1) System.out.print(tek+" "); b++

        //task04-> girilen metni while loop ile tersten print eden code
        Scanner scan = new Scanner(System.in);
        System.out.println("metin giriniz : ");
        String metin=scan.nextLine();
        int metinUzunluk=metin.length()-1;
        while(metinUzunluk>=0) { //metnin son karakteri 0 q eşit ve büyük iken
            System.out.print(metin.charAt(metinUzunluk));
            metinUzunluk--;
        }

        //task05-> girilen tamsayıya kadar tamsayıların toplamını print eden code
        int sayi=scan.nextInt();
        int top=0;
        while (sayi>0) { //sayı 1 olana dek
            top+=sayi; //her döngüde sayıyı toplama ekle
            sayi--; //her döngüde sayıyı 1 azalt
        }
        System.out.println("toplam = "+top);

        //task06-> girilen tamsayıya kadar faktöriyelini print eden code
        int faktor=1;
        while (sayi>0) {
            faktor*=sayi;
            sayi--;
        }
        System.out.println("faktöriyel = "+faktor);
    }
}

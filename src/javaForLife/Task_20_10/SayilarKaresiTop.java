package javaForLife.Task_20_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SayilarKaresiTop {

    /*
     Bir integer list olusturunuz ve bu list'deki tüm sayilarin karesinin toplamini bulunuz. Sonucu ekrana yazdiriniz.
        (Scanner, while ve for each kullanınız.)
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("kaç elemanlı liste girmek istersiniz : ");
        int boyut=scan.nextInt();

        ArrayList<Integer> sayiList=new ArrayList<>();

        int a=1;
        while (a<=boyut) {
            System.out.print(a +". elemanı giriniz : ");
            sayiList.add(scan.nextInt());
            a++;
        }

       // for (int i = 0; i <boyut ; i++) {
       //     System.out.print((i+1)+". elemanı girin : ");
       //     sayiList.add(scan.nextInt());
       // }

        int karelerToplam=0;
        for (int i : sayiList) {
            karelerToplam+=i*i;
        }
        System.out.println("girdiğiniz sayıların kareleri toplamı = " + karelerToplam);

    }
}

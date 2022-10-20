package CodeChallenge.day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q07_ArrayList {

    public static void main(String[] args) {

        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner scan=new Scanner(System.in);

        System.out.print(" liste uzunluğu giriniz : ");
        int boyut = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < boyut; i++) {
            System.out.print(i+". eleman giriniz = ");
            int sayi = scan.nextInt();
            list.add(sayi);
        }
        System.out.println("liste = " + list);

        List<Integer> tekrarLar=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i)==list.get(j)) {
                    tekrarLar.add(list.get(i));
                }
            }
        }
        System.out.println(tekrarLar);

    }
}

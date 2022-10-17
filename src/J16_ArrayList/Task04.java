package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {

    public static void main(String[] args) {

        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> list1=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));

        ArrayList<String> aOlmayanList=new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if(!list1.get(i).toLowerCase().contains("a")) { //listin her elemanı a bulundurmuyosa
                aOlmayanList.add(list1.get(i)); //yeni list'e a olmayan eleman eklendi
            }
        }
        System.out.println("aOlmayanList = " + aOlmayanList);

        list1.clear(); //list1 boşaltıldı
        list1.addAll(aOlmayanList);
        System.out.println("list1 = " + list1);


    }
}

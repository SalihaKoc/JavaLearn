package J16_ArrayList;

import java.util.*;

public class C02_nCopies {

    public static void main(String[] args) {

        ArrayList<String> listUlke=new ArrayList<>(List.of("Almanya","Amerika","İngiltere","İsveç"));
        ArrayList<String> listSehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm"));

        // nCopies(int, Obj); -> int elemanlı bir

        ArrayList<String >yeniList=new ArrayList<>(Collections.nCopies(3,"javaCAN"));
        System.out.println("yeniList = " + yeniList); // [javaCAN, javaCAN, javaCAN]

        //addAll();-> bir liste diğer listi olduğu gibi ekler

        listUlke.addAll(listSehir); //ülke list sonuna sehir list tamamen eklendi
        System.out.println("listUlke = " + listUlke); //[Almanya, Amerika, İngiltere, İsveç, Munih, LosAngeles, Londra, Stockholm]

        listSehir.addAll(3,listUlke);
        System.out.println("listSehir = " + listSehir); // 3.indexten itibaren ülke listi şehir liste tamamen eklendi

        //task-> 1den 10a kadar sayıları bir liste atıp print eden code

        ArrayList<Integer>sayiList=new ArrayList<>();
        for (int i = 1; i <=10 ; i++) {
            sayiList.add(i);
        }
        System.out.println("sayiList = " + sayiList); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    }
}

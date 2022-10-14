package J16_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C10_Sort_Reverse {

    public static void main(String[] args) {

        //Collections.sort(list); -> verilen listi naturel sıralama return eder
        //Collections.reverse(list); -> verilen listin ters sıralamasını return eder

        ArrayList<String> listUlke=new ArrayList<>(List.of("Almanya","Amerika","Ingiltere","isveç"));
        ArrayList<String> listSehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm"));

        System.out.println("listSehir = " + listSehir); //sıralama öncesi-> [Munih, LosAngeles, Londra, Stockholm]
        Collections.sort(listSehir); //sort(); method sout içinde çalışmaz
        System.out.println("listSehir = " + listSehir); //sıralama sonrası -> [Londra, LosAngeles, Munih, Stockholm]

        Collections.reverse(listSehir);
        System.out.println("listSehir = " + listSehir); //[Stockholm, Munih, LosAngeles, Londra]

        Collections.sort(listUlke); // a>z
        System.out.println("listUlke = " + listUlke); //ters sıra öncesi : [Almanya, Amerika, Ingiltere, isveç]

        Collections.reverse(listUlke); //z>a
        System.out.println("listUlke = " + listUlke); //ters sıra sonrası : [isveç, Ingiltere, Amerika, Almanya]




    }
}

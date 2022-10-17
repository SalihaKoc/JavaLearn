package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_Remove {

    public static void main(String[] args) {

        //remove(); -> listten istenen elemanı siler

        ArrayList<String> listSehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm"));

        System.out.println("listSehir.remove(\"Ankara\") = " + listSehir.remove("Ankara")); //false =olmadığı için false
        System.out.println("listSehir.remove(\"Londra\") = " + listSehir.remove("Londra")); //true =sildi
        System.out.println("listSehir.remove(1) = " + listSehir.remove(1)); //LosAngeles
        System.out.println("listSehir = " + listSehir); //[Munih, Stockholm]
        // System.out.println("listSehir.remove(11) = " + listSehir.remove(11)); //olmayan index eleman silinmesi istenirse RTE

        listSehir.add("Munih");
        listSehir.add("Ankara");
        listSehir.add("Munih");
        System.out.println("listSehir = " + listSehir); //[Munih, Stockholm, Munih, Ankara, Munih]

        listSehir.remove("Munih"); // tekrarlı eleman varsa ilk index silinir diğerlerine dokunulmaz
        System.out.println("listSehir = " + listSehir); // [Stockholm, Munih, Ankara, Munih]


        ArrayList<String>listUlke=new ArrayList<>(List.of("Almanya","Amerika","İngiltere","İsveç"));

        listSehir.addAll(listUlke); //ülkelistin hepsi listsehire eklendi
        System.out.println("listSehir = " + listSehir); //[Stockholm, Munih, Ankara, Munih, Almanya, Amerika, İngiltere, İsveç]

        listSehir.removeAll(listUlke); //listsehirden listulkenin hepsi çıkarıldı
        System.out.println("listSehir = " + listSehir);  //[Stockholm, Munih, Ankara, Munih]


    }
}

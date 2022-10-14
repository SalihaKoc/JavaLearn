package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_IndexOf {

    public static void main(String[] args) {

        //indexOf();-> list içinde istenen elemanın index değerini return eder

        ArrayList<String> listUlke=new ArrayList<>(List.of("Almanya","Amerika","İngiltere","İsveç"));
        ArrayList<String> listSehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm"));

        System.out.println("listSehir.indexOf(\"Londra\") = " + listSehir.indexOf("Londra")); //2
        System.out.println("listSehir.indexOf(\"Londra\") = " + listSehir.indexOf("londra")); //-1 -> case sensitive
        System.out.println("listSehir.indexOf(\"Ankara\") = " + listSehir.indexOf("Ankara")); //-1 -> list'te olmayan eleman indexi -1 return eder

        listUlke.add("Amerika");
        System.out.println("listUlke = " + listUlke); //[Almanya, Amerika, İngiltere, İsveç, Amerika]
        System.out.println("listUlke.indexOf(\"Amerika\") = " + listUlke.indexOf("Amerika")); //1 -> tekrarlı elemanlarda soldan(baştan) ilk bulunan eleman indexi retırn eder
        System.out.println("listUlke.lastIndexOf(\"Amerika\") = " + listUlke.lastIndexOf("Amerika")); //4 -> sondan ilk bulunan elamanın indexi return eder




    }
}

package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_Set {

    public static void main(String[] args) {

        //set(); -> listin istenen indexe istenen elemanı update eder

        ArrayList<String> listSehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm"));

        System.out.println(listSehir.set(3, "Ankara")); //Stockholm-> set edilen değer print edilir
        System.out.println(listSehir); //[Munih, LosAngeles, Londra, Ankara] -> list set edilmiş hali

       // System.out.println(listSehir.set(11, "pataGONYA")); //olmayan index set edilirse RTE verir
        System.out.println(listSehir);

     //  listSehir.set(1,"bursa",2,"izmir"); // -> List te çoklu set metodu çalışmaz.. buz gibi INTERVIEW sorusu.. CTE




    }
}

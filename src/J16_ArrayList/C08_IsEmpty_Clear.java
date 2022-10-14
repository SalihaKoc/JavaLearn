package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_IsEmpty_Clear {

    public static void main(String[] args) {

        //isEmpty(); -> listin boş olmasını kontrol eder, true/false return eder
        //clear(); -> listin bütün elemanlarını siler

        ArrayList<String> listSehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm"));

        System.out.println("listSehir = " + listSehir); //[Munih, LosAngeles, Londra, Stockholm]
        System.out.println("listSehir.isEmpty() = " + listSehir.isEmpty()); // false
        listSehir.clear();
        System.out.println("listSehir = " + listSehir); //listSehir = []
        System.out.println("listSehir.isEmpty() = " + listSehir.isEmpty()); //true

    }
}

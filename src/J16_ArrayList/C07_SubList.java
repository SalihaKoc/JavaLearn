package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_SubList {

    public static void main(String[] args) {

        ArrayList<String> listSehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm","Ankara","Konya"));

        //subList(); -> listin istenen list parçasını return eder..

        System.out.println("listSehir.subList(3,5) = " + listSehir.subList(3, 5)); //[Stockholm, Ankara]-> 3.ve4. index elemanları verir

        ArrayList<String >city=new ArrayList<>(listSehir.subList(2,5) ); //listSehir'den 2,3,4. index elemanları city liste alındı
        System.out.println("city = " + city); //[Londra, Stockholm, Ankara]

    }
}

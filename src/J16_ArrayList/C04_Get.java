package J16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {

    public static void main(String[] args) {

        //get(); -> listte istenen index elemanı return eder (arr[3]-> arr'in 3.indexteki elemanı ver gibi)

        ArrayList<String> listSehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm"));
        System.out.println(listSehir.get(1));//LosAngeles
        System.out.println(listSehir.get(11)); //RTE


    }
}

package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_ReplaceAll_Fill {

    public static void main(String[] args) {

        //replacaAll metodu(); -> listte belirli  bir elemanı belirli bir değer ile update eder

        ArrayList<Integer> listSayi= new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));

        System.out.println("replace öncesi : "+listSayi); //[1, 24, 23, 14, 19, 60, 1, 55, 27, 1, 38]

        Collections.replaceAll(listSayi,1,20); //listSayi'da 1 yerine 20 değeri atandı

        System.out.println("replace sonrası : " +listSayi); //[20, 24, 23, 14, 19, 60, 20, 55, 27, 20, 38]

        //fill(); ->listte tüm elemanları belirli bir değer ile update eder

        Collections.fill(listSayi,33);
        System.out.println("fill 33 : "+listSayi); //[33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33]


    }
}

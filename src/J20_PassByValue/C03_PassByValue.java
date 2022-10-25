package J20_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue {

    public static void main(String[] args) {

        /*
        java non-primitive (Class array list->referans) data türlerinde obj kendisi değil de
        dataları değişirse obj referans ve kendisi değişmediği için dataları değişikliğini kalıcı yapar.
         */

        //task -> list elemanları 24,20,87 iki farklı method ile list elemanlarını update edip print eden code

        //1.method -> with for each
        //2.method -> set()

        List<Integer> list=new ArrayList<>(Arrays.asList(24,20,87));

        System.out.println("method öncesi list = " + list);

        listUpdate1(list);
        listUpdate2(list);

        System.out.println("method sonrası list = " + list); // pass by referans

    }

    public static void listUpdate1(List<Integer>list){

        for (Integer v: list) {
            v*=2;
        }
        System.out.println("list = " + list);
    }

    public static void listUpdate2(List<Integer>list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)*2);
        }
        System.out.println("list = " + list);
    }
}

package javaForLife.Task_20_10;

import java.util.*;

public class tersCevirme {

    //Girilen String'i ArrayList kullanarak ters ceviriniz.

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("string bir değer giriniz : ");
        String metin= scan.nextLine();

        ArrayList<String> metinList = new ArrayList<>(List.of(metin.split("")));
        //Collections.replaceAll(metinList," ","");

        System.out.println(metinList);

        for (int i = metinList.size()-1; i >=0 ; i--) {
            System.out.print(metinList.get(i));
        }
    scan.close();
    }
}

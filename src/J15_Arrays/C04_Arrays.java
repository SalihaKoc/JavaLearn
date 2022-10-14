package J15_Arrays;

import java.util.Arrays;

public class C04_Arrays {

    public static void main(String[] args) {

        //Array eşitlik kontrolü... equals() methodu -> index ve value kontrolü yapar ve true/false return eder

        int sayi1[]={39,3,72,63,84};
        int sayi2[]={84,72,63,3,39};

        System.out.println("sayı1 ve sayı2 esit mi : "+Arrays.equals(sayi1, sayi2)); //false

        Arrays.sort(sayi1); //[3,39,63,72,84]
        Arrays.sort(sayi2); //[3,39,63,72,84]
        System.out.println("sayı1 ve sayı2 esit mi : "+Arrays.equals(sayi1, sayi2)); //true

        System.out.println((sayi1[0] == sayi2[0])); //true

        //Array'i stringe çevirme... toString(arr); -> arr'i string data type çevirir

        String str=Arrays.toString(sayi1);
        System.out.println("str = "+str); //str = [3, 39, 63, 72, 84] -> AHAN DA TRICK !!! arrayin tüm karakterleri String olarak tanımlandı

        System.out.println("str uzunluk : "+str.length());
        System.out.println(str.substring(6)); //, 63, 72, 84]

    }
}

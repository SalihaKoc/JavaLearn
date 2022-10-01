package J10_StringManipulation;

import java.util.Scanner;

public class C03_CharAt {

    public static void main(String[] args) {

        /*
        charAt() methodu parametre int olarak girilen index'deki char değerini return eder
        index değeri 0'dan başlar
         */

        String sehir="İstanbul";
        System.out.println("sehir.charAt(3) = " + sehir.charAt(3));

        char besinciIndexKrktr=sehir.charAt(5);
        System.out.println(besinciIndexKrktr);

        //son index karakteri --> lenght()-1

        System.out.println(sehir.charAt(sehir.length() - 1));

        //ilk index karakter --> charAt(0)

        System.out.println(sehir.charAt(0));

        //System.out.println(sehir.charAt(18));
        //TRICK-> charAt() index boyutunu geçerse RTE verir

        //Task -> istanbul kelimesinin / girilen kelimenin ortadaki karalteri

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime girin : ");
        String kelime=scan.nextLine();

        if (kelime.length()%2!=0){
            System.out.println(kelime.charAt((kelime.length()-1) / 2));
        }else System.out.println("girilen kelimenin orta karakteri yoktur");


    }
}

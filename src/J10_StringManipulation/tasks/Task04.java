package J10_StringManipulation.tasks;

import java.util.Scanner;

public class Task04 {

    /*
 Task->
 Girilen iki kelimeden ilki çift sayıda kaqrakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
 ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
 name1= mehmet
 name2= ahmet
 Print ==> mehahmetmet
 */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Birinci kelimeyi girin : ");
        String s1=scan.nextLine();
        System.out.println("İkinci kelimeyi girin : ");
        String s2=scan.nextLine();

        if(s1.length()%2==0) {

            String s1ilk=s1.substring(0,s1.length()/2);
            String s1son=s1.substring(s1.length()/2);
            System.out.println(s1ilk+ s2 + s1son);

        } else System.out.println("kelime2 kelime1 eklenemez");

          //  System.out.println((s1.substring(0, s1.length() / 2) + s2 + (s1.substring(s1.length() / 2))));


    }

}

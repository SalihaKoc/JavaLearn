package J10_StringManipulation;

import java.util.Scanner;

public class C04_Contains {

    public static void main(String[] args) {

        /*
        String içerisinde istenen stringin varlığını kontrol eder boolean return eder
         */

        String s1= "Enise Hanım başarılı bir Qa tester team lead";

        System.out.println(s1.contains("hanım")); //false

        System.out.println(s1.contains("E")); //true

        System.out.println(s1.contains(" ")); //true

        String s2="Qa";
        System.out.println(s1.contains(s2)); //true
        System.out.println(s2.contains(s1)); //false


        //Task -> Girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code
        // Ternary kullanınız...


    }
}



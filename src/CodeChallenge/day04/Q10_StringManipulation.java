package CodeChallenge.day04;

public class Q10_StringManipulation {

    public static void main(String[] args) {

        // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

        String s="   Java ogrenmek123 Cok guzel@      ";

        s=s.replaceAll("\\d","") //   Java ogrenmek Cok guzel@
                .replace("@","") //    Java ogrenmek123 Cok guzel
                .replace("C","c") //   Java ogrenmek123 cok guzel
                .trim(); //Java ogrenmek cok guzel

        System.out.println(s);


    }
}

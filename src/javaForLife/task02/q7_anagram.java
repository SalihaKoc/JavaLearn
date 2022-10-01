package javaForLife.task02;

import java.util.Scanner;

public class q7_anagram {

    //Iki String anagram mi degil mi kontrol ediniz ve method kullanarak yapiniz. | Anagram = Mary ARMY
    //        (Method Creation kullanın)

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("İki String Giriniz : ");
        String str1 = scan.next();
        String str2 = scan.next();

        anagram(str1, str2);

    }

    public static void anagram(String str1, String str2) {

        int toplam = 1;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length() - 1; i++) {

                for (int j = 0; j < str2.length() - 1; j++) {

                    if (str1.charAt(i) == str2.charAt(j)) toplam ++;
                    break;
                }

            }
           if (toplam == str2.length() )
               System.out.println("anagram");
           } else {
               System.out.println("anagram değil");

        }

    }
}
package javaForLife.InterviewQuestion;

import java.util.Scanner;

public class q2 {

    /*
Write a return method that can remove the duplicated values from string
Ex : removeDup("AAABBBCCC") ==> ABC
    */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("String bir değer giriniz : ");
        String str=scan.nextLine().toUpperCase();

        karakterler(str);

    }
    private static void karakterler(String str) {

        for (int i = 0; i < str.length(); i++) {
            int flag=0;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                   flag=1; break;
                }
            }
            if (flag == 0)
                System.out.print(str.charAt(i));
        }

    }

}

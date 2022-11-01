package javaForLife.InterviewQuestion;

import java.util.Scanner;

public class q5 {

    /*
    Write a return method that can find the frequency of characters
    Ex :  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Strin bir değer giriniz : ");
        String str=scan.next().toUpperCase();

        karakterSklk(str);

    }

    private static void karakterSklk(String str) {

        String bosStr="";
        for (int i = 0; i < str.length(); i++) {

            if (bosStr.contains("" + str.charAt(i))) {

            }else bosStr += "" + str.charAt(i);
        }
        for (int i = 0; i < bosStr.length(); i++) {
            int sayac = 0;
            for (int j = 0; j < str.length(); j++) {
                if (bosStr.charAt(i) == str.charAt(j)) {
                    sayac++;
                }
            }
            System.out.print(""+bosStr.charAt(i)+ sayac);
        }
    }
}

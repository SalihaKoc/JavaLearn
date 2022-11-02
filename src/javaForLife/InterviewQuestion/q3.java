package javaForLife.InterviewQuestion;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class q3 {

    /*
    Write a return method that can find the unique characters from the string
    Ex :   unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        for (int i = 0; i < str.length(); i++) {

                if ((str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))))
                {
                    System.out.print(str.charAt(i));
                }
            }
        System.out.println();
        System.out.println("unique(str) = " + unique(str));

    }

    private static String unique(String str) {
        String uni="";
        for (String w: str.split("")) {
            uni+= Collections.frequency(Arrays.asList(str.split("")),w) == 1 ? w: "";
        }
        return uni;
    }


}
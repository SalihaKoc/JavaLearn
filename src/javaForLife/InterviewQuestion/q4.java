package javaForLife.InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class q4 {

    /*
    Write a return method that can reverse string
    x : Reverse("ABCD") ==> DCBA
     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("String bir değer giriniz : ");
        String str= scan.next().toUpperCase();

        for (int i = str.length()-1 ; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        ArrayList <String> str1=new ArrayList<>(Arrays.asList(str.split("")));
        Collections.reverse(str1);
        System.out.println(str1);



    }

}

package CodeChallenge.day05;

import java.util.Scanner;

public class Q06_MetCreationForLoop {

    public static void main(String[] args) {

        /* Interview Question
    Write a Java program to reverse a string. Use for loop and create a method called
    reverseString */
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String str = scan.nextLine();
        System.out.println(terstenYaz(str));
    }
    private static String terstenYaz(String str) {

        String tersiStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
           tersiStr+=str.charAt(i);
        }
        return tersiStr;
    }
}
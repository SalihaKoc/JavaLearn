package J10_StringManipulation.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        //Girilen Stringin son karakteri silen code

        Scanner scan=new Scanner(System.in);

        System.out.println("String girin : ");
        String str=scan.nextLine();

        System.out.println(str.substring(0, str.length() - 1));

       // System.out.println("yeni : " + (s1.replace(s1.charAt(s1.length() - 1) , "")));

    }
}

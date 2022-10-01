package J10_StringManipulation.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

     //Girilen string içindeki istenen indexteki karakteri print eden code

        Scanner scan= new Scanner(System.in);
        System.out.println("String Giriniz : ");

        String str=scan.next();

        System.out.println("İstediğin indexi gir : ");
        int index= scan.nextInt();

        if (index < str.length()) {

            System.out.println(str.charAt(index));

            // System.out.println(str.substring(index, index + 1));

        } else
        System.out.println("yanlış index");


    }
}

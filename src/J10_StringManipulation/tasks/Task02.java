package J10_StringManipulation.tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

/*
    Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
    a)Ilk karakteri buyuk harf olmalı
    b)Son karakteri sayi olamlı
    c)en az 6 karakter uzunlugunda olmalı

 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Password : ");

        String parola = scan.next();

        if ((parola.charAt(0) >= 'A' && parola.charAt(0) <= 'Z') && (parola.charAt(parola.length() - 1) >= '0' && parola.charAt(parola.length() - 1) <= '9') && (parola.length() >= 6))
        {

            System.out.println("Parola Geçerli");

        } else System.out.println("Parola Geçersiz");



    }
}

package javaForLife.task01;

import java.util.Scanner;

public class a1 {

    public static void main(String[] args) {

        /* Kullanicidan isim isteyin. Eger;
		-  isim "a" harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
		-  isim "Z" harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
		-  isim "a" veya "Z" içermiyorsa "Girdiginiz isim a veya Z harfi icermiyor
		*/

        Scanner scan = new Scanner (System.in);
        System.out.println("İsim Giriniz : ");
        String name=scan.nextLine();

        if (name.contains("a")){

            System.out.println("Girdiginiz isim a harfi iceriyor");

        }else if (name.contains("Z")) {

            System.out.println("Girdiginiz isim Z harfi iceriyor");

        } else System.out.println("Girdiginiz isim a veya Z harfi icermiyor");

        scan.close();

        }
    }
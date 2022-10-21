package javaForLife.Task_20_10;

import java.util.ArrayList;
import java.util.Scanner;

public class GarryHcaKod {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Liste icin sayi giriniz.");
        System.out.println("Sayi girisini bitirmek icin 'q' giriniz.");

        int toplam = 0;
        String islem = "";

        while (!islem.equalsIgnoreCase("q")) {
            System.out.println("Sayi giriniz : ");
            islem = scan.nextLine();
            list.add(islem);
        }
        list.remove("q");
        for (String i: list) {
           toplam+= Integer.parseInt(i)*Integer.parseInt(i);
        }
        System.out.println(toplam);

        scan.close();
    }
}
package CodeChallenge.day09;

import java.time.LocalDate;
import java.util.Scanner;

public class Q04_NumberOfDaysInMonths {

    public static void main(String[] args) {

        /*
        Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

        INPUT:
        Ay Numarasi:
        2
        Yil :
        2016
        OUTPUT :
        Subat 2016 29 Gundur.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("yıl giriniz : ");
        int yil =scan.nextInt();
        System.out.print("ay giriniz : ");
        int ay= scan.nextInt();

        LocalDate gun=LocalDate.of(yil,ay,1);
        System.out.println(gun.getYear()+" " + gun.getMonth()+" "+gun.lengthOfMonth()+" days");

        scan.close();
    }
}

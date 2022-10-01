package javaForLife.task02;

import java.util.Scanner;

public class q10 {
    /*Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
	    Girilen kelime cumlede kullanilmamis.
	    Girilen kelime cumlede 1 kere kullanilmis.
	    Girilen kelime cumlede 1’den fazla kullanilmis.*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cümle giriniz : ");
        String cumle = scan.nextLine();
        System.out.println("Bir kelime giriniz : ");
        String kelime = scan.next();

        Scanner sc2 = new Scanner(cumle);
        for(int i = 0; i < 4; i++) {
            sc2.next();
            if (sc2.next().equals(kelime)) {

                System.out.println("Girilen kelime cumlede 1 kere kullanilmis");

                //} else if (cumle.indexOf(kelime) != cumle.lastIndexOf(kelime)){
                //System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis");

            } else System.out.println("Girilen kelime cumlede kullanilmamis");

        }



    }
}


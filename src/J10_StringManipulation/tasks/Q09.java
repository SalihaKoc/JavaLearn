package J10_StringManipulation.tasks;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods: girilen  bir stringin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */

        Scanner scan=new Scanner (System.in);
        System.out.println("String bir ifade giriniz : ");
        String ifade=scan.nextLine().toLowerCase();

        if (ifade.length()%2 == 0) {

               System.out.println(ifade.substring(0, (ifade.length()/2)));

        } else System.out.println("Girdiğiniz ifade tek sayıda karakter içerdiği için bölünemiyor");

scan.close();
    }
}

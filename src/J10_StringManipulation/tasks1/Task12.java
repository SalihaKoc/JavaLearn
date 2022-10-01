package J10_StringManipulation.tasks1;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */

        Scanner scan = new Scanner (System.in);

        System.out.println("3 Kelimelik İsim Giriniz : ");

        String isim=scan.nextLine().toUpperCase();

        System.out.println((isim.charAt(0)) + "." + (isim.charAt(isim.indexOf(" ")+1)) +"."+ (isim.charAt(isim.indexOf(" ",isim.indexOf(" ")+1)+1))+ ".");


    }
}

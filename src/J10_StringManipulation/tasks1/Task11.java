package J10_StringManipulation.tasks1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

      // Scanner scan = new Scanner (System.in);

      // System.out.println("Ad - Soyad Giriniz : ");

      // String ad=scan.next();
      // String soyad=scan.next();

      // System.out.println("Ad : "+ ad);
      // System.out.println("Soyad : "+ soyad);

        Scanner scan = new Scanner (System.in);
        System.out.println("Ad - Soyad Giriniz : ");
        String str = scan.nextLine().trim();
        String ad = str.charAt(0) + str.substring(1, str.indexOf(" "));
        String soyad = str.charAt(str.indexOf(" ") + 1) + str.substring(str.indexOf(" ") + 2);
        System.out.println("ad : " + ad);
        System.out.println("soyad : " + soyad);


    }
}

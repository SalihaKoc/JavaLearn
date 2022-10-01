package day01;

import java.util.Scanner;

public class Q09_Scanner {

    //  Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin (pi =3.14)
    //  Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
    //  Isim – soyisim : Elly Dainty
    //  Kullanicidan ismini alip isminin bas harfini yazdirin.

    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
      // System.out.print("Çemberin yarıçapını giriniz : ");
      // double yaricap= scan.nextDouble();

      // System.out.println("yarıçap = " + yaricap);
      // System.out.println("Çemberin Çevresi = " + 2*3.14*yaricap);
      // System.out.println("Çemberin Alanı = " + 3.14*yaricap*yaricap);

       // System.out.println("Lütfen isminizi giriniz : ");
       // String  isim=scan.nextLine();

       // System.out.println("Lütfen soyisminizi giriniz : ");
       // String  soyIsim=scan.nextLine();

       // System.out.println("İsim-Soyisim : "+isim+" "+soyIsim);

        System.out.println("Lütfen isminizi giriniz : ");
        char ilkHarf=scan.next().charAt(0);
        System.out.println("Girdiğiniz ismin ilk harfi : " + ilkHarf);

    }
}

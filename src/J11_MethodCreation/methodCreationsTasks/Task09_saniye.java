package J11_MethodCreation.methodCreationsTasks;

import java.util.Scanner;

public class Task09_saniye {

    public static void main(String[] args) {

    /*Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */

        Scanner scan=new Scanner(System.in);
        System.out.print("Saniyeye çevirmek istediğiniz saati giriniz : ");
        int saat=scan.nextInt();
        saniye(saat);

    }
    public static void saniye (int s) {

        System.out.println(s+ " saat = " + (s * 3600)+" saniye");

    }



}

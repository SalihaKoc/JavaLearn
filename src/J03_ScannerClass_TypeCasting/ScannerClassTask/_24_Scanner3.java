package J03_ScannerClass_TypeCasting.ScannerClassTask;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*  kullanıcını sevdiği meyveyi print eden code create ediniz  */

        Scanner scan = new Scanner(System.in);

        System.out.print("En Sevdiğiniz Meyveyi Giriniz : ");

        String meyve= scan.nextLine();

        System.out.println("En Sevdiğiniz Meyve : " + meyve);




    }
}

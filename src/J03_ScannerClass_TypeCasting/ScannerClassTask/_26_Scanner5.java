package J03_ScannerClass_TypeCasting.ScannerClassTask;

import java.util.Scanner;

public class _26_Scanner5 {

    public static void main(String[] args) {

    /*    kullanıcının  10 sene önceki yaşadığın şehri print eden code create ediniz.   */

    Scanner s = new Scanner(System.in);
    System.out.print("10 sene önce nerede yaşadınız ? ");
    String sehir= s.nextLine();
    System.out.println("10 sene önce "+ sehir+ "da yaşadınız");

    }
}

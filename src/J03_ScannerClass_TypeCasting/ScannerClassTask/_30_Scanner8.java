package J03_ScannerClass_TypeCasting.ScannerClassTask;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç kilosunuz ? ");
        Byte kilo= sc.nextByte();
        System.out.println(kilo+" kilosunuz");

    }
}

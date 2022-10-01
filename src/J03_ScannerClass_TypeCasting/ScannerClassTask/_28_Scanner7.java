package J03_ScannerClass_TypeCasting.ScannerClassTask;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir Banka Hesabınız Var mı ? True/False ");
        boolean b=sc.nextBoolean();
        System.out.println(b);
    }
}

package J08_IfStatement_TernaryOperator;

import java.io.Serializable;
import java.util.Scanner;

public class C05_TernaryOperator {

    public static void main(String[] args) {

        // TASK-> girilen bir tamsayı çiftse yarısını değilse "girilen sayı tek oldugu için yarısı tamsayı değildir" print eden code create ediniz

        Scanner scan= new   Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int sayi= scan.nextInt();

       //Serializable sonuc = ((sayi % 2 == 0) ? sayi / 2 : "Sayı Tam sayı değildir");
       //System.out.println(sonuc);

        System.out.println(((sayi % 2 == 0) ? sayi / 2 : "Sayı Tam sayı değildir"));
        /*
        Trick -> ternary iki durum(T/F) için farklı data type çıktısı veriyorsa variable atama yapmadan sout yapılmalı
                 ya da ternary çıktısı aynı data type cast edilmeli....
         */
    }

}

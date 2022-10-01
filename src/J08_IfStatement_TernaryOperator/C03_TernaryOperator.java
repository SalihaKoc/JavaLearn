package J08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {

    public static void main(String[] args) {

/* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
 ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
 Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
 daha basic code'lar bulunur.
 */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

    Scanner scan=new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int sayi=scan.nextInt();
        System.out.println("**** if-else ****");
        if (sayi%2==0){
            System.out.println("Çift sayı");
        } else System.out.println("Tek sayı");
        System.out.println("**** ternary ****");
       // String snc = sayi%2==0 ? "çift sayı" : "tek sayı"; //komut çıktısı String type variable
       // System.out.println(snc);

        System.out.println(sayi % 2 == 0 ?"çift sayı" : "tek sayı");

        /*
        TRICK -> ternary operator işlem sonucunda true veya false göre bir çıktı verir
        Eğer bu çıktı type göre bir variable atanmazsa sout ile doğrudan print edilmeli
         */

        // TASK02 -> girilen bir tamsayının negatif olmasını kontrol eden code create ediniz.

        System.out.println("**** Task02 ****");
        System.out.println(sayi < 0 ? "Sayı Negatif" : "Sayı Negatif Değil");


    }
}

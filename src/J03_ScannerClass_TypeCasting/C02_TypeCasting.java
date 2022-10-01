package J03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {

    public static void main(String[] args) {

        /*
        byte < short < int < long < float < double
        Auto Widening Casting -> Kucuk data type'larini buyuk data typlearina Java  otomatik olarak yapar.
        */

        boolean basarili=true;
        //String basari=basarili;//->doğal uyum olmayan variable'larda casting yapılamaz CTE
        //System.out.println("basarili: " + basarili); //->true
        //System.out.println("basari: " + basari);; //->true

        double d=17;
        System.out.println("d: " + d);

        int sayi1=33;
        int sayi2=7;
        System.out.println(sayi1/sayi2); //4
        /*
        java iki int sayıyı birbirine böldüğünde sonucu int verir.
        Eğer bölme işlemimde ondalık sonuç çıkarsa ondalık kısmı siler
         */
        byte b=127;
        int i=b; //küçüğü büyüğe atamak AW-Auto Widening
        System.out.println("i = "+i); //127

        int num=1453;
        double d1=17; //num; //k->b
        System.out.println("d1 = "+d1); //1453.0 --- 17

        double db=d1/num; // double/int=double
        // TRICK: iki farklı data type sayı işleme girerse java küçük olan data type türü için AW yapar, sonucu büyük olan type olarak verir
        System.out.println("db = "+db); //1.0 --- 0.01169993117687543

        /*
        byte < short < int < long < float < double
        Explicit Narrowing Casting ->Buyuk data type'larini kucuk data type'larina cevirme islemini veri kaybndan dolayı
        Java otomatik olarak yapmaz. kod ile teyit ister...
         */

        double d2=14.53;
        int num2= (int) d2; //b->k
        System.out.println("num2 = "+num2); // 14
        int num3=150;
        byte b1= (byte) num3;
        System.out.println("b1 = "+b1); // -106

        double d3=333;
        long l= (long) d3;
        System.out.println("l = "+l); //333

        double d4=571.94444;
        long l2= (long) d4;
        System.out.println("l2 = "+l2); //571

        /* task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         */
        Scanner scan= new Scanner (System.in);
        System.out.print("Ascii Kodu İstediğin Karakteri Giriniz : ");
        char ch=scan.nextLine().charAt(0);
        int chAsciiDegeri=ch;
        System.out.println(ch+"'ın chAsciiDegeri : "+chAsciiDegeri);



    }
}

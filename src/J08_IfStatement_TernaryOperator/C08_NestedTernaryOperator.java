package J08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {

    public static void main(String[] args) {

        /*
        Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
        */

        Scanner scan= new   Scanner(System.in);
        System.out.print("Kaç ürün aldınız ? ");
        int adet = scan.nextInt();

        System.out.print("Ürün fiyatı kaçtır ? ");
        double fiyat = scan.nextDouble();

        double fatura= adet<100 ? (adet*fiyat*0.67) : adet*fiyat;
        System.out.println("fatura = " + fatura);

    }

}

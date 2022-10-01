package javaForLife;

import java.util.Scanner;

public class musteriKartı {

    public static void main(String[] args) {

/* Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
                * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin.
* Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapin. */

        Scanner scan=new Scanner(System.in);
        System.out.println("Kaç adet ürün aldınz ?");
        int urunAdet=scan.nextInt();
        System.out.println("Liste fiyatı giriniz : ");
        double fiyat=scan.nextDouble();

        System.out.println("Müsteri kartınız var mı ? Evet / Hayır  :");
        char kart=scan.next().toUpperCase().charAt(0);

        if (kart=='E') {

            if(urunAdet>=10){
                System.out.println("%20 indirin kazandınız. İndirimli fiyat : " + " " + (fiyat = (fiyat * urunAdet * 0.8)));
            }else  System.out.println("%15 indirin kazandınız. İndirimli fiyat : " + " " + (fiyat = (fiyat * urunAdet * 0.85)));

        } else if (kart=='H') {
            if(urunAdet>=10){
                System.out.println("%21 indirin kazandınız. İndirimli fiyat : " + " " + (fiyat = (fiyat * urunAdet * 0.85)));
            }else  System.out.println("%10 indirin kazandınız. İndirimli fiyat : " + " " + (fiyat = (fiyat * urunAdet * 0.9)));

        }else System.out.println("Hatalı giriş yaptınız");




    }

    }





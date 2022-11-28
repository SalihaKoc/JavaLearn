package InterviewChallenge.extra;

import java.util.HashMap;
import java.util.Scanner;

public class Q07_StoreMap {

    /* 1- Kullanıcıdan bir kişinin kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
       2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
       3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
       4- Tüm kullanicilarin isimlerini ekrana yazdıralım
    */

    public static void main(String[] args) {

        HashMap <Integer, HashMap <String,String>> kisiListesi =new HashMap<>();
        Scanner scan=new Scanner(System.in);

        String secim="";
        do {

        HashMap <String,String> kisiBilgileri=new HashMap<>();
        System.out.println("Lütfen adınızı ve soyadınızı giriniz : ");
        kisiBilgileri.put("isim",scan.nextLine());
        scan.nextLine();
        System.out.println("Lütfen adresinizi giriniz : ");
        kisiBilgileri.put("adres",scan.nextLine());
            scan.nextLine();
        System.out.println("Lütfen telefon no giriniz : ");
        kisiBilgileri.put("tel",scan.nextLine());
            scan.nextLine();
        System.out.println("4 haneli kimlik no giriniz : ");
        kisiListesi.put(scan.nextInt(),kisiBilgileri);

            scan.nextLine(); // dummy gerekli... döngünün saglıklı ilerlemesi için

        System.out.println(kisiBilgileri);
        System.out.println(kisiListesi);
        System.out.println("Devam etmek istiyor musunuz? (E/H) : ");
        secim=scan.next();

        } while (secim.equalsIgnoreCase("E"));

        System.out.println("Görüntülemek istediğiniz kişinin kimlik no'sunu giriniz : ");

        System.out.println(kisiListesi.get(scan.nextInt()));

    }

}

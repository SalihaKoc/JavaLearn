package J22_DateTime.Task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayit {

    ArrayList <Kullanıcı> kullaniciKisiler =new ArrayList<>(); //kullanıcı class'tan olusturulacak obj tutulacağı list
//task 2.step
   public ArrayList<Kullanıcı> kayitAl() { // kullanıcı classtan obj üretmek iiçin cons' gereken name ve kayıtzamanı bilgilerini olusturup olusan obj'yi liste ekler

       Scanner scan=new Scanner(System.in);
       System.out.print("Adınızı giriniz : ");
       String ad=scan.nextLine(); //kullanıcı obj için name alındı
       Kullanıcı k1=new Kullanıcı(ad, LocalDateTime.now()); //k1 obj name kullanıcıdan kayıtzamanı LocalDateTime.now'dan alacak
       kullaniciKisiler.add(k1); // olusturulan k1 obj listeeklendi

       return kullaniciKisiler; //list method cıktısı return olarak tanımlandı

    }

    public void sansliKullanici(ArrayList <Kullanıcı> kllObj) { //kullanıcı listesindeki obj'lerin kayıtzmanı 10 sn olup olmamasına bakcak
//task 3.step
        for (Kullanıcı k: kllObj) {
            if (k.kayitZamani.getSecond()<10){
                System.out.println(k.name + " şanslı kisiniz, 5 kilo bal kazandınız. Sisteme giriş zamanınız : " + k.kayitZamani);
            } else System.out.println(k.name + " şanslı kisi değilsiniz,  Sisteme giriş zamanınız : " + k.kayitZamani);
        }
    }
}

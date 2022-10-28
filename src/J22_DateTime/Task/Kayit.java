package J22_DateTime.Task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayit {

    ArrayList <Kullanıcı> kullaniciKisiler =new ArrayList<>(); //kullanıcı class'tan olusturulacak obj tutulacağı list

   public ArrayList<Kullanıcı> kayitAl() {

       Scanner scan=new Scanner(System.in);
       System.out.print("Adınızı giriniz : ");
       String ad=scan.nextLine();
       Kullanıcı k1=new Kullanıcı(ad, LocalDateTime.now()); //k1 obj name kullanıcıdan kayıtzamanı LocalDateTime.now'dan alacak
       kullaniciKisiler.add(k1); // olusturulan k1 obj listeeklendi

       return kullaniciKisiler;



    }
}

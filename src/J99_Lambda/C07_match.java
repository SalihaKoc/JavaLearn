package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_match {

    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.

    public static void main(String[] args) {

        List<String> menu=new ArrayList<>(Arrays.asList("kuşleme","soğanli","trileçe","bicibici","büryan","küşleme","welemen","bicibici","cacix","kokorec","yağlama","güvec","bicibici","arabaşi","tantuni"));

        harfSayisi7DenAzKontrol(menu);
        System.out.println("\n");
        wİleBaslama(menu);
        xİleBitme(menu);
    }

    // Task : List elemanlarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static void harfSayisi7DenAzKontrol(List<String> menu) {

        boolean kontrol= menu.stream().allMatch(t-> t.length()<=7);
        if (kontrol) { //amele code
            System.out.println("menüdekiler 7 ve daha az karakterden oluşuyor");
        }else System.out.println("menüdekiler 7 karakterden fazla ");

        System.out.print(menu.stream().allMatch(t -> t.length() <= 7) ? "menüdekiler 7 ve daha az karakterden oluşuyor" : "menüdekiler 7 karakterden fazla ");
    }

    // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.

    public static void wİleBaslama(List<String> menu) { //NONE : hiçbiri w ile başlamazsa - true , biri bile w İLE başlıyorsa -false
        System.out.println(menu.stream().noneMatch(t -> t.startsWith("w")) //akıştaki hiç bir eleman w ile başlamaz kontrolü yapıldı
                ?"w ile başlayan yemek yok" : "wenemen ne menem bişey"); //true ise çıktı : false ise çıktı
    }

    // Task : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.

    public static void xİleBitme(List<String> menu) {

        System.out.println(menu.stream().anyMatch(t -> t.toLowerCase().endsWith("x")) ? "x ile biten var" : "x ile biten yok");
    }



}

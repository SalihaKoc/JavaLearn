package P04_okulYonetimi.OkulYonetimi;

import java.util.ArrayList;
import java.util.Scanner;

public class Islemler {

    Scanner scan=new Scanner(System.in);
    
    ArrayList<Ogrenci> listOgrenci=new ArrayList<>();
    ArrayList<Ogretmen> listOgretmen=new ArrayList<>();
    
    public void panelAc(){
        System.out.println("====================================\nÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n====================================");

        System.out.println("1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");
        char secim=scan.next().charAt(0);

        switch (secim) {
            case '1' : ogrenciIslemleri(); break;
            case '2' : ogretmenIslemleri(); break;
            case 'Q' :
                System.out.println("Çıkış işleminiz yapıldı"); break;
            default:
                System.out.println("Yanlış işlem yaptınız"); panelAc();
        }

    }

    private void ogretmenIslemleri() {
        System.out.println("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ:");
        char secim=scan.next().charAt(0);
        switch (secim) {
            case '1' : ogretmenEkle();panelAc();break;
            case '2' : ogretmenArama();panelAc();break;
            case '3' : ogretmenListele();panelAc();break;
            case '4' : ogretmenSilme();panelAc();break;
            case '5' : panelAc();panelAc(); break;
            case 'Q' :
                System.out.println("Çıkış işleminiz yapıldı"); break;
            default:
                System.out.println("Yanlış işlem yaptınız"); ogretmenIslemleri(); break;
        }
    }

    private void ogretmenSilme() {
        System.out.println("Silmek İstediğiniz Öğretmenin TcNo Giriniz : ");
        String kimlikNo=scan.next();
        System.out.println(listOgretmen.removeIf(x -> x.tcNo.equals(kimlikNo)) ? "Öğretmen Silindi" : "Silinecek Öğretmen Bulunamadı");
    }

    private void ogretmenListele() {
        System.out.println(listOgretmen.toString());
    }

    private void ogretmenArama() {
        System.out.println("Aramak İstediğiniz Öğretmenin TcNo Giriniz : ");
        String kimlikNo=scan.next();
        int sayac=0;
        for (Ogretmen value: listOgretmen) {
            if (value.tcNo.equals(kimlikNo)) {
                sayac++;
                System.out.println(value.toString());
            }
        }
        System.out.println(sayac==0 ? "Öğretmen Bulunamadı" : "Öğretmen Bilgileri Yazdırıldı");
    }

    private void ogretmenEkle() {
        System.out.print("Öğretmenin Ad-Soyadını Giriniz : ");
        String ogrAd=scan.next();
        System.out.print("Öğretmenin tcNo Giriniz : ");
        String tcNo=scan.next();
        System.out.print("Öğretmenin Yaşını Giriniz : ");
        int yas= scan.nextInt();
        System.out.println("Öğretmenin Sicil No Giriniz : ");
        int sicilNo= scan.nextInt();
        System.out.println("Öğretmenin Bölümünü Giriniz : ");
        String bolum=scan.next();
        listOgretmen.add(new Ogretmen(ogrAd,tcNo,yas,bolum,sicilNo));
    }

    public void ogrenciIslemleri() {
        System.out.println("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ:");
        char secim=scan.next().charAt(0);
        switch (secim) {
            case '1' : ogrenciEkle(); panelAc();break;
            case '2' : ogrenciArama();panelAc();break;
            case '3' : ogrenciListele();panelAc();break;
            case '4' : ogrenciSilme();panelAc();break;
            case '5' : panelAc();panelAc(); break;
            case 'Q' :
                System.out.println("Çıkış işleminiz yapıldı");panelAc(); break;
            default:
                System.out.println("Yanlış işlem yaptınız"); ogrenciIslemleri(); break;
        }
    }

    private void ogrenciSilme() {
        System.out.println("Silmek İstediğiniz Öğrencinin TcNo Giriniz : ");
        String kimlikNo=scan.next();
        System.out.println(listOgrenci.removeIf(x -> x.tcNo.equals(kimlikNo)) ? "Öğrenci Silindi" : "Silinecek Öğrenci Bulunamadı");
    }

    private void ogrenciListele() {
        System.out.println(listOgrenci.toString());
    }

    private void ogrenciArama() {
        System.out.println("Aramak İstediğiniz Öğrencinin TcNo Giriniz : ");
        String kimlikNo=scan.next();
        int sayac=0;
        for (Ogrenci value: listOgrenci) {
            if (value.tcNo.equals(kimlikNo)) {
                sayac++;
                System.out.println(value.toString());
            }
        }
        System.out.println(sayac==0 ? "Öğrenci Bulunamadı" : "Öğrenci Bilgileri Yazdırıldı");
    }

    private void ogrenciEkle() {
        System.out.print("Öğrencinin Ad-Soyadını Giriniz : ");
        String ogrAd=scan.next();
        System.out.print("Öğrenci tcNo Giriniz : ");
        String tcNo=scan.next();
        System.out.print("Öğrenci Yaşını Giriniz : ");
        int yas= scan.nextInt();
        System.out.println("Öğrenci No Giriniz : ");
        int no= scan.nextInt();
        System.out.println("Öğrenci Sınıfını Giriniz : ");
        String sinif=scan.next();
        listOgrenci.add(new Ogrenci(ogrAd,tcNo,yas,no,sinif));
        
    }


}

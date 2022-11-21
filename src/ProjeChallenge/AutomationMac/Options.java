package ProjeChallenge.AutomationMac;

import java.util.Scanner;

public class Options {

    /*
    1)kullanıcıya urunleri göstermeliyiz
    2)Scanner
    3)Loop -> Do while loop -> kullanıcı 1-7 rakamları arasında bir seçim yapmalı ve eğer girmiş oldugu rakam
      1den küçük 7den büyükse döngü devam etmeli ve kullanıcı 1-7 arasında seçim yapmaya zorlansın
    4)0a basarak menuden cıkabilmeli
    5)kullancıdan productNum(1-7 arasında rakam-1i secerse kraker, 2secerse cips...)->switch case
    6)switch benden productNum ve alınan bu productNuma göre ilgili urunun price ı alınmalı. getKraker(), getCay()....
      (price set edebilmek için ben price ın setPrice() methodunu kullanmalıyım
    7)return olarak bana price dönmeli. return getPrice() methodu kullanmalıyım
     */

    public double select(Urun urun) {

        System.out.println(urun.toString());
        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("Lütfen 1-7 arasında bir rakam girerek ürün seçiniz : ");
            System.out.println("Çıkış için '0' ");
            urun.setProductNum(scan.nextInt());
            if(urun.getProductNum()<0 || urun.getProductNum()>7) {
                System.out.println("Lütfen belirtilen aralıkta bir rakam giriniz...");
            }
        }while(urun.getProductNum()<0 || urun.getProductNum()>7);

        switch (urun.getProductNum()) {
            case 0: System.out.println("Yine bekleriz...");
            System.exit(0);
            break;
            case 1: urun.setPrice(urun.getKraker()); break;
            case 2: urun.setPrice(urun.getCips()); break;
            case 3: urun.setPrice(urun.getCocaCola()); break;
            case 4: urun.setPrice(urun.getFanta()); break;
            case 5: urun.setPrice(urun.getSu()); break;
            case 6: urun.setPrice(urun.getCay()); break;
            case 7: urun.setPrice(urun.getFiltreKahve()); break;
        }
        return urun.getPrice();
    }

    public double balance(double price, double accountBalance, Urun urun) {

        double fonlama;
        while (accountBalance<price) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Yeterli bakiyeniz bulunmamaktadır... Ekleme yapmak istiyor musunuz? (Y/N)");
            char confirm=scan.next().toLowerCase().charAt(0);
            if (confirm=='n') {
                System.out.println("Mevcut bakiyeniz : " +accountBalance);
                System.out.println("Yine bekleriz...");
                break;
            }else {
                System.out.println("Ne kadar eklemek istiyorsunuz ? ");
                fonlama=scan.nextDouble();
                accountBalance=accountBalance+fonlama;
                System.out.println("Yeni bakiyeniz : "+accountBalance);
                price=select(urun);
            }
        }

        return accountBalance;
    }

    public void purchase(double price, double accountBalance, Urun urun) {

        while (accountBalance>=price) {

            accountBalance=accountBalance-price;
            System.out.println("Kalan bakiye : " + accountBalance);

            Scanner scan=new Scanner(System.in);
            System.out.println("Başka bir ürün almak istiyor musunuz? (Y/N) ");
            char confirm=scan.next().toLowerCase().charAt(0);

            if (confirm=='n') {
                System.out.println("Yine bekleriz...");
                break;
            }else {
                urun.setPrice(select(urun));
                accountBalance=balance(urun.getPrice(),accountBalance,urun);
            }
        }

    }
}

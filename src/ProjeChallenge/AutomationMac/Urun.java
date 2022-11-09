package ProjeChallenge.AutomationMac;

public class Urun {

    /*
        select(Urun product) →  Parametre olarak Urun classından oluşturulan bir obje alınarak, ilgili ürünlere göre seçim yapması beklenir.
    Kullanıcı seçim yapabilmek için öncelikle ürünleri görmelidir.

    balance(double price, double accountBalance, Urun product) → Parametre olarak, urunun fiyatı, mevcut bakiye, Urun classından oluşturulmuş
    bir obje alınarak satın alınmak istenen ürünün fiyatı
    kullanıcının bakiyesinden az ise ekleme yapmasına olanak sağlayan ve ya ekleme yapmak istemiyorsa programdan çıkışını sağlayabilecek bir metot
    oluşturunuz.

    purchase(double price, double accountBalance, Urun product)-->  Parametre olarak, urunun fiyatı, mevcut bakiye, Urun classından oluşturulmuş
    bir obje alınarak, bakiye satın alınmak istenen üründen daha fazla ve ya eşit ise satın alınma işlemi yapılmalı, kullanıcıya kalan bakiye
    gösterilmeli ve başka bir ürün alınıp alınmak istenmediği sorularak ilgili aksiyonlar alınmalıdır.  Kullanıcı başka bir ürün satın almak
    istiyorsa tekrardan ürünlerin gösterildiği metoda gitmelidir.

     */

    private double kraker=2.5;
    private double cips=2.2;
    private double cocaCola=2.2;
    private double fanta=2.0;
    private double su=1.0;
    private double cay=1.5;
    private double filtreKahve=1.99;

    private int productNum;
    private double price;

    public double getKraker() {
        return kraker;
    }

    public void setKraker(double kraker) {
        this.kraker = kraker;
    }

    public double getCips() {
        return cips;
    }

    public void setCips(double cips) {
        this.cips = cips;
    }

    public double getCocaCola() {
        return cocaCola;
    }

    public void setCocaCola(double cocaCola) {
        this.cocaCola = cocaCola;
    }

    public double getFanta() {
        return fanta;
    }

    public void setFanta(double fanta) {
        this.fanta = fanta;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getCay() {
        return cay;
    }

    public void setCay(double cay) {
        this.cay = cay;
    }

    public double getFiltreKahve() {
        return filtreKahve;
    }

    public void setFiltreKahve(double filtreKahve) {
        this.filtreKahve = filtreKahve;
    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Urunler : " +
                "\n1.kraker=" + kraker +
                "\n2.cips=" + cips +
                "\n3.cocaCola=" + cocaCola +
                "\n4.fanta=" + fanta +
                "\n5.su=" + su +
                "\n6.cay=" + cay +
                "\n7.filtreKahve=" + filtreKahve;
    }
}

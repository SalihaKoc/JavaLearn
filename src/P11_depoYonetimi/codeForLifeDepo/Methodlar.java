package P11_depoYonetimi.codeForLifeDepo;

public interface Methodlar {

    void urunTanimlama();
    void urunListele(); //ürünleri printf ile düzenli şekilde yazdırsın
    void urunGirisi();
    void urunuRafaKoy();
    void urunCikisi(); //ürün miktarı 0'ın altına düşmeyecek
    boolean ayniUrunKontrol();//Cüneyt beyin söylediği durum -> kullanıcı aynı ürün ismi ve üretici ile
    // giriş yaptığında yeni bir ürün objesi oluşturmasın. Yeni ürün id si oluşturmasın
    String intTryCatch(int limit);// girilen limit değerine göre bütün kullanıcı seçimlerinde yapılan hataları
    // handle edecek , örnek ürün ismi Arrayinde kullanacaksak limit = arr.lengt , ürün miktar girişi yapıldığında limit = Integer.MAX_VALUE
    void menuYazdir();
    //seçimleri göstersin
    String urunIsmiSec(); //urunIsmiArr arrayinden kullanıcı seçim yapsın -> uruntanımlama methodunda çağrılacak
    String ureticiFirmaSec();//ureticiArr arrayinden kullanıcı seçim yapsın -> uruntanımlama methodunda çağrılacak
    String urunBirimSec();//urunBirimiArr arrayinden kullanıcı seçim yapsın -> uruntanımlama methodunda çağrılacak
}

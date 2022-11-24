package P11_depoYonetimi.codeForLifeDepo;

import java.util.HashMap;

public class Islemler implements Methodlar{

    HashMap<Integer, Urunler> urunMap = new HashMap<>();
    //HashMap -> urunİd , Urunler
    String urunIsmiArr[] = {"Un" , "Şeker" , "Yumurta" , "Helva" , "Yağ" , "Margarin"};
    String ureticiArr[] = {"Hekimoğlu" , "Ekici" , "Ova un" , "Ülker" , "Bili Bili"};
    String urunBirimiArr[] = {"Koli" , "Çuval" , "Paket" , "Litre" , "Kilogram"};
    @Override
    public void urunTanimlama() {
        // TODO Auto-generated method stub

    }
    @Override
    public void urunListele() {
        // TODO Auto-generated method stub

    }
    @Override
    public void urunGirisi() {
        // TODO Auto-generated method stub

    }
    @Override
    public void urunuRafaKoy() {
        // TODO Auto-generated method stub

    }
    @Override
    public void urunCikisi() {
        // TODO Auto-generated method stub

    }
    @Override
    public boolean ayniUrunKontrol() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public String intTryCatch(int limit) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public void menuYazdir() {
        // TODO Auto-generated method stub

    }
    @Override
    public String urunIsmiSec() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String ureticiFirmaSec() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String urunBirimSec() {
        // TODO Auto-generated method stub
        //kullanıcı un girdiğinde -> birim olarak Çuval verecek
        //Şeker -> Çuval
        //Yumurta -> Koli
        //Helva -> KiloGram
        //Yağ -> litre
        //Margarin -> paket
        return null;
    }
}

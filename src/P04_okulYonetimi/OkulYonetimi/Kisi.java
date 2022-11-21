package P04_okulYonetimi.OkulYonetimi;

public abstract class Kisi {

    String adSoyad;
    String tcNo;
    int yas;

    public Kisi(String adSoyad, String tcNo, int yas) {
        this.adSoyad = adSoyad;
        this.tcNo = tcNo;
        this.yas = yas;
    }
}

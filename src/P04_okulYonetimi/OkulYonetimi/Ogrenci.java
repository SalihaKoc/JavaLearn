package P04_okulYonetimi.OkulYonetimi;

import java.util.ArrayList;

public class Ogrenci extends Kisi {

    int ogrNo;
    String sinifBilgisi;


    public Ogrenci(String adSoyad, String tcNo, int yas, int ogrNo, String sinifBilgisi) {
        super(adSoyad, tcNo, yas);
        this.ogrNo=ogrNo;
        this.sinifBilgisi=sinifBilgisi;
    }

    @Override
    public String toString() {
        return "ogrNo=" + ogrNo +
                ", sinifBilgisi='" + sinifBilgisi + '\'' +
                ", adSoyad='" + adSoyad + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", yas=" + yas +
                '\n';
    }
}

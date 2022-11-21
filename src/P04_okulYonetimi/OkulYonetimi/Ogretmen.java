package P04_okulYonetimi.OkulYonetimi;

import java.util.ArrayList;

public class Ogretmen extends Kisi {

    ArrayList<Ogretmen> list=new ArrayList<>();
    String bolum;
    int sicilNo;


    public Ogretmen(String adSoyad, String tcNo, int yas, String bolum, int sicilNo) {
        super(adSoyad, tcNo, yas);
        this.bolum=bolum;
        this.sicilNo=sicilNo;
    }

    @Override
    public String toString() {
        return "bolum=" + bolum + '\'' +
                ", sicilNo=" + sicilNo +
                ", adSoyad='" + adSoyad + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", yas=" + yas +
                '\n';
    }
}

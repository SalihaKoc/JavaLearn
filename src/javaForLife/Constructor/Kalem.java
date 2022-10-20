package javaForLife.Constructor;

public class Kalem {

    double uc;
    String model;
    int fiyat;

    public Kalem() {

        this.uc=0.7;
    }
    public Kalem(String marka) {

        this.model=marka;
    }
    public Kalem(double uc, int fiyat) {
        this();
        this.uc=uc;
        this.fiyat=fiyat;
    }

}

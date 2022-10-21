package J18_Constructor;

public class C07_Ogretmen {

    //Fields

    String isim;
    int tecrube;

    int kidem=5;

    public C07_Ogretmen(String isim, int tecrube) {
        this.isim = isim; // bu satır olmazsa isim default (null) olur
        this.tecrube = tecrube;
    }

    public void kidemHesap(int kidem) { //int parametreli void method

        System.out.println("kıdeminiz : "+(kidem*2));
        System.out.println("kıdeminiz : "+(this.kidem*2));

    }



}

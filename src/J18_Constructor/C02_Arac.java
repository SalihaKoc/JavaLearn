package J18_Constructor;

public class C02_Arac {

    String marka;
    String model;
    int km=10;
    double motorHacim;
    boolean vitesAuto=false;
    boolean ikinciEl;
    int yil;


    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacim=" + motorHacim +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yil=" + yil +
                '}';
    }

    public static void main(String[] args) {

        C02_Arac arac1=new C02_Arac(); //default cons ile arac1 obj create edildi
        arac1.ikinciEl=true;
        arac1.marka="volvo";
        arac1.km=50000;
        arac1.model="xc60";
        arac1.motorHacim=2.4;
        //                    volvo          xc60           50000       default=0         true                2.4
        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.km+" "+arac1.yil+" "+arac1.ikinciEl+" "+arac1.motorHacim);

        //task -> 2.bir aracın tüm field'larını atayarak print ediniz

        C02_Arac arac2=new C02_Arac();
        arac2.marka="Honda";
        arac2.ikinciEl=false;
        arac2.km=15;
        arac2.model="Accord";
        arac2.motorHacim=2.0;
        arac2.yil=2022;
        arac2.vitesAuto=true;
        System.out.println(arac2.marka+" "+arac2.model+" "+arac2.km+" km "+arac2.yil+" "+arac2.ikinciEl+" "+arac2.motorHacim+" cc"+arac2.yil+" "+arac2.vitesAuto);

        System.out.println(arac2); //toString yaptıktan sonr değerleri yazar

    }
}

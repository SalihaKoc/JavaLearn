
package J18_Constructor;

public class C07_OgretmenRunner {

    public static void main(String[] args) {

        C07_Ogretmen hcm=new C07_Ogretmen("Sevdenur Öğretmenim",11);
        System.out.println("hcm.isim = " + hcm.isim);
        System.out.println("hcm.kidem = " + hcm.kidem);
        hcm.kidemHesap(13);
    }
}

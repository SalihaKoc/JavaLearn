package J16_ArrayList.ArrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task01_BakkalH {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */

    static ArrayList<String> gunler =new ArrayList<>(Arrays.asList("Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar")); //1.adım
    static ArrayList<Double> gunlukKazanc=new ArrayList<>(); //2.adım
    static Scanner scan=new Scanner(System.in);

    static double haftaCiro=0;

    public static void main(String[] args) {

        int gun=0;
        while (gun<7) {  //3.adım
            System.out.print(gunler.get(gun)+ " gününün kazancını gir : ");
            double gunKazanci= scan.nextDouble();
            gunlukKazanc.add(gunKazanci);
            haftaCiro += gunKazanci;
            gun++;
        }
        System.out.println("haftaCiro = " + haftaCiro);
        System.out.println("OrtalamaKazanc = " + getOrtalamaKazanc());
        System.out.println("Ortalamanin Ustunde Kazanc Olan Günler = " + getOrtalamaninUstundeKazancGünleri());
        System.out.println("Ortalamanin Altinda Kazanc Olan Günler = " + getOrtalamaninAltindaKazancGünleri());

    }
    private static String getOrtalamaninAltindaKazancGünleri() { //6.adım

        String ortalamaAltiGun="";

        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if (gunlukKazanc.get(i)<getOrtalamaKazanc()) {
                ortalamaAltiGun+=gunler.get(i);
            }
        }
        return ortalamaAltiGun;
    }

    private static String getOrtalamaninUstundeKazancGünleri() { //5.adım

        String ortalamaUstuGun="";

        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if (gunlukKazanc.get(i)>getOrtalamaKazanc()) {
                ortalamaUstuGun+=gunler.get(i);
            }
        }
        return ortalamaUstuGun;
    }

    private static double getOrtalamaKazanc() {  //4.adım

        double ortalama = haftaCiro/7;
        return ortalama;
    }


}

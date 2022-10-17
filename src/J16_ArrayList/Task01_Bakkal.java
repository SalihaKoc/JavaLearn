package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task01_Bakkal {

   static ArrayList<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"));

   static Scanner scan = new Scanner(System.in);
   static ArrayList<Integer> gunlukKazanc = new ArrayList<Integer>();

    public static void main(String[] args) {

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
        int gun=0;
        while (gun<gunler.size()){
            System.out.print(gunler.get(gun)+"  kazancınızı giriniz: ");
            gunlukKazanc.add(scan.nextInt());
            gun++;
        }
        System.out.println("günlere göre kazancınız : " + gunlukKazanc);

        System.out.println("haftalık kazanç ortalamanız : " + getOrtalamaKazanc());
        getOrtalamaninUstundeKazancGunleri();
        getOrtalamaninAltindaKazancGunleri();
        }

    private static void getOrtalamaninAltindaKazancGunleri() {
        System.out.println();
        System.out.print("ortalama kazancın altındaki günler : ");
        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if (gunlukKazanc.get(i) < getOrtalamaKazanc()) {
                System.out.print(gunler.get(i)+" ");
            }
        }
    }
    private static void getOrtalamaninUstundeKazancGunleri() {

        System.out.print("ortalama kazancın üstündeki günler : ");
        for (int i = 0; i < gunlukKazanc.size(); i++) {
            if (gunlukKazanc.get(i) > getOrtalamaKazanc()) {
                System.out.print(gunler.get(i)+" ");
            }
        }
    }

    private static double getOrtalamaKazanc() {

        double ortalama=0, toplam=0;
        for (int i : gunlukKazanc) {
            toplam+=i;
        }
        ortalama = toplam / gunlukKazanc.size();
        return ortalama;
    }
}

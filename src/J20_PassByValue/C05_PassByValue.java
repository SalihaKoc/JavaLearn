package J20_PassByValue;

public class C05_PassByValue {

    public static void main(String[] args) {

         /*
        eğer bir method'da yapılan değişiklik kalıcı olsun istenirse
        2.değişiklik yapılan variable'lar atama tanımlanır
         */

        double etiketFiyati=100;
        double indirimOrani=0.1;

        System.out.println("indirim öncesi etiketFiyati = " + etiketFiyati);

        etiketFiyati=indirim(etiketFiyati,indirimOrani);

        System.out.println("indirim sonrası etiketFiyati = " + etiketFiyati);



    }

    public static double indirim(double fiyat, double oran) {

        fiyat*=(1-oran);
        System.out.println("indirimli fiyat = " + fiyat);
        return fiyat;
    }
}

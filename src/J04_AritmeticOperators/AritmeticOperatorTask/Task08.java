package J04_AritmeticOperators.AritmeticOperatorTask;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Saniye cinsinden süre giriniz : ");
        int sure =s.nextInt();
        int saat, dk,sn;

        saat=sure/3600;

        dk= (sure%3600)/60;

        sn=sure-((saat*3600)+(dk*60));

        System.out.println(sure+" Saniye = "+saat+" saat "+dk+" dk "+sn+" sn");
    }
}

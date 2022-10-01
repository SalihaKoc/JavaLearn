package javaForLife;

import java.util.Scanner;

public class soru2_ceza {

    public static void main(String[] args) {

        /* Kulanicidan aracinin hizini aliniz Trafik cezasinin degerini hesaplayin.
         * 45hiz siniridir.
         * Eger hiziniz 55-74 arasinda ise: Ceza 100 $'dir.
         * Eger hiziniz 75 - 84 arasinda ise: Ceza 150 $'dir.
         * Eger hiziniz 85 -94 arasinda ise: Ceza 320 $'dir.
         * Eger hiziniz 94'den daha fazla ise: Ceza 500 $'dir.
         * ve ayrica, Eger sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
         * Örn: Hiziniz 77 iken cezaniz 150$'dir ama ehliyetiniz yoksa ceza 350 $ olur.*/

        Scanner scan=new Scanner(System.in);
        System.out.print("Hızınızı Giriniz : ");
        int hiz=scan.nextInt();

        System.out.print("Ehliyet Var mı ? true/false : ");
        boolean ehliyet = scan.nextBoolean();

        int ceza=0;

            if (hiz >= 55 && hiz < 75) {
               ceza=100;
            } else if (hiz >= 75 && hiz < 84){
                ceza=150;
            }else if (hiz >= 85 && hiz < 94){
                ceza=320;}
            else if (hiz >= 94){
                ceza=500;
            }
            else System.out.println("Hız sınırını aşmadınız.");

            if (ehliyet==true){

                System.out.println("Cezanız : " + ceza+" TL");

            } else  System.out.println("Ehliyetiniz Olmadığı İçin Cezanız : " + (ceza)+"+" +200+ " = " + (ceza+200) + "TL");

        /**
         * char ehliyet = scan.next().toUpperCase().charAt(0);
         *
         *         int ceza = 0;
         *
         *
         *         if (ehliyet == 'E') {
         *             if (hiz >= 55 && hiz <= 74) {
         *                 ceza = 100;
         *
         *             } else if (hiz > 74 && hiz < 85) {
         *                 ceza = 150;
         *             } else if (hiz > 84 && hiz < 95) {
         *                 ceza = 300;
         *             } else if (hiz > 94) {
         *                 ceza = 500;
         *             } else System.out.println("yanlış hız girdiniz");
         *             System.out.println("Ödenecek ceza : " + "$" + ceza);
         *         }else if (ehliyet == 'H') {
         *             if (hiz >= 55 && hiz <= 74) {
         *                 ceza = 100;
         *
         *             } else if (hiz > 74 && hiz < 85) {
         *                 ceza = 150;
         *             } else if (hiz > 84 && hiz < 95) {
         *                 ceza = 300;
         *             } else if (hiz > 94) {
         *                 ceza = 500;
         *             } else System.out.println("yanlış hız girdiniz");
         *                     System.out.println("Ehliyet olmadığı için + $200 ile toplam ceza : " + "$" + (ceza += 200));
         *
         *                 } else System.out.println("hatalı giriş");
         */

    }
}

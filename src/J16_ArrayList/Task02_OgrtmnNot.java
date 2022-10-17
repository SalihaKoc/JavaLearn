package J16_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Task02_OgrtmnNot {

    public static void main(String[] args) {

         /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
         */

        Scanner scan=new Scanner(System.in);

        System.out.print("Sınıf Mevcudu Giriniz : ");
        int mevcut=scan.nextInt();

        ArrayList<Double>notList=new ArrayList<>();

        for (int i = 0; i < mevcut; i++) {
            System.out.print(i+". Öğrencinin Notunu Giriniz : ");
            double not= scan.nextDouble();
            notList.add(not);
        }
        System.out.print("Sınıftaki notlar : " + notList);

        double toplam=0, ortalama=0;

        for (int i = 0; i < notList.size(); i++) {
            toplam+= notList.get(i);
        }
        System.out.println();
        System.out.println("Sınıf ortalaması =" + (ortalama = toplam / notList.size()));
        int sayac=0;
        for (int i=0; i< notList.size();i++) {
            if ((notList.get(i))>ortalama) {
                sayac++;
            }
        }

        System.out.println("Ortalamayı "+sayac+" öğrenci geçti");
    }
}

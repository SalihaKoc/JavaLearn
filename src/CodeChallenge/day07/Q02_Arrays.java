package CodeChallenge.day07;

public class Q02_Arrays {

    public static void main(String[] args) {

        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * lari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         * Output : 5,6,7
         */
        int sayi[]={1,2,3,4,5,6,7};
        int toplam= 0 , ortalama=0, sayac=0;
                for (int i=0; i< sayi.length; i++) {
                    toplam+=sayi[i];
                }

        System.out.println("ortalama = " + (ortalama = toplam / sayi.length));
        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] > ortalama) {
                System.out.print(sayi[i] + " ");
                sayac++;
            }
        }
        System.out.println();
        System.out.println(sayac+" sayı ortalamayı geçmiştir");

    }
}

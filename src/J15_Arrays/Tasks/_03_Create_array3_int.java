package J15_Arrays.Tasks;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */
        int sayi[]={25,30,30,35,100};

        int toplam=0;

        for (int value: sayi) {
            toplam+=value;
        }
        System.out.println("toplam = " + toplam);

    }
}
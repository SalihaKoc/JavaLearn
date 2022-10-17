package J15_Arrays.Tasks;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        int sayi[]={12,2,5,15,8};
        int enBuyuk=0;

        for (int i = 0; i < sayi.length; i++) {

            if (sayi[i]>enBuyuk) {
                    enBuyuk=sayi[i];
            }
        }
        System.out.println("enBuyuk = " + enBuyuk);

    }
    }


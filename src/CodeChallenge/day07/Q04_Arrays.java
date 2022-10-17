package CodeChallenge.day07;

import java.util.Arrays;

public class Q04_Arrays {

    public static void main(String[] args) {

        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */

        int [] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;
        ToplamDokuz(arr,istenenToplam);


    }

    private static void ToplamDokuz(int []arr, int istenenToplam) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) { // for (int j = i; j < arr.length; j++) yazsak aynı çıktı olur
                                                     // for (int j = 0; j < arr.length; j++) yazınca 5+4 =9 ve 4+5=9 yazar
                if (arr[i]+arr[j]==istenenToplam) {
                    System.out.println(arr[i]+ " + "+arr[j]+" = "+istenenToplam);
                }
            }
        }
    }
}

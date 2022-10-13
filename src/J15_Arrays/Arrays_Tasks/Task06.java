package J15_Arrays.Arrays_Tasks;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        int arr[]= {3,5,6,1,9,45,25,4,9,0};

        System.out.println(Arrays.toString(bkSirala(arr)));
    }

    private static int[] bkSirala (int[] arr) {

        int bykckSirali[]=new int [arr.length];
      Arrays.sort(arr);;
        System.out.println("K->B Sıralı : "+Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            bykckSirali[i]=arr[arr.length-i-1];
        }
        return bykckSirali;
    }
}

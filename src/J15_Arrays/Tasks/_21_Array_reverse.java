package J15_Arrays.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        int arr=123;

        System.out.println("sayı : " + arr);
        String[] arr1 = String.valueOf(arr).split("");
        System.out.print("tersi : ");
        for (int i = arr1.length-1; i >=0; i--) {
            System.out.print(arr1[i]);
        }
    }
}



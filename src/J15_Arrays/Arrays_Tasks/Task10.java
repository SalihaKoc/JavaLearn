package J15_Arrays.Arrays_Tasks;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
         */

        int arr[]={1,2,-3,4,-5,-6};
        System.out.println("ilk hali : " +Arrays.toString(arr));
        isaretDegistir(arr);
        isaretDegistirForEach(arr);


    }

    private static void isaretDegistirForEach(int[] arr) {

        for (int i : arr ){
            i*=-1;
        }
        System.out.println("For Each ile : " + Arrays.toString(arr));
    }

    private static void isaretDegistir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0 || (arr[i]<0)){
                arr[i]*=-1;
            }
        }
        System.out.println("yeni hal = " + Arrays.toString(arr));
    }



}

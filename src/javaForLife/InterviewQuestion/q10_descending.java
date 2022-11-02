package javaForLife.InterviewQuestion;

import java.util.Arrays;

public class q10_descending {

    public static void main(String[] args) {

             /*
        Write a return method that can sort an int array in descending order
        without using the sort method of the Arrays class
        Ex : int [] arr = {10,20,7,8,90};
        arr = sort (arr); ==>  {90,20,10,8,7};
         */

        int [] arr = {10,20,7,8,90};

        bykckSirala(arr);
        System.out.println("descending(arr) = " + Arrays.toString(arr));
    }

    private static void bykckSirala(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int sirasi=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]<sirasi) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=sirasi;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int [] descending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int gecici = 0;
                if (arr[i] < arr[j]) {
                    gecici = arr[i];
                    arr[i] = arr[j];
                    arr[j] = gecici;
                }
            }
        }
        return arr;
    }
}

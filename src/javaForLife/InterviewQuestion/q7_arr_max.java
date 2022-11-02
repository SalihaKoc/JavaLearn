package javaForLife.InterviewQuestion;

import java.util.Arrays;

public class q7_arr_max {

    public static void main(String[] args) {

       // Write a return method that can the maximum number from an int Array

        int[] arr ={12,5,-6,36,47,-150,9,0,21};

        System.out.println("maxValue(arr) = " + maxValue(arr));
        maxBul(arr);

    }

    public static int maxValue(int[]arr) {
        int max= Integer.MIN_VALUE;
        for (int each:arr) {
            if(each>max)
                max=each;
        }
        return max;
    }
    private static void maxBul(int[] arr) {
        Arrays.sort(arr);
        System.out.println("max sayı= " + arr[arr.length - 1]);
    }
}

package javaForLife.InterviewQuestion;

import java.util.Arrays;

public class q8_arr_min {

    public static void main(String[] args) {


        //Write a return method that can minimum number from an int Array

        int[] arr ={12,5,-6,36,47,-150,9,0,21};

        System.out.println("minValue(arr) = " + minValue(arr));
        System.out.println("min sayı = " + minBul(arr));

    }
    public static int minValue(int[]arr) {
        int min= Integer.MAX_VALUE;
        for (int each:arr) {
            if(each>min)
                min=each;
        }
        return min;
    }
    private static int minBul(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
}

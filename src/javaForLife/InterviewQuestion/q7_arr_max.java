package javaForLife.InterviewQuestion;

import java.util.Arrays;

public class q7 {

    public static void main(String[] args) {

       // Write a return method that can the maximum number from an int Array

        int[] arr ={12,5,-6,36,47,-150,9,0,21};

        maxBul(arr);

    }
    private static void maxBul(int[] arr) {
        Arrays.sort(arr);
        System.out.println("max sayı= " + arr[arr.length - 1]);
    }
}

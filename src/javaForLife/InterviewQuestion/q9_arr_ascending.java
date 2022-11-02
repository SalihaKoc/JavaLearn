package javaForLife.InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;

public class q9_arr_ascending {

    public static void main(String[] args) {

        /*
        Write a return method that can sort an int array in Ascending
        order without using the sort method of the Arrays class
        Ex : int[] arr = {10,9,8,7};
             arr = Sort(arr); ==> {7,8,9,10};
         */

     //   int[] arr = {10, 9, 8, 7};
        int [] arr = {10,20,7,8,90};
        System.out.println("ascending(arr) = " + Arrays.toString(arr));

        sortAscending(arr);
    }

    //Nested loop & swap
    private static int [] ascending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int gecici = 0;
                if (arr[i] > arr[j]) {
                    gecici = arr[i];
                    arr[i] = arr[j];
                    arr[j] = gecici;
                }
            }
        }
        return arr;
    }

    //Arraylist
    public static int [] sortAscending(int [] arr) {

        ArrayList <Integer> list=new ArrayList<>();
        for (int i:arr) {
            list.add(i);
        }
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=findMin(list);
            list.remove(Integer.valueOf(arr[i]));
        }
        return arr;
    }

    private static int findMin(ArrayList<Integer> list) {
        int min=Integer.MAX_VALUE;
        for (int each:list) {
            min=Math.min(min,each);
        }
        return min;
    }
}
package javaForLife.InterviewQuestion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class q11 {

    /*
    Write a function that, given an integer N (1 < N < 100),
    returns an array containing N unique integers that sum up to 0,
    The function can return any such array. Ex : given N = 4,
    The function could return [1,0,-3,2] or [-2,1,-4,5].
    The answer [1,-1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]
    (but there are many more correct answers).
    5
    -2 -1 0 1 2
    4
    -2 -1 1 2
     */

    // public static void main(String[] args) {

    //     int num=4;
    //     int []arr= unique(num);
    //     System.out.println(Arrays.toString(arr));

    // }
    // public static int[] unique(int num) {

    //
    // }

    public static void main(String[] args) {

        StringBuilder strB1 = new StringBuilder("AVATAR");

        strB1.subSequence(1,5);
        System.out.println(strB1);

        strB1.reverse();

        strB1.deleteCharAt(2);

        System.out.println(strB1);
    }


}

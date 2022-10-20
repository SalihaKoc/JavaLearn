package CodeChallenge.day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q05_Arrays {

    public static void main(String[] args) {

        /*
   Find the middle element in an integer array
   Example:  (10, 5, 6) ==> (5, 6, 10) ==> Output=6
             (16, 5, 8, 10) ==> (5, 8, 10, 16) ==> Output=(8+10)/2 = 9
*/
        int sayilar[]= {16, 5, 8,10};

        int orta= sayilar.length/2;

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

        if(sayilar.length%2!=0) {
            System.out.println("orta = " + sayilar[orta]);

        } else {
            orta = (sayilar[orta] + sayilar[orta - 1]) / 2;
            System.out.println("orta = " + orta);
        }

        /*
        int[] a = {16,5,8,10};
        Arrays.sort(a);
        int middle=a[0];
        if(a.length%2==0){
            middle=(a[a.length/2-1]+a[a.length/2])/2;
        }else
            middle=a[a.length/2];

        System.out.println(middle);
         */


    }
}

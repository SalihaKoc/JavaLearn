package J15_Arrays.Arrays_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {

        // Task-> girilen int değeri tersten print eden code create ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.print("kaç elemanlı array istiyorsunuz : ");
        int eleman=scan.nextInt();

        int arr[]=new int[eleman];
        int[] tersArr =new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+". elemanı giriniz : ");
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i=arr.length-1; i>=0; i--){

            System.out.print(+arr[i]+" ");}

    }
  
}

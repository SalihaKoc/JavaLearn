package J15_Arrays.Arrays_Tasks;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.

        int arr[]=new int[7];
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+". indexi girin : ");
            arr[i]=scan.nextInt();
        }
        System.out.println("array'imiz : "+ Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}

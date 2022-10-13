package J15_Arrays.Arrays_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz

        int arr[]=new int [5];

        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+".index girin : ");
            arr[i]=scan.nextInt();
        }
        System.out.println("array'in ilk hali : "+ Arrays.toString(arr));

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }

    }
}

package javaForLife.CnytHcTasks;

import java.util.Arrays;
import java.util.Scanner;

public class C03_ElemanToplam {

    public static void main(String[] args) {

        /**
         * Size verilen tek boyutlu herhangi bir integer arrayinin her indexinde, kendisi dahil kendinden önceki elemanlarının toplamı olacak şekilde array return eden method create ediniz
         * Örn: input -->{1,1,1,1}--->Output-->{1,2,3,4}
         */

        Scanner scan=new Scanner (System.in);
        System.out.print("kac elemanlı array girmek istersiniz : ");
        int eleman=scan.nextInt();

        int arr[]=new int[eleman];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+". eleman girin : ");
            arr[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int yeniArr[]=new int [arr.length];
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
            yeniArr[i] = toplam;
        }
        System.out.println(Arrays.toString(yeniArr));
    }

}

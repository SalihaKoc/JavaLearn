package J15_Arrays.Arrays_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)
         */

        int arr[]=new int[8];

        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+". index giriniz : ");
            arr[i]=scan.nextInt();
        }
        System.out.println("sayılar : "+Arrays.toString(arr));

        int sayac=0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]%3==0){
                sayac++;
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println(sayac+ " adet sayı 3 e bölünebiliyor");

    }

}

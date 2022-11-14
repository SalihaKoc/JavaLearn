package InterviewChallenge.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_DifferenceBetweenArray_LargestAndSmallestElements {

    /*Create a function that takes an array and the difference between the largest and the smallest numbers.
    Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile en kucuk elemanının  farkını bulan bir method create ediniz.
    */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Array uzunluk giriniz : ");
        int uzunluk= scan.nextInt();
        int arr[]=new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.print("arrayin "+ (i+1)+". elemanı : ");
            arr[i]= scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sıralanmış hali : " + Arrays.toString(arr));
        System.out.println("En büyük ile en küçük eleman farkı = "+ (arr[uzunluk-1]-arr[0]));

    }
}

package javaForLife.InterviewQuestion;

import java.util.Arrays;

public class q11_sumUpToZeroArray {

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
    public static void main(String[] args) {

      //Scanner scan=new Scanner(System.in);
      //System.out.println("1 ile 100 arasında bir sayı giriniz : ");
      //int sayi=scan.nextInt();
        int sayi=5;
        int arr[]=toplaSifir(sayi);
        System.out.println(Arrays.toString(arr));
      /*  int arr[]=new int[sayi];
        Random rastgele = new Random();

        int toplam = 0;
        for (int i=0;i< arr.length;i++) {
            arr[i] +=rastgele.nextInt(100);
            toplam+=arr[i];
        }
        System.out.println(Arrays.toString(arr));*/

    }
    private static int[] toplaSifir(int sayi) {

        int arr[]=new int[sayi];
        if(sayi%2==1)
            arr[sayi/2]=0;

        for (int i=0; i<sayi/2;i++) {
            arr[i]=-(i+1);
            arr[sayi-1-i]=i+1;
        }
        return arr;
    }

   //public static int [] sumZero2(int x){
   //    int arr2 [] = new int[x];
   //    int sum=0;
   //    int max=10;
   //    int min=-10;
   //    for(int i=0; i<x-1;i++){
   //        if((arr2[i]!=((int)(Math.random()*((max-min)+1)+min)))){
   //            arr2[i]=(int)(Math.random()*((max-min)+1)+min);
   //            sum+=arr2[i];
   //        }
   //    }
   //    arr2[x-1]=-sum;
   //    return arr2;
    }



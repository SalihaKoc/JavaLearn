package J15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        //task-> girilen int array elemanları toplamını print eden code

        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç elemanlı array istiyorsunuz : ");
        //int boyut=scan.nextInt();

        int sayilarArr []=new int[scan.nextInt()]; //boyutu belirlenmiş boş int array
        int arrToplam=0;
    for (int i = 0; i < sayilarArr.length; i++) {
        System.out.print(i + ". index eleman giriniz : ");

        sayilarArr[i]=scan.nextInt();
        arrToplam+=sayilarArr[i];
    }
    System.out.println("girdiğiniz array : " + Arrays.toString(sayilarArr));

    System.out.println("toplam : " + arrToplam);


       /* for each ile ...
       for (int sayi: sayilarArr) {
            arrToplam+=sayi;
        }
        System.out.println(arrToplam); */

    }
}

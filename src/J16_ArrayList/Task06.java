package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /* TASK :
    Kullanıcıdan alacağınız 6 elemanlı bir dizinin
    sadece tek elemanlarını ayrı diziye bir metodda atayarak
    yazdırınız.
    */
        int sayiArr[]=new int[6];

        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < sayiArr.length; i++) {
            System.out.print(i+1+".elemanı giriniz : ");
            sayiArr[i]= scan.nextInt();
        }

        System.out.println("tekElemanlar(sayiArr) = " + tekElemanlar(sayiArr));

    }

    private static ArrayList<Integer> tekElemanlar(int[] sayiArr) {

        ArrayList<Integer>tekSayilar=new ArrayList<>(); //tek sayıların atanacağı boş list
        for (int i = 0; i < sayiArr.length ; i++) {
            if (sayiArr[i]%2==1) {
                tekSayilar.add(sayiArr[i]); //tek olma şartı sağlayan array elemanı liste eklendi
            }
        }
        return tekSayilar;

    }
}

package InterviewChallenge.day1;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
   /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string giriniz : ");
        String metin=scan.nextLine();

        //split
        String arr[]=metin.split(""); //her bir karakteri ayırır
        System.out.println(Arrays.toString(arr));
        //sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //sayac olustur
        int sayac=0;
        //karakterleri karsılastırmak için for loop

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i-1].equals(arr[i])) { //birden fazla sayıdaki karakter için
                sayac++;
            }else { //tek sayıdaki karakter için calısır
                System.out.println(arr[i-1] + " sayısı " + (sayac+1));
                sayac=0;
            }
             if(i==arr.length-1) { //en son karakter için
                 System.out.println(arr[i] + " sayısı "+ (sayac+1));
             }
        }
scan.close();
    }

}

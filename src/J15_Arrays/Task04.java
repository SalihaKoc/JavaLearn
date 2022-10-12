package J15_Arrays;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        //task-> girlen bir int elemanlarından ortalamadan büyük olan eleman sayısını print eden code

        Scanner scan=new Scanner(System.in);
        System.out.print("kaç boyutlu array istiyorsunuz : ");

        int toplam=0;
        int arr[]=new int[scan.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+". index elemanı giriniz : ");
            arr[i]=scan.nextInt();
            toplam+=arr[i];
        }
        System.out.println("toplamları : "+toplam);
        int ortalama=toplam/arr.length;
        System.out.println("ortalama : "+ortalama);
        int ortalamayiGecenElemanSayisi=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>ortalama) {
                ortalamayiGecenElemanSayisi++;
            }
        }
        System.out.print("girilen elemanlardan ortalamayı gecen eleman sayısı : "+ortalamayiGecenElemanSayisi);

scan.close();
    }
}

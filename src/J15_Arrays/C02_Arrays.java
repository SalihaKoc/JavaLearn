package J15_Arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        //array elemanı kontrol etme...

        int arr[]={67,97,20,63,43,34,54,24,16,7,55,17};

        int sayi=33;

        boolean flag=false;

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i]==sayi){
                flag=true;
                break;
            }
        }
        if (flag) {
            System.out.println("aradığınız sayı array de var");
        }else System.out.println("aradığınız sayı array de yok");

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[7, 16, 17, 20, 24, 34, 43, 54, 55, 63, 67, 97]
        System.out.println(Arrays.binarySearch(arr,34)); // 5 binarySearch(arr,54)--> method aranan elemanı array'deki yerini(indexini) verir
        System.out.println(Arrays.binarySearch(arr,16)); // 1
        System.out.println(Arrays.binarySearch(arr,21)); // -5

        // TRICK-> binarySearch() methodu arrayde olmayan elemanı çalışırsa sonuç olarak: eğer bu eleman arrayde olsaydı  kacıncı SIRA'da olurdu cevabını verir
        System.out.println(Arrays.binarySearch(arr,5)); //-1

    }


    }

package J15_Arrays;

import java.util.Arrays;

public class C05_Arrays {

    public static void main(String[] args) {

        //Array copy... copyOf(arr,newlength); -> girilen arr'in newLength kadar ilk elemanını kopyalar

        int sayi[]={63,21,47,27,35,12,36,31,46,24};

        int yeniArr[]= Arrays.copyOf(sayi,5);
        System.out.println("sayıdan 5 eleman kopyalanan yeniArr = "+Arrays.toString(yeniArr)); // [63, 21, 47, 27, 35]

        int baskaArr[]=Arrays.copyOfRange(sayi,3,8); //3 dahil , 8 dahil değil
        System.out.println("baskaArr = " + Arrays.toString(baskaArr)); // [27, 35, 12, 36, 31]
        int baskaArr1[]=Arrays.copyOfRange(sayi,3,sayi.length);
        System.out.println("baskaArr1 = " + Arrays.toString(baskaArr1));

        //Array'ı belirli bir eleman ile update(set) etme... fill(arr,value);

        Arrays.fill(sayi,99);
        System.out.println("sayı arr 99 ile fulllemiş hali = "+Arrays.toString(sayi)); //[99, 99, 99, 99, 99, 99, 99, 99, 99, 99]

        Arrays.fill(sayi,3,7,33);
        System.out.println("sayı arr 3ile7 index arası 33 ile fulllemiş hali = "+ Arrays.toString(sayi)); //[99, 99, 99, 33, 33, 33, 33, 99, 99, 99]





    }
}

package CodeChallenge.day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q06_ArrayList {

    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        int arr[]={15,2,-36,4,21,0,71,-2,10};

        int n = 3;
        //bir liste olusturalim
        List<Integer> list = new ArrayList<>();
        for (Integer each : arr) {
            list.add(each);
        }
        List<Integer> maxList = new ArrayList<>();
        int count = 0;
        while (count < n) {//max liste eklenecek eleman sayisi kontrolu
            int max = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max) { //listedeki herhangi bir eleman, max dan buyukse
                    max = list.get(i); //o max olsun
                }
            }
            maxList.add(max); //o max degeri maxListe ekle
            list.remove(list.indexOf(max));//ayni buyuk sayi olmamasi icin, bulunan en buyuk sayiyi ilk listten siler
            count++;
        }
        System.out.println("Arrayin ilk " + n + " max degerleri " + maxList);
    }
}

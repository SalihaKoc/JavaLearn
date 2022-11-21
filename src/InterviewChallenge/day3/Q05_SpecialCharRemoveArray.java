package InterviewChallenge.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Q05_SpecialCharRemoveArray {

    public static void main(String[] args) {

        /*
    Problem Tanımı :
    getSum isminde bir method oluşturun.
    Parametresi ArrayList'tir.
    Dizideki tüm $ ları kaldır ve tüm sayıları topla
    return yaptğımız veri tipi 'int' olmalıdır.
    sonuç 0'dan küçükse, -1 yazdırın.

    Örnek1:
    ArrayList = $13, $15, $20
    Cevap = 48 olmalı

    Örnek 2 :
    ArrayList= $-13, $0, $0
    Cevap = -1 olmalı.
     */

        ArrayList<String> list=new ArrayList<>(Arrays.asList("$13", "$15", "$20"));
        ArrayList<String> list1=new ArrayList<>(Arrays.asList("$-13", "$15", "$-20"));

        System.out.println("getSum(list) = " + getSum(list));
        System.out.println("getSum(list1) = " + getSum(list1));

    }

    private static int getSum(ArrayList<String> list) {

        int toplam=0;
        for (String each: list) {
            String str=each.replace("$","");
            toplam+=Integer.parseInt(str);
        }
        if(toplam<0) {
            return -1;
        }else return toplam;
    }
}

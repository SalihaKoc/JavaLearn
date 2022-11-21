package InterviewChallenge.day3;

import java.util.ArrayList;
import java.util.List;

public class Q02_CreateRandomList_SetList {

    public static void main(String[] args) {

        // int array list oluşturun 10 elemandan oluşmalı
        // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
        // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
        // eğer çift sayı atarsa o elemanının yerine 111 yazsın
        // eğer çift sayı yoksa çift sayı yoktur mesajını versin.

        List<Integer> list=new ArrayList<>();
        randomEkle(list);

    }
    private static void randomEkle(List<Integer> list) {

        for (int i = 0; i < 10 ; i++) {
            list.add((int) (Math.random() * 20));
            //System.out.println((list.get(i) % 2 == 0) ? list.set(i, 111) : "çift sayı yoktur");
        }
        System.out.println(list); //random sayılardan olusan liste
        int sayac=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==0) {
                sayac++;
                list.set(i,111); // o elemanın yerine 111 yazıyo
            }
        }
        System.out.println(list); //111 ile set edilmiş hali
        if(sayac==0) {
            System.out.println("cift sayı yoktur");
        }
    }
}

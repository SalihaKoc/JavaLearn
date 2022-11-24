package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_map {

    /*map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak
    (update) için Map kullanılmaktadır.
     */
    public static void main(String[] args) {

        List<Integer> sayi=new ArrayList<>(Arrays.asList(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));

        ciftKarePrint(sayi); //576 1444 1764 4356 2116 256
        System.out.println("\n");
        tekKupArtBir(sayi); //117650 35938 344 28 421876 91126 166376 42876 15626 300764
        System.out.println("\n");
        ciftKok(sayi);

    }

    // Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz

    public static void ciftKarePrint(List<Integer> sayi) {

        sayi.stream().filter(C01_LambdaExpression::ciftMi). //akıstaki çift elemanlar filtrelendi
                map(t->t*t). //akısta filtrelenen çift elemanlar karesi alınarak update edildi akısa sokuldu
                forEach(C01_LambdaExpression::yazdir); // akışta filtrelenmiş çift elemanlar karsı alınıp işaretlenen akıştan print edildi
    }

    // Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi
    public static void tekKupArtBir(List<Integer> sayi) {

        sayi.stream().filter(C01_LambdaExpression::tekMi).map(t-> t*t*t+1 ).forEach(C01_LambdaExpression::yazdir);
        System.out.println();
        sayi.stream().filter(C01_LambdaExpression::tekMi).map(t->(int)Math.pow(t,3)+1).forEach(C01_LambdaExpression::yazdir);
    }

    // Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void ciftKok(List<Integer> sayi){

        sayi.stream().filter(C01_LambdaExpression::ciftMi).map(t->(int)Math.sqrt(t)).forEach(C01_LambdaExpression::yazdir); //int'e casting yaptık
        System.out.println();
        sayi.stream().filter(C01_LambdaExpression::ciftMi).map(Math::sqrt).forEach(t->System.out.print(t+" ")); //double cıktı
    }

}

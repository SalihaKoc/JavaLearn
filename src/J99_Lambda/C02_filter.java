package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_filter {

    public static void main(String[] args) {

        List<Integer> sayi=new ArrayList<>(Arrays.asList(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));

        printCiftElStructured(sayi); //24 38 42 66 46 16
        System.out.println("\n");
        printCiftElFunctional(sayi); //24 38 42 66 46 16
        System.out.println("\n");
        printCiftElFunctional1(sayi); //24 38 42 66 46 16
        System.out.println("\n");
        print35tenKckCift(sayi); //24 16
        System.out.println("\n");
        print34BykCift(sayi); //24 38 49 42 66 75 45 46 55 35 67 16
    }

    //Task : "Structured Programming":Amele code kullanarak list elemanlarının çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printCiftElStructured( List<Integer> sayi) {

        for (Integer w: sayi) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }
    //Task : "Functional Programming":cincix code kullanarak list elemanlarının çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printCiftElFunctional( List<Integer> sayi) {

        sayi.
                stream(). //list elemanları akışa alındı
                filter(t->t%2==0). //akıştaki list elemanları çift olma sartına göre fitrelendi : akıştan çıkarıldı -> lambda exp..bad practice
                forEach(C01_LambdaExpression::yazdir); //C01 Class'daki yazdır method refere (call) edildi
    }

    public static void printCiftElFunctional1( List<Integer> sayi) {

        sayi.
                stream(). //list elemanları akışa alındı
                filter(C01_LambdaExpression::ciftMi). //akıştaki list elemanları çift olma sartına göre fitrelendi : akıştan çıkarıldı
                forEach(C01_LambdaExpression::yazdir); //C01 Class'daki yazdır method refere (call) edildi
    }
    //Task : "Functional Programming":cincix code kullanarak list elemanlarının 35 den küçük  çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void print35tenKckCift( List<Integer> sayi) {

        sayi.stream().filter(C01_LambdaExpression::ciftMi).filter(a->a<35).forEach(C01_LambdaExpression::yazdir);

        sayi.stream().filter(a->a<35 && a%2==0).forEach(C01_LambdaExpression::yazdir);
    }
    //Task : "Functional Programming":cincix code kullanarak list elemanlarının 34 den büyük YA DA  çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void print34BykCift( List<Integer> sayi) {

        sayi.stream().filter(t -> t>34 || t%2 == 0).forEach(t -> System.out.print(t + " "));

    }

}

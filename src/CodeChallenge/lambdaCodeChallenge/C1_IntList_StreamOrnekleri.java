package CodeChallenge.lambdaCodeChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C1_IntList_StreamOrnekleri {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

        yazdir(list);
        System.out.println();
        System.out.println(negatifYazdir(list));
        pozitifList(list);
        System.out.println(kareList(list));
        System.out.println(kareTekrarsiz(list));
        sirala(list);
        System.out.println();
        sirala2(list);
        System.out.println();
        System.out.println(son5bas(list));
        System.out.println(son5basDegil(list));
        System.out.println(topla(list));
        System.out.println(negatifKareList(list));
    }

    //s11: peek örneği çözelim- negatiflerin karelerinden list olusturalım
    /*
 peek () 'in Javadoc sayfası şöyle diyor: " Bu yöntem, temelde, öğeleri bir ardışık düzen içinde belirli
 bir noktadan geçerken görmek istediğiniz yerde hata ayıklamayı desteklemek için vardır .
 Ara islemdir.. yapilam islemi gormek icin kullanilir
    */
    private static List<Integer> negatifKareList(List<Integer> list) {
        return list.stream().filter(x->x<0).peek(x-> System.out.println("negatifler : "+x)).
                map(x-> x*x).peek(x-> System.out.println(" kareleri :" + x)).collect(Collectors.toList());
    }

    //s10: list elemanlarının toplamını bulalım
    private static int topla(List<Integer> list) {
        return list.stream().reduce(0,(x,y)->(x+y));
    }

    //s9: list pozitif elemanları için karelerini bulup birler basamagı 5olmayanlardan yeni bir list olusturalım
    private static List<Integer> son5basDegil(List<Integer> list) {
        return list.stream().filter(x->x>0).map(t->t*t).filter(x->x%10!=5).collect(Collectors.toList());
    }

    //s8: list pozitif elemanları için kupleri bulup birler basamagı 5olanlardan yeni bir list olusturalım
    private static List<Integer> son5bas(List<Integer> list) {
        return list.stream().filter(x->x>0).map(t->t*t*t).filter(x->x%10==5).collect(Collectors.toList());
    }

    //s7: listin elemanlarını buyukten kucuge sıralayalım
    private static void sirala2(List<Integer> list) {
        list.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    }

    //s6: listin elemanlarını kucukten buyuge sıralayalım
    private static void sirala(List<Integer> list) {
        list.stream().sorted().forEach(x-> System.out.print(x+" "));
    }

    //s5:
    private static List<Integer> kareTekrarsiz(List<Integer> list) {
        return list.stream().map(t->t*t).distinct().collect(Collectors.toList());
    }

    //s4: listim elemanlarının karelerinden yeni bir list olusturun
    private static List<Integer> kareList(List<Integer> list) {
        return list.stream().map(t-> t*t).collect(Collectors.toList());
    }

    //s3: pozitif olanlardan yeni bir liste olustur
    private static void pozitifList(List<Integer> list) {
        System.out.println(list.stream().filter(t -> t > 0).collect(Collectors.toList()));
    }

    //s2: sadece negatif olanları yazdırın
    private static List<Integer> negatifYazdir(List<Integer> list) {
        return list.stream().filter(x->x<0).collect(Collectors.toList());
    }

    //s1: listi aralarında bosluk bırakarak yazdırın
    private static void yazdir(List<Integer> list) {
        list.stream().forEach(x-> System.out.print(x+" "));
    }
}

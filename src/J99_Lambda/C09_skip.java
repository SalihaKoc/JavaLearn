package J99_Lambda;

import Lambda.Lambda_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C09_skip {

    public static void main(String[] args) {

        //skip(n) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış return eder.
        //akış n'den daha az eleman içeriyorsa skip(n) methoddan sonra boş akış return eder. skip(n) ara işlemdir.

        List<String> menu=new ArrayList<>(Arrays.asList("soğanli","trileçe","büryan","küşleme","welemen","bicibici","cacix","kokorec","yağlama","güvec","bicibici","arabaşi","tantuni"));

        ilkIkiHaricSonHarfSirali(menu);

    }

    // Task : list elemanlarini son harfine göre siralayıp ilk iki eleman hariç kalan elemanlari print ediniz.

    public static void ilkIkiHaricSonHarfSirali(List<String> menu){

        System.out.println(Arrays.asList(menu.stream().
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))). //akıştaki elemanların son karakterine göre sıralandı
                skip(2). //akıştaki ilk 2 eleman akıstan atıldı
                toArray())); //akış elemanları bir array'e atandı

        menu.stream().sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).skip(2).collect(Collectors.toList()).forEach(Lambda_Methods::bosluklaYazdir);

        menu.stream().sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).//akısdaki elelmanların son karakrerine göre sıralanadı
                skip(2).forEach(t-> System.out.print(t+" "));//akısdaki ilk 2 eleman akısdan atıldı
    }
}

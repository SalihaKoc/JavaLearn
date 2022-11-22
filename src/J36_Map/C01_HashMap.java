package J36_Map;

import java.util.HashMap;
import java.util.HashSet;

public class C01_HashMap {

    public static void main(String[] args) {

 /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir. Key değeri benzersiz(unique) olmalı
             dublicate kabul etnez
             Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
            null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
            HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri aralarina = sembolu konularak yazdirilir
            HashMap'ler tanımlanırken rastgele siralama yapar  HasMap map'ler arasinda en hizlisidir.
            HashMap'ler "thread safe" degildir.
 */

        HashMap<String, String> hm = new HashMap<>();

        //map.put(); -> girilen key, value datayı map'e eleman olarak ekler

        hm.put("Amazon","296 Euro");
        hm.put(null,"200 Euro"); //key null deger kabul eder
        hm.put(null,"222 Euro"); //tekrarlı key degerine value update edilir. Aynı key kullanıldıgında uzerine atama yapılır
        hm.put("Ebay",null); //value değeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple Store","333 Euro");
        hm.put("Apple Store","500 Euro"); ///Apple store keydeki value 333 iken 500 olarak update edildi
        hm.put("MedieMarkt ","183 Euro");

        //map sout komutuna parametre olarak print edilir
        System.out.println("hm = " + hm); //hm = {null=222 Euro, MedieMarkt =183 Euro, Apple Store=500 Euro, Saturn=300 Euro, Ebay=null, Amazon=296 Euro, Vatan=111 Euro}


    }
}
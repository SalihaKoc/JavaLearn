package J36_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {

    public static void main(String[] args) {

        /*
        TreeMap ->
        1- TreeMap key'lerde null değer tanımlanamaz. Fakat value'larda null değer tanımlanabilir.
        2- TreeMap elemanlarının key Naturel Order'a göre (alfabetik-aritmetik) tanımlar.
        3- TreeMap thread-safe ve synchronized değildir.
        4- TreeMap en yavaş map türüdür. Kullanırken çok dikkat edilmeli... app hızı için
        */

        TreeMap <Integer,String> tm=new TreeMap<>();

        tm.put(105,"Emine");
        tm.put(101,"Uğur");
        tm.put(104,"Fatih");
        tm.put(102,"Enise");
        tm.put(103,"Kevser");

        System.out.println("tm = " + tm); //{101=Uğur, 102=Enise, 103=Kevser, 104=Fatih, 105=Emine}

        //tm.put(null,"Kevser"); //NullPointerException
        tm.put(103,"Hüma"); //value değeri update edildi
        tm.put(106,null);
        tm.put(107,null);

        System.out.println("tm = " + tm); //{101=Uğur, 102=Enise, 103=Hüma, 104=Fatih, 105=Emine, 106=null, 107=null}

        HashMap<String, String> hm = new HashMap<>();

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple Store","333 Euro");
        hm.put("MedieMarkt ","183 Euro");

        TreeMap <String,String> tm1=new TreeMap<>(hm);

        System.out.println("tm1 = " + tm1); //{Amazon=296 Euro, Apple Store=333 Euro, Ebay=234 Euro, MedieMarkt =183 Euro, Saturn=300 Euro, Vatan=111 Euro}

        System.out.println("tm.ceilingKey(103) = " + tm.ceilingKey(103)); //103 ceilingKey(103);->method parametre olarak girilen key değer map'de varsa return eder
        // yoksa parametreden buyuk en kuçuk key değerini return eder.
        //parametre map'de yok ve parametreden buyuk en kucuk  key de yoksa null return eder
        //ceilingKey(key)-> en kucuk abi-abla
        System.out.println("tm.ceilingKey(100) = " + tm.ceilingKey(100)); //101
        System.out.println("tm.ceilingKey(108) = " + tm.ceilingKey(108)); //null

        System.out.println("tm1.ceilingKey(\"Hüma\") = " + tm1.ceilingKey("Hüma"));

        //ascending order -> artan sıralama
        //descending order -> azalan sıralama

        System.out.println("tm.descendingKeySet() = " + tm.descendingKeySet()); //[107, 106, 105, 104, 103, 102, 101]
        System.out.println("tm.keySet() = " + tm.keySet()); //[101, 102, 103, 104, 105, 106, 107]
        System.out.println("tm.firstKey() = " + tm.firstKey()); //101
        System.out.println("tm.lastKey() = " + tm.lastKey()); //107

        System.out.println("tm.tailMap(102) = " + tm.tailMap(105)); //{105=Emine, 106=null, 107=null}
    }
}

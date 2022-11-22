package J36_Map;

import java.util.HashMap;

public class C02_keySet_values {

    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();

        //map.keySet(); -> map key değerlerini Set'e atayıp return eder
        //map.value(); -> map value değerlerini coll atayıp return eder

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple Store","333 Euro");
        hm.put("MedieMarkt","183 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.keySet() = " + hm.keySet()); //hm.keySet() = [MedieMarkt, Apple Store, Saturn, Ebay, Amazon, Vatan]
        System.out.println("hm.values() = " + hm.values()); //hm.values() = [183 Euro, 333 Euro, 300 Euro, 234 Euro, 296 Euro, 111 Euro]

        //Task -> hm key ve value degerlerini satır satır print ediniz. with for loop

        for (String k:hm.keySet()) { //key
            System.out.println(k);
        }

        for (String v: hm.values()) { //value
            System.out.println(v);
        }
    }
}

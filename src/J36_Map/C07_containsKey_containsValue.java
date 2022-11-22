package J36_Map;

import java.util.HashMap;

public class C07_containsKey_containsValue {

    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();

        //map.containsKey(); -> girilen key degerinin map'de varlıgını kontrol eder boolean return eder
        //map.containsValue(); -> girilen value degerinin map'de varlıgını kontrol eder boolean return eder

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple Store","333 Euro");
        hm.put("MedieMarkt","183 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.containsKey(\"Amazon\") = " + hm.containsKey("Amazon")); //true
        System.out.println("hm.containsKey(\"amazon\") = " + hm.containsKey("amazon")); //false

        System.out.println("hm.containsValue(\"296 Euro\") = " + hm.containsValue("296 Euro")); //true
        System.out.println("hm.containsValues(\"ebikGabık\") = " + hm.containsValue("ebikGabık")); //false
    }
}
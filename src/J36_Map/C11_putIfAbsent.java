package J36_Map;

import java.util.HashMap;

public class C11_putIfAbsent {

    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();

        //map.putIfAbsent() -> girilen key map'de yoksa entry(key,value) map'e ekler ve null return eder
                            // girilen key map'de varsa key'e ait value return eder

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple Store","333 Euro");
        hm.put("MedieMarkt","183 Euro");

        System.out.println("hm = " + hm); //{MedieMarkt=183 Euro, Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, Amazon=296 Euro, Vatan=111 Euro}

        System.out.println("hm.putIfAbsent(\"ebik\",\"gabık\") = " + hm.putIfAbsent("ebik", "gabık")); //null

        System.out.println("hm.putIfAbsent(\"Ebay\",\"javaCan\") = " + hm.putIfAbsent("Ebay", "javaCan")); //234 Euro

        System.out.println("hm = " + hm); //{MedieMarkt=183 Euro, ebik=gabık, Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, Amazon=296 Euro, Vatan=111 Euro}
    }
}

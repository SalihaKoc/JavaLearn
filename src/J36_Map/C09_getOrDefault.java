package J36_Map;

import java.util.HashMap;

public class C09_getOrDefault {

    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();

        //map.getOrDefault() -> Girilen key Map'de varsa key'e ait value, yoksa default değer return eder

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple Store","333 Euro");
        hm.put("MedieMarkt","183 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.getOrDefault(\"Ebay\",\"ebikGabık\") = " + hm.getOrDefault("Ebay", "ebikGabık")); //234 Euro
        //Ebay key map'de varoldugu için Ebay key'e aşt value : 234Euro return edildi

        System.out.println("hm.getOrDefault(\"ebik\",\"gabık\") = " + hm.getOrDefault("ebik", "gabık")); //gabık
        //ebik key map'de olmadıgı için key'e default deger gabık atanıp return edildi. Update olmuyor

        System.out.println("hm = " + hm); //update olmuyor...

    }
}

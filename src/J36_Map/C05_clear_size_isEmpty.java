package J36_Map;

import java.util.HashMap;

public class C05_clear_size_isEmpty {

    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();

        //map.size(); -> girilen map'in entry(giriş:eleman) sayısını return eder
        //map.clear() -> girilen map'in tüm entry(giriş:eleman) siler
        //map.isEmpty() -> girilen map'in tüm entry(giriş:eleman) varlıgını kontrol eder, boolean return eder

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple Store","333 Euro");
        hm.put("MedieMarkt","183 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size()); //6
        System.out.println("hm.isEmpty() = " + hm.isEmpty()); //false
        hm.clear();
        System.out.println("hm = " + hm); //{}
        System.out.println("hm.isEmpty() = " + hm.isEmpty()); //true
        System.out.println("hm.size() = " + hm.size()); //0

    }
}

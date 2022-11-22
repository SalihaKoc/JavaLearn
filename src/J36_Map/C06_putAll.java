package J36_Map;

import java.util.HashMap;

public class C06_putAll {

    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();

        //map.entrySet(); -> Gİrilen map'in key value tüm datalarını Set'e atayıp return eder

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple Store","333 Euro");
        hm.put("MediaMarkt","183 Euro");

        System.out.println("hm = " + hm);

        HashMap<String, String> hm1 = new HashMap<>();

        hm1.put("Köfteci Yusuf","Kaburga Izgara");
        hm1.put("Starbucks","Flat White");
        hm1.put("Nusret","Dana Spagetti");
        hm1.put("Clarusway","Offer");

        System.out.println("hm1 = " + hm1);

        hm.putAll(hm1);
        System.out.println("hm = " + hm);
        System.out.println("hm1 = " + hm1);

        //cıncıks code...
        HashMap<String, String> hm2 = new HashMap<>(hm1); //hm2 map hem tanımlandı hem de entry olarak hm1 atandı
        HashMap<String, String> hm3 = hm1;
        System.out.println("hm2 = " + hm2);
        System.out.println("hm3 = " + hm3);
    }
}

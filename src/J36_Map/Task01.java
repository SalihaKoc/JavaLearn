package J36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task01 {

    public static void main(String[] args) {

        HashMap <String,Integer> map =new HashMap<>();

        map.put("Amazon", 296);
        map.put("Ebay", 301);
        map.put("Saturn", 326);
        map.put("MediaMarkt", 340);
        map.put("Apple Store", 320);

        // task -> urun fiyatları toplamını hesaplayan code create ediniz..

        int toplam=0;
        for (int v:map.values()) {
           toplam+=v;
        }
        System.out.println("toplam = " + toplam);

        /*
        for (Map.Entry<String,Integer> a : map.entrySet()) {
            toplam+=a.getValue();
        }
        System.out.println("toplam = " + toplam);

         */
    }
}

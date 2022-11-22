package J36_Map;

import java.util.HashMap;

public class C08_replace {

    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();

        //map.replace(); -> girilen value degeri ilgili Key'de update edilir

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple Store","333 Euro");
        hm.put("MedieMarkt","183 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.replace(\"Amazon\",\"314 Euro\") = " + hm.replace("Amazon", "314 Euro")); //296 Euro :eski degeri return ediyor

        System.out.println("hm = " + hm); //{MedieMarkt=183 Euro, Apple Store=333 Euro, Saturn=300 Euro, Ebay=234 Euro, Amazon=314 Euro, Vatan=111 Euro}

        System.out.println("hm.replace(\"sefil\",\"Haluk\") = " + hm.replace("sefil", "Haluk")); //null : olmayan key için null return ediyor

    }
}

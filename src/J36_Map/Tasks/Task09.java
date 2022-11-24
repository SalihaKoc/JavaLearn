package J36_Map.Tasks;

import java.util.HashMap;
import java.util.Map;

public class Task09 {

    /*
     Task-> aşağıdaki çıktıyı print eden code create ediniz.
     Kiraz 100
     İncir 200
     Enginar 150
     Üzüm 145
     Nar 250

     */
    public static void main(String[] args) {

        Map<String, Integer> meyve = new HashMap<>();

        meyve.put("Kiraz", 100);
        meyve.put("İncir", 200);
        meyve.put("Enginar", 150);
        meyve.put("Üzüm", 145);
        meyve.put("Nar", 250);

        for (Map.Entry<String, Integer> myv: meyve.entrySet()) {
            System.out.println(myv.getKey()+" "+myv.getValue());
        }
    }

    }
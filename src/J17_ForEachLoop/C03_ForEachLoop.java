
package J17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {

    public static void main(String[] args) {

        // task-> iki string array eleamanlarının ortak olmasını kontrol eden code create ediniz..with for-each

        String arr1[] = {"nazım", "gülsüm", "dilek", "erol", "cüneyt", "ciğdem"};
        String arr2[] = {"musty", "gülsüm", "ayşe", "enise", "cüneyt", "ciğdem"};

        List<String> ortakIsim=new ArrayList<>();
        for (String s1: arr1) {
            for (String s2: arr2) {
                if(s1.equalsIgnoreCase(s2)) {
                    ortakIsim.add(s1);
                }
            }
        }
        if (ortakIsim.isEmpty()) {
            System.out.println("ortak isim yok"+ ortakIsim);
        }else
        System.out.println("Ortak isimler : " + ortakIsim);
    }
}

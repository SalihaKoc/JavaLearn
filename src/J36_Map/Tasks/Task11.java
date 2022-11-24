package J36_Map.Tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task11 {
      /*
    Count the words in a String one by one
    Bir Stringdeki kelimeleri saydırıp prnt eden code create ediniz .
    String Str = "Ali came to school and Ayse came to school"
    Ali=            1
    came=   2
    to=         2
    school= 2
    and=    1
    Ayse=   1
*/

    public static void main(String[] args) {

        String str = "Ali came to school and Ayse came to school";

        System.out.println(kelimeSay(str));

    }

    private static Map<String,Integer> kelimeSay(String str) {

        HashMap <String,Integer> map=new HashMap<>();

        String list[]=str.split(" ");
        System.out.println(Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            if (map.containsKey(list[i])) {
                map.put(list[i],map.get(list[i])+1);
            }else map.put(list[i],1);
        }

        return map;
    }
}
package J15_Arrays.Tasks;

import java.util.Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        String str="Removes white space from both ends of a string";

        String kelimeler[]=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        System.out.println(("kelime sayısı = "+ kelimeler.length));

    }
}
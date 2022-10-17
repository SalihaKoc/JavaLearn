package J15_Arrays.Tasks;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        String str="$12 $23 $10 $2 $5 $2";

        String yeni=str.replace("$", "");
        System.out.println(yeni);
        String arrStr[]=yeni.split(" ");
        System.out.println(Arrays.toString(arrStr));
        int toplam=0;
        for (int i = 0; i < arrStr.length; i++) {
            toplam += Integer.parseInt(arrStr[i]);
        }
        System.out.println("Sayılar toplamı = " + toplam);

    }
}
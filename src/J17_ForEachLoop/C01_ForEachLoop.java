package J17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {

    public static void main(String[] args) {

        /*
        for-each loop for loop'un gelişmiş halidir.
            1. clean code - yazım kolaylığı
            2. code okuma kolaylığı
            3. hata yapma riskini azaltır
         */

        List<Integer> sayiList= new ArrayList<>(List.of(16,5,2,33,22,27,41,24));
        
        //task1 -> list elemanlarını ayrı satırlara print eden code

        for (int i :sayiList) {
            System.out.println( i);
        }

        //task2 -> list elemanların ilk 3 eleman hariç tek olanları print eden code

        for (int a :sayiList.subList(2,sayiList.size())) {
            if (a%2!=0) {
                System.out.print(a+" ");
            }
        }

        //task3 -> list elemanlarının 2 ile 5 index elemanları toplayıp print eden code (2,3,4,5.indexler)

        int toplam=0;
        for (int b : sayiList.subList(2,6)) {
            toplam+=b;
        }
        System.out.println();
        System.out.println("2. ile 5. indexler arasındakilerin  toplamı = " + toplam);

    }
}

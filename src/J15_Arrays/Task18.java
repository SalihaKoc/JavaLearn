package J15_Arrays;

import java.util.Arrays;

public class Task18 {

    public static void main(String[] args) {

        //task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'e atayıp print eden code
        // input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        // output : int yeniArr[]={6,11,-7}

        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};

        int yeniArr[]=new int [sayi.length];

        for (int i = 0; i < sayi.length; i++) {
            int toplam=0;
            for (int j = 0; j < sayi[i].length; j++) {
                toplam+=sayi[i][j];
            }
            yeniArr[i] = toplam;
        }
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));


    }
}

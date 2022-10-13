package J15_Arrays.Arrays_Tasks;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

        System.out.println("rakamlar toplamı : " +arrRakamTopla());

    }

    private static int arrRakamTopla() {
        String str = "ade1r4d3";
        System.out.println("string ilk hali : "+str);
        str=str.replaceAll("\\D", "");
        System.out.println("string rakamsız : "+str);

        int toplam=0;

        int sayi[]=new int[str.length()];
        String str1[]=str.split("");
        for (int i = 0; i < str1.length; i++) {
            sayi[i]=Integer.valueOf(str1[i]);
            toplam+=sayi[i];
        }
        System.out.println(Arrays.toString(sayi));

        return toplam;
    }


}


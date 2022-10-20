package CodeChallenge.day08;

import java.util.Arrays;

public class Q04_Arrays {

    public static void main(String[] args) {

        /*
        Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
        String s= Apex,nesne yonelimli bir programlama dilidir"       */

        String s= "Apex,nesne yonelimli bir programlama dilidir";
        s= s.replace(",","").replace(" ",""); //Apexnesneyonelimlibirprogramlamadilidir
        System.out.println(s);

        int sayac=0;

        String sArr[]=s.split(""); //[A, p, e, x, n, e, s, n, e, y, o, n, e, l, i, m, l, i, b, i, r, p, r, o, g, r, a, m, l, a, m, a, d, i, l, i, d, i, r]
        System.out.println(Arrays.toString(sArr));

        String sesliHarfler []={"a","e","i","o","u"};
        System.out.println(Arrays.toString(sesliHarfler)); //[a, e, i, o, u]

        for (int i = 0; i < sArr.length ; i++) {
            for (int j = 0; j < sesliHarfler.length; j++) {
                if (sArr[i].equalsIgnoreCase(sesliHarfler[j])) { //equalsIgnoreCase -> byk-kck harf farkemeksizin eşitse
                    sayac++;
                }
            }
        }
        System.out.println(sayac); // 16

    }

}

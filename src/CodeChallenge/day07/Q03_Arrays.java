package CodeChallenge.day07;

import java.util.ArrayList;
import java.util.Arrays;

public class Q03_Arrays {

    public static void main(String[] args) {

        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin)
         */

        String metin="HeySiri";

        metin=metin.replace("Hey","Bye");

        System.out.println(metin);

        String metinArr[]=new String[1];

        metinArr[0]=metin;

        System.out.println(Arrays.toString(metinArr));

        /** 2.yol
            String  arr [] = {"HeySiri"};
                    System.out.println(Arrays.toString(arr).replace("Hey", "Bye"));
         */

        /* 3.yol
            String str1 = "HeySiri";
            String yeniStr [] = str1.split("y");
            System.out.println(Arrays.toString(yeniStr)); //[He, Siri]
            yeniStr[0] = "Bye" ;
            System.out.println(Arrays.toString(yeniStr)); //[Bye, Siri]
            str1 =yeniStr[0] +  yeniStr[1];
            System.out.println("str1 = " + str1);
            String arr2[] = new String[1];
            arr2[0] = str1;
            System.out.println(Arrays.toString(arr2));
            }
         */
    }
}

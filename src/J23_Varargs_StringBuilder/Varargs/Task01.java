package J23_Varargs_StringBuilder.Varargs;

import java.util.concurrent.atomic.AtomicBoolean;

public class Task01 {

    public static void main(String[] args) {

        /*
        Task ->
        verilen Stringleri birlestiren concat isimli METHOD create ediniz.
        input : "m", "e", "r", "v", "e";
        output : merve
         */
        String arr1[]={"m","e", "r", "v", "e"};
        String arr2[]={"a","l","i"};

        strBirlestir(arr1); //merve
        strBirlestir(arr2); //ali
        strBirlestir("javaCan"," enise"," hanım"); //javaCan enise hanım
        strBirles(arr1);
    }

    public static void strBirlestir(String ...str) {
        
        String birlesenStr="";

        for (String w: str) {
            birlesenStr=birlesenStr.concat(w);
        }
        System.out.println("birlesenStr = " + birlesenStr);
    }

    public static void strBirles(String ...str) {
        for (String i:str) {
            System.out.print(i);
        }
    }
}

package J10_StringManipulation;

public class C02_Length {

    public static void main(String[] args) {

        /*
        length() methodu girilen stringin uzunluğunu: içinde bulunan karakter sayısını return eder
         Bütün karakterleri (boşluk vs.) sayıp adedini verir.
         */

        String str="madem geldin dünyaya otur çalış javaya";

        int strKrktrSAyi =str.length(); //int type bir data verir

        System.out.println(str);
        System.out.println(strKrktrSAyi); //38
        System.out.println(str.length());

        String str1="";
        System.out.println(str1.length()); //0

        String str2=" ";
        System.out.println(str2.length()); //1

       // String str3=null;
       // System.out.println(str3.length()); //run time error

        //(str3.concat(str2)); RTE

        // TRICK -> null atanan stringler String method çalışmaz cısss
        /*
        null case sensitivedir. yani Null veya NULL yazılamaz
        null bir değer değildir. sadece hiçliği gösteren bir pointer(işaretçi)dir
         */

        String name; //deklare edilmiş ama atanmamış String method çalışmaz CTE verir
        // name.concat(str1);


    }
}

package CodeChallenge.day08;

public class Q02_Arrays {

    public static void main(String[] args) {

        /*
        *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
        *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
        */

        String cumle ="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";

        // 1. yol
        System.out.println("boşluklar hariç karakter sayısı  = " + cumle.replace(" ", "").length()); //58

        //2. yol
        String str[]=cumle.replace(" ","").split("");
        System.out.println("str.length = " + str.length); //58

        //3. yol

    }
}

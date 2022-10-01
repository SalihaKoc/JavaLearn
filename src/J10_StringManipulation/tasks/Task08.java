package J10_StringManipulation.tasks;

public class Task08 {

    public static void main(String[] args) {

        /*  TASK : Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */

        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(harfDepo.charAt(harfDepo.indexOf("S")) + harfDepo.charAt(harfDepo.indexOf("A")) + harfDepo.charAt(harfDepo.indexOf("L")) + harfDepo.charAt(harfDepo.indexOf("I")) + harfDepo.charAt(harfDepo.indexOf("H")) + harfDepo.charAt(harfDepo.indexOf("A"))); //434
        //ascii -> toplama
        System.out.println("" + harfDepo.charAt(harfDepo.indexOf("S")) + harfDepo.charAt(harfDepo.indexOf("A")) + harfDepo.charAt(harfDepo.indexOf("L")) + harfDepo.charAt(harfDepo.indexOf("I")) + harfDepo.charAt(harfDepo.indexOf("H")) + harfDepo.charAt(harfDepo.indexOf("A"))); //SALIHA
        //string -> concat

        /**
         char h=harfDepo.charAt(harfDepo.indexOf("H"));
         char a=harfDepo.charAt(harfDepo.indexOf("A"));
         char l=harfDepo.charAt(harfDepo.indexOf("L"));
         char u=harfDepo.charAt(harfDepo.indexOf("U"));
         char k=harfDepo.charAt(harfDepo.indexOf("K"));
         System.out.println(h+a+l+u+k);//asciii->toplama-> 373
         System.out.println(""+h+a+l+u+k);//string->concat-> HALUK
         */

    }
}

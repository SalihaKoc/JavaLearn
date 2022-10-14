package javaForLife.CnytHcTasks;

import java.util.Arrays;

public class C01_BykKckHarf {

    public static void main(String[] args) {

       String str = "vErilEn bİr meTnin tüM KelimeLerinin İlk Harflerİ BüYük DiğEr HARfleri KüÇük OlaCak ŞekilDe DüzenLeyiniz.";

        ilkHarfByt(str);

    }

    private static void ilkHarfByt(String str) {
        
       String str1[]=str.split(" ");

        System.out.println(Arrays.toString(str1));

       String yeniStr[]=new String[str1.length];
        for (int i = 0; i < str1.length; i++) {
            yeniStr[i] = (str1[i].toUpperCase().charAt(0)) + (str1[i].toLowerCase().substring(1));
        }
        System.out.println(Arrays.toString(yeniStr));

        for (int i = 0; i < yeniStr.length; i++) {
            System.out.print(yeniStr[i]+" ");
        }

    }
}

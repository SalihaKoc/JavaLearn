package javaForLife.InterviewQuestion;

import java.util.Scanner;

public class q1 {

    /*
    Write a a return method that check if a string is build out of the same letters as another string.
    Ex : same("abc", "cab"); --> true
        same("abc", "abb"); --> false
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci string ifade giriniz : ");
        String str1=scan.next().toLowerCase();
        System.out.print("İkinci string ifade giriniz : ");
        String str2=scan.next().toLowerCase();

        System.out.println(ayniHarfMi(str1, str2));
scan.close();
    }
    private static boolean ayniHarfMi(String str1, String str2) {

        boolean ayniHarf=false;
        int toplam=0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i)==str2.charAt(j)) {
                    toplam++; break;
                }
            }
        }
        if (toplam==str1.length()) {
            ayniHarf=true;
        }
        return ayniHarf;
    }
}

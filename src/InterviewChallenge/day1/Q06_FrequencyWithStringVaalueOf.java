package InterviewChallenge.day1;

import java.util.Scanner;

public class Q06_FrequencyWithStringVaalueOf {
      /*
    Count the frequency of the letters in a given String as the format below:
    Input: String str = "Java is so Good";
    Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
     */

    public static void main(String[] args) {

        String str = "Java is so Good";
        String strOutput ="";

        for (int i = 0; i < str.length(); i++) {
            int sayac=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)) {
                    sayac++;
                }
            }
            if(!strOutput.contains(String.valueOf(str.charAt(i)))) {
                strOutput+=""+str.charAt(i)+ sayac+" ";
            }
        }
        System.out.println(strOutput);
    }

}

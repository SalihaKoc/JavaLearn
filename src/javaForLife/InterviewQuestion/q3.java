package javaForLife.InterviewQuestion;

public class q3 {

    /*
    Write a return method that can find the unique characters from the string
    Ex :   unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        for (int i = 0; i < str.length(); i++) {

                if ((str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))))
                {
                    System.out.print(str.charAt(i));
                }
            }
        }
    }
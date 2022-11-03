package javaForLife.InterviewQuestion;

import java.util.Scanner;

public class q6_parola {

    /*
    Write a return method that can verify if a password is valid or not.
    requirements:
    Password MUST be at least have 6 characters and should not contain space
    Password should at least contain one upper case letter
    Password should at least contain one lowercase letter
    Password should at least contain one special characters
    Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns false
     */

    public static void main(String[] args) {

        String parola = "123abc#*$A%";
        System.out.println(parola);
        System.out.println("parolaDogruMu = " + parolaDogruMu(parola));

        System.out.println("isValid1(parola) = " + isValid1(parola));
    }

    public static boolean isValid1(String parola) {
        String uppercase="(.*[A-Z].*)";
        String lowercase="(.*[a-z].*)";
        String number="(.*[0-9].*)";
        String specialCharacter="(.*[-/,:-@].*)";

        boolean hasUpper =parola.matches(uppercase),
                hasLower=parola.matches(lowercase),
                hasNumber=parola.matches(number),
                hasSpecial=parola.matches(specialCharacter),
                isValid=false;

        if (parola.length()>=6 && !parola.contains(" "))
            if(hasUpper&&hasLower&&hasNumber&&hasSpecial)
                isValid=true;
        return isValid;
    }

    private static boolean parolaDogruMu(String parola) {

        if ((parola.length() < 6) || (parola.contains(" "))) {

            return false;
        } else{
            int bykHarfSay=0;
            int kckHarfSay=0;
            int karkterSay=0;
            int rakamSay=0;

            for (int i = 0; i <parola.length() ; i++) {
                if(parola.charAt(i)>=65 && parola.charAt(i)<=90) //parola.charAt(i)>='A' && parola.charAt(i)<='Z')
                    bykHarfSay++;
                if (parola.charAt(i)>=97 &&parola.charAt(i)<=122)
                    kckHarfSay++;
                if (parola.charAt(i)>=33 && parola.charAt(i)<=47 || parola.charAt(i)>=58 &&parola.charAt(i)<=64
                || parola.charAt(i)>=91 &&parola.charAt(i)<=96
                || parola.charAt(i)>=123 &&parola.charAt(i)<=126)
                    karkterSay++;
                if(parola.charAt(i)>=48 &&parola.charAt(i)<=57)
                    rakamSay++;
            }
            return bykHarfSay >0 && kckHarfSay >0 && karkterSay>0 &&rakamSay>0;
        }



    }
}
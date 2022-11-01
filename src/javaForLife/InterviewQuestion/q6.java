package javaForLife.InterviewQuestion;

import java.util.Scanner;

public class q6 {

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

        Scanner scan = new Scanner(System.in);
        System.out.print("Parola Giriniz : ");
        String parola = scan.next();

        System.out.println(parolaKontrol(parola));

    }

    private static boolean parolaKontrol(String parola) {

        boolean parolaDogruMu = true;

        if (parola.length() < 8) {
            parolaDogruMu=false;
        } else {

            for (int p = 0; p < parola.length(); p++) {
                if (Character.isUpperCase(parola.charAt(p))) {
                }
            }
            for (int q = 0; q < parola.length(); q++) {
                if (Character.isLowerCase(parola.charAt(q))) {
                }
            }
            for (int r = 0; r < parola.length(); r++) {
                if (Character.isDigit(parola.charAt(r))) {
                }
            }
            for (int s = 0; s < parola.length(); s++) {
                if (Character.isSpaceChar(parola.charAt(s))) {
                }
            }
            parolaDogruMu=true;

        }
        return parolaDogruMu;
    }
}
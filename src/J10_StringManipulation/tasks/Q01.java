package J10_StringManipulation.tasks;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner scan =new Scanner (System.in);
        System.out.println("String birşeyler giriniz : ");
        String str1= scan.nextLine();

        if (str1.contains(" ")) {

            System.out.println("Girdiğiniz değer boşluk içermektedir.");

        } else System.out.println("Girdiğiniz değer boşluk içermemektedir.");

       // System.out.println(str1.contains(" "));

scan.close();

    }

}


package CodeChallenge.day08;

import java.util.Scanner;

public class Q03_Arrays {

    public static void main(String[] args) {

        //Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Bir cümle giriniz : ");
        String cumle=scan.nextLine();

        String cumleArr[]=cumle.split(" ");
        System.out.println("cumleArr.length = " + cumleArr.length);

    }


}

package CodeChallenge.day05;

import java.util.Scanner;

public class Q05_NestedForLoop {

    public static void main(String[] args) {

        /*
   Get the number of rows and columns from user.
   Create a rectangle.
   rows = 3 and column = 5 ==> * * * * *
                               * * * * *
                               * * * * *
*/
        Scanner scan=new Scanner(System.in);
        System.out.print("Satır sayısı giriniz : ");
        int satir=scan.nextInt();
        System.out.print("Sütun sayısı giriniz : ");
        int sutun=scan.nextInt();

        for(int i=0; i<satir; i++){
            for (int j = 0; j < sutun; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scan.close();
    }
}

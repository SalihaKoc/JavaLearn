import java.util.Arrays;
import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("boyut değeri giriniz : ");
        int boyut= scan.nextInt();

        int matris[][]=new int[boyut][boyut];

        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                if (i!=boyut) {

                    continue;
                } else System.out.println(matris[i][j]);
            }
        }

    }

}
package J12_Loops.Tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
         */

        Scanner scan= new Scanner(System.in);
        System.out.println(" sayı1 giriniz : ");
        int sayı1=scan.nextInt();

        System.out.println(" sayı2 giriniz : ");
        int sayı2=scan.nextInt();

        if (sayı1<sayı2){
            for (int i = sayı1; i <sayı2 ; i++) {

                if (i % 2 == 0) {//döngü içndeki sayıların çift kontrolu
                    System.out.print(i + " ");
                }
            }

        }else System.out.println("hatalı giriş yaptınız");
    }
}

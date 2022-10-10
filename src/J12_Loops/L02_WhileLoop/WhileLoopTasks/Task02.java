package J12_Loops.L02_WhileLoop.WhileLoopTasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        Scanner scan = new Scanner(System.in);
            System.out.println("İki Adet Sayı Giriniz : ");
            int sayi1= scan.nextInt();
            int sayi2= scan.nextInt();
          for(int i=sayi1;i<=sayi2; i++) {
              System.out.print(i+" ");
          }
          System.out.println("");

            while (sayi1<=sayi2) {
                System.out.print(sayi1+" ");
                sayi1++;
            }
    }
}

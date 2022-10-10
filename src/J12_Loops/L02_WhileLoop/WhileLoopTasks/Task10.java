package J12_Loops.L02_WhileLoop.WhileLoopTasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("sayı giriniz : ");
        int sayi=scan.nextInt();

        while (sayi>=1) {
            if(sayi%2!=0) {
                System.out.print(sayi+" ");
                sayi-=2;
            }
        }
    }
}

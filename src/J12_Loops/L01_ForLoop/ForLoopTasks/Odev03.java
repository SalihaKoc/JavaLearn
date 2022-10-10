package J12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false
     * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi = scan.nextInt();
        System.out.println(getAsalMi(sayi));
    }
    private static boolean getAsalMi(int sayi) {

        int asal = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                asal++;
            }
        }
        if (asal == 2) {
            return true;
        }
        return false;
    }
}
package J12_Loops.L02_WhileLoop.WhileLoopTasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*
        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayı Giriniz : ");
		int sayi= scan.nextInt();
		int carpim=1;

		while (carpim<=10) {
			System.out.print(sayi + " X " + carpim + " = " + sayi*carpim + "  ");
			carpim++;
		}
	}

}

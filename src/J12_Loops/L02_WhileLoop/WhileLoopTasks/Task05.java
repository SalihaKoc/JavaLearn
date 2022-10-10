package J12_Loops.L02_WhileLoop.WhileLoopTasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		ayni satirda aralarina bosluk birakarak print rden code create ediniz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("İsminizi giriniz : ");
		String isim = scan.nextLine();
		System.out.print("Soy isminizi giriniz : ");
		String soyİsim = scan.nextLine();
		int is = 0, sy = 0;
		while (is <= isim.length() - 1) {
			System.out.print(isim.charAt(is) + " ");
			is++;
		}
		while (sy <= soyİsim.length() - 1) {
			System.out.print(soyİsim.charAt(sy) + " ");
			sy++;
		}
		scan.close();
	}
}

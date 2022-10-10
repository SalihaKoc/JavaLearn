package J12_Loops.L01_ForLoop.ForLoopTasks;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */

		rakamHesapla();

	}
	private static void rakamHesapla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir metin giriniz : ");
		String metin=scan.nextLine();
		int sayac=0;
		for (int i=0; i<=metin.length()-1;i++) {
			if (metin.charAt(i) >= 48 && metin.charAt(i) <= 57) {
				sayac++;
			}
		}
		System.out.println(sayac);
	}
}


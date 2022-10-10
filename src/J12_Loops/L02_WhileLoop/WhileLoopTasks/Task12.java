package J12_Loops.L02_WhileLoop.WhileLoopTasks;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Metin giriniz : ");
		String metin = scan.nextLine();

		int harf = 0, rakam = 0, ozelKrktr = 0, index=0;

		do {
			if ((metin.charAt(index) >= 'a' && metin.charAt(index)<='z') || (metin.charAt(index)>='A' && metin.charAt(index)<='Z')) {harf++;}
			else if ((metin.charAt(index) >= '0' && metin.charAt(index)<='9')) {rakam++;}
			else {ozelKrktr++;}
			index++;
		}while(index <= metin.length()-1);
		System.out.println("Harf Sayısı = " + harf + " Rakam Sayısı = " + rakam + " Karakter Sayısı = " + ozelKrktr);
	}
}
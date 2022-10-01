package J04_AritmeticOperators.AritmeticOperatorTask;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.print("3 Basamaklı Sayı Giriniz :  ");
		int sayi=scan.nextInt();
		int ilkbasamak= sayi%10;
		int sonbasamak= sayi/100;

		System.out.println(sayi+" 'nin ilk basamağı "+ ilkbasamak+" 'nin son basamağı "+sonbasamak);

		
	}


}

package J09_SwitchStatement.tasks;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz

		Scanner scan = new Scanner(System.in);
		System.out.println("VIP Kelimesinin Anlamını Öğrenmek İstediğiniz Harfi Girin : ");
		char vip = scan.next().toUpperCase().charAt(0);


		switch (vip) {
			case 'V':
				System.out.println("Very");
				break;
			case 'I':
				System.out.println("Important");
				break;
			case 'P':
				System.out.println("Person");
				break;
			default:
				System.out.println("Hatalı Harf Girdiniz..");

		}


	}

}


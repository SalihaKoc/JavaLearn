package J13_Break_Continue.HaftanınTaskiii;

import java.util.Random;
import java.util.Scanner;

public class T03_TasKagitMakas {

	static char first;
	static char second;
	static char com;
	static int numberOfFirstWin ;
	static int numberOfSecondWin ;

	public static void main(String[] args) {
		// tas > makas
		// makas > kagit
		//kagit > tas

		//int numberOfFirstWin = 0;
		//int numberOfSecondWin = 0;
		int numberOfComWin = 0;
		int gameOver = 3;

		giris();
		sonuc(first, second, numberOfFirstWin, numberOfSecondWin);

	}

	private static void giris() {

		while ((numberOfFirstWin < 3) && (numberOfSecondWin < 3)) {
			Scanner scan = new Scanner(System.in);
			System.out.print("1. oyuncu <T>as . <K>agıt . <M>akas : ");
			char first = scan.next().toUpperCase().charAt(0);
			System.out.print("2. oyuncu <T>as . <K>agıt . <M>akas : ");
			char second = scan.next().toUpperCase().charAt(0);
			//System.out.print("Sıra bilgisayarda : ");
			//Random r = new Random();
			//int com = r.nextInt(2);
			//switch (com) {
			//	case 0:
			//		System.out.println("t");
			//		break;
			//	case 1:
			//		System.out.println("k");
			//		break;
			//	case 2:
			//		System.out.println("m");
			//		break;
			//}
			sonuc(first, second, numberOfFirstWin, numberOfSecondWin);
		}
	}

	private static void sonuc(char first, char second, int numberOfFirstWin, int numberOfSecondWin) {

			if ((first == 'T' && second == 'T') || (first == 'K' && second == 'K') || (first == 'M' && second == 'M')) {
				System.out.println("aynı seçimi yaptınız, puan yok");
			} else if
			((first == 'T' && second == 'M') || (first == 'K' && second == 'T') || (first == 'M' && second == 'K')) {
				numberOfFirstWin++;
			} else if
			((first == 'T' && second == 'K') || (first == 'K' && second == 'M') || (first == 'M' && second == 'T')) {
				numberOfSecondWin++;
			}
			System.out.println("oyuncu1 Puanı = " + numberOfFirstWin + " oyuncu2 Puanı = " + numberOfSecondWin);
	}
}

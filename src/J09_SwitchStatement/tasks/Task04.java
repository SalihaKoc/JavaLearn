package J09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Hangi Ayın Gün Sayısını Öğrenmek İstersiniz : ");
		String ay = scan.nextLine().toLowerCase();

		switch (ay) {
			case "ocak":
			case "mart":
			case "mayıs":
			case "temmuz":
			case "ağustos":
			case "ekim":
			case "aralık":
				System.out.println("Girilen Ay 31 Gündür"); break;

			case "nisan":
			case "haziran":
			case "eylül":
			case "kasım":
				System.out.println("Girilen Ay 30 Gündür");break;

			case "şubat":
				System.out.println("Yılınızı Giriniz : ");
				int yil=scan.nextInt();
				if (yil %4==0){
					System.out.println("Girilen yıl şubat ayı 29 gündür");
				} else System.out.println("Girilen yıl şubat ayı 28 gündür");

				break;

			default:
				System.out.println("hatalı giriş");
		}
	}

}

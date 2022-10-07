package J11_MethodCreation.methodCreationsTasks;

import java.util.Scanner;

public class Task06_CevreAlan {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 Kullanıcıya kare (paralelkenarı değiştirdik), dikdörtgen ve üçgen kelimelerinden birini ve iki sayı seçmesini söyleyin.
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
		System.out.println("kare, dikdörtgen,üçgen birini seçiniz : ");
		String secim = sc.next().toLowerCase();
		System.out.println("1. sayıyı giriniz : ");
		int sayi1 = sc.nextInt();
		System.out.println("2. sayıyı giriniz : ");
		int sayi2 = sc.nextInt();

		secim(secim, sayi1, sayi2);
	}

	public static void secim(String str, int sayi1, int sayi2) {
		switch (str) {
			case "kare":
				sayi2=sayi1;
				kareAlan(sayi1, sayi1);
				kareCevre(sayi2, sayi2);
				break;

			case "dikdörtgen":
				dikdortgenAlan(sayi1, sayi2);
				dikdortgenCevre(sayi2,sayi1);
				break;

			case "üçgen":
				sayi2=sayi1;
				ucgenAlani(sayi1);
				ucgenCevre(sayi2);
				break;
			default:
				System.out.println("hatalı seçin yaptınız");
				secim(str, sayi1, sayi2);
		}

	}
	private static void kareAlan(int sayi1, int sayi2) {
		System.out.println("kare alan :" + (sayi1 * sayi2));

	}
	private static void kareCevre(int sayi1, int sayi2) {


		System.out.println("kare cevre :" + ((sayi1 + sayi2) * 2));
	}
	private static void dikdortgenCevre(int sayi2, int sayi1) {
		System.out.println("dikdortgen cevresi :"+((sayi2+sayi1)*2));}
	private static void dikdortgenAlan(int sayi1, int sayi2) {

		System.out.println("dikdortgen Alanı : "+(sayi2*sayi1));
	}
	private static void ucgenCevre(int sayi1) {
		System.out.println("ucgen cevre :"+(sayi1*3));}
	private static void ucgenAlani( int sayi1) {
		System.out.println("üçgen yukeskliği giriniz : ");
		int yksklk= sc.nextInt();
		System.out.println("üçgen alanı :"+((yksklk*sayi1)/2));

	}
}


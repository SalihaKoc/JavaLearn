package J11_MethodCreation.methodCreationsTasks;

import java.util.Scanner;

public class Task03_ceviric {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.
		Scanner scan = new Scanner(System.in);
		System.out.print("saat giriniz: ");
		int saat = scan.nextInt();
		System.out.print("mil giriniz: ");
		double mil = scan.nextDouble();
		System.out.print("kilogram giriniz: ");
		double kg= scan.nextDouble();
		cevir(saat, mil, kg);
	}

	public static void cevir (int s, double m, double k) {

		int saniye = s*3600;
		double kilometre= m*1.609344;
		double gram= k/1000;

		System.out.println((s + " saat = " + saniye + " saniye , " + m + " mil = " + kilometre + " kilometre, " + k + " kilogram = " + gram + " gram"));


	}

	}


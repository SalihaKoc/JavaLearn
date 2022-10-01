import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

        Scanner scan= new Scanner(System.in);
        System.out.println("M cinsinden boyunuzu giriniz : ");
        double boy=scan.nextDouble();
        System.out.println("Kg cinsinden kilonuzu giriniz : ");
        double kilo=scan.nextDouble();

        double BMI=(kilo/(boy*boy));
        System.out.println("Vücut Kilo Endeksiniz : "+ BMI );

        if (BMI<=20){
            System.out.println("Oldukça Zayıfsınız");
        } else if (BMI<=25) {
            System.out.println("Normal Sınırlardasınız");
        } else if (BMI<=30) {
            System.out.println("Şişman Kategorisindesiniz");

        } else {
            System.out.println("Obez Grubundasınız");
        }


    }

}

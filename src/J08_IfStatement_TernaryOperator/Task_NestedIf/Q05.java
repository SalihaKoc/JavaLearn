import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan= new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz : ");
        int yas =scan.nextInt();

        if(yas<18){
            System.out.println("Kan Bağışı Yapamazsınız");
        } else {
            System.out.println("Kilonuzu Giriniz : ");
            int kilo = scan.nextInt();
       if(kilo<50){
           System.out.println("Üzgünüz Kan Bağışı Yapamazsınız");
       } else System.out.println("Kan Bağışı Yapabilirsiniz :)");
        }
    }

}

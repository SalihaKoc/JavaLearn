package InterviewChallenge.day1;

import java.util.Scanner;

public class Q04_CountOfEnterCode {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {

        String pin="saliha123";
        int girisHakki=4;

        System.out.println("****Hoşgeldiniz****");
        Scanner scan=new Scanner(System.in);

        while (true) {
            System.out.print("pin kodu giriniz : ");
            String girilenPin=scan.nextLine();

            if (pin.equals(girilenPin)) {
                System.out.println("Başarılı giriş yaptınız..");
                break;
            }else {
                System.out.println("Yanlış giriş yaptınz...");
                girisHakki--;
                System.out.println("Kalan giriş hakkınız : " +girisHakki);
            }if (girisHakki==0) {
                System.out.println("Giriş hakkınız kalmadı.. Sim kartınız bloke oldu!");
                break;
            }
        }
scan.close();
    }

}

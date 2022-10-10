package J13_Break_Continue;

import java.util.Scanner;

public class C04_PinKontrol {

    public static void main(String[] args) {

        //task-> String data type bir pin datasının 3 giriş hakkında kontrol eden code

        Scanner scan = new Scanner(System.in);

        String dogruPin="javaCan";
        int girisHak=3;
        while(true) {
            System.out.println("Pin giriniz : ");
            String pin = scan.nextLine();
            if (pin.equals(dogruPin)) {
                System.out.println("Doğru girdiniz");
                break;
            } else {
                System.out.println("Yanlış girdiniz, bir daha deneyin");
                girisHak--;
                System.out.println("Kalan hakkınız "+ girisHak);
                if (girisHak==0) {
                    System.out.println("Deneme hakkınız kalmadı.");
                    break;
                }
            }
        }
    }
}

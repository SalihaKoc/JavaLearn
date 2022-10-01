package J09_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {

    public static void main(String[] args) {

        // girilen ayın hangi mevsimde oldugunu print eden code create ediniz...

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaçıncı Ay İstersiniz : ");
        String ay = scan.nextLine().toLowerCase();

        switch (ay) {
            case "aralık":
            case "ocak":
            case "şubat":
                System.out.println("Kış Mevsimindedir");
                break;
            case "mart":
            case "nisan":
            case "mayıs":
                System.out.println("İlkbahar Mevsimindedir");
                break;
            case "haziran":
            case "temmuz":
            case "ağustos":
                System.out.println("Yaz Mevsimindedir");
                break;
            case "eylül":
            case "ekim":
            case "kasım":
                System.out.println("Sonbahar Mevsimindedir");
                break;

            default:
                System.out.println("hatalı giriş");
        }

    }
}

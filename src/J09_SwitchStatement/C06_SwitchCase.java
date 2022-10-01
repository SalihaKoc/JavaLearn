package J09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {

    public static void main(String[] args) {

        //TASK -> Girilen haftanın gününü hafta içi veya sonu olduğunu print eden code

        Scanner scan = new Scanner(System.in);
        System.out.print("Gün Giriniz : ");
        String gun = scan.next().toLowerCase();

        switch (gun) {

            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("Hafta İçi"); break ;

            case "cumartesi" :
            case "pazar":
                System.out.println("Hafta Sonu"); break;
            default:
                System.out.println("Hatalı Giriş..");
        }






    }
}

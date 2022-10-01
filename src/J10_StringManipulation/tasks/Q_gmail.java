package J10_StringManipulation.tasks;

import java.util.Scanner;

public class Q_gmail {

    public static void main(String[] args) {

        //Task -> girilen e-mail hesabını @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        // @gmail.com ile bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz" print eden code

        Scanner scan =new Scanner(System.in);
        System.out.println("e-mail hesabınızı giriniz : ");

        String hesap=scan.nextLine();

        if(hesap.contains("@gmail.com")) {

            System.out.println(hesap.endsWith("@gmail.com") ? "hesabınız onaylandı" : "geçerli hesap giriniz!");

        } else System.out.println("lütfen gmail hesabı giriniz");

        scan.close();

    }
}

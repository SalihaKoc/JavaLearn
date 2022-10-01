package J09_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaçıncı Ay İstersiniz : ");
        int ayNo = scan.nextInt();

        switch (ayNo) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Girilen Ay 31 Gündür");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Girilen Ay 30 Gündür");
                    break;

                case 2:
                System.out.println("Yılınızı Giriniz : ");
                int yil=scan.nextInt();
                if (yil %4==0){
                    System.out.println("Girilen yıl şubat ayı 29 gündür");

                } else System.out.println("Girilen yıl şubat ayı 28 gündür");

                break;
                default:
                    System.out.println("Yanlış Giriş..");

        }
    }
}
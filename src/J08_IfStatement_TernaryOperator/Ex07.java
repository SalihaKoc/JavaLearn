package J08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        /*
        TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
        Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını teslim ediniz
        aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Ehliyetiniz Var Mı ? E/H : ");

        char ehliyet=scan.next().toUpperCase().charAt(0); //kullanıcının girdiği karakteri büyük harfe çevirip ilk değerini alır

        if(ehliyet=='E') { //Ehliyet kontrol ediliyor
            System.out.print("Kaç Yıl Tecrübeniz Var ? ");
            int tecrube = scan.nextInt();
            if (tecrube >= 7) { //tecrube yılı kontrol ediliyor
                System.out.print("Kaç km mesafe yaptınız ? ");
                int mesafe = scan.nextInt();
                if (mesafe >= 10000) { //km mesafe kontrol ediliyor
                    System.out.println("Kontak Anahtarınızı Alabilirsiniz");
                } else System.out.println("Kalan Mesafe = " + (10000 - mesafe)); //km şartı sağlamazsa

            }else System.out.println("Kalan Tecrübe Yılı = " + (7 - tecrube)); //tecruce şartı sağlamazsa


            } else if (ehliyet == 'H') {
                System.out.println("Ehliyetiniz yok ki...");


            } else System.out.println("Düzgün karakter girin...");

        }
    }


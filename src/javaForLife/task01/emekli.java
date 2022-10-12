package javaForLife.task01;

import java.util.Scanner;

public class emekli {

    public static void main(String[] args) {

        // Kullanicidan cinsiyet ve yas aliniz
        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir yazdirin
        // emekli olamayacaksa emekli olamazsin daha ... yil calisman lazim yazdirin

        Scanner scan=new Scanner (System.in);
        System.out.println("Cinsiyetinizi Giriniz : Kadın/Erkek ");
        char cins=scan.next().toUpperCase().charAt(0);

        System.out.println("Yaşınızı Giriniz : ");
        int yas=scan.nextInt();

        if (cins == 'K') {
            if (yas>=60){
                System.out.println("emekli olabilirsiniz");
            } else
            System.out.println("emekli olamazsin daha"+ " "+ (60-yas)+" "+"yil calisman lazim");

        }else if (cins == 'E') {
            if (yas>=65){
                System.out.println("emekli olabilirsiniz");
            } else
            System.out.println("emekli olamazsin daha"+ " "+ (65-yas)+" "+"yil calisman lazim");


        }else System.out.println("hatalı giriş");

    }

}
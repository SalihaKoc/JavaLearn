package J13_Break_Continue.HaftanınTaskiii;

import java.util.Scanner;

public class tasKagıtMakas {
    static Scanner scan = new Scanner(System.in);
    static int numberOfCom;
    static int numOfPlayer;
    static int computer;
    static int player;

    public static void main(String[] args) {
        // tas >makas
        // makas >kagit
        //kagit >tas


        System.out.println("Taş/Kağıt/Makas Oyununa Hoş Geldiniz! 3 Olan Kazanır");

        while (numberOfCom < 3 && numOfPlayer < 3) {
            player();
            computer();
            oyun();
            skor();
        }
        System.out.println(numOfPlayer > numberOfCom ? "Tebrikler Siz Kazandınız !!" : "Maalesef Bilgisayar Kazandı");
    }

    public static void player() {
        System.out.println("Taş için -1- Kağıt için -2- Makas için -3- giriniz : ");
        player = scan.nextInt();
        if (player < 1 || player > 3) {
            System.out.println("Geçersiz giriş yaptınız");
            player();
        } else {
            switch (player) {
                case 1:
                    System.out.println("Siz Taş Dediniz!!");
                    System.out.println("-------------------");
                    break;
                case 2:
                    System.out.println("Siz Kağıt Dediniz");
                    System.out.println("-------------------");
                    break;
                case 3:
                    System.out.println("Siz Makas Dediniz");
                    System.out.println("-------------------");
                    break;
            }
        }
    }

    public static void computer() {
        computer = (int) Math.ceil((Math.random() * 3));
    }

    public static void skor() {
        System.out.println("---------Skor Board-----------");
        System.out.println(numOfPlayer == numberOfCom ? "Skor Berabere!!" : numOfPlayer > numberOfCom ? "Siz Öndesiniz :)" : "Bilgisayar Önde :(");
        System.out.println("Sizin puanınız " + numOfPlayer + "\nBilgisayarın puanı " + numberOfCom);
    }

    public static void oyun() {
        switch (computer) {
            case 1://taş
                System.out.println("Bilgisayar Taş Dedi");
                System.out.println("--------------------");
                switch (player) {
                    case 1:
                        System.out.println("İkiniz de Taş Dediniz!! Berabere");
                        break;
                    case 2:
                        System.out.println("Kağıt Taşı Sardı Siz 1 Puan Kazandınız :)");
                        numOfPlayer++;
                        break;
                    case 3:
                        System.out.println("Taş Makası Kırdı Bilgisayar 1 Puan Kazandı :(");
                        numberOfCom++;
                        break;
                }
                break;
            case 2://kağıt
                System.out.println("Bilgisayar Kağıt Dedi");
                System.out.println("--------------------");
                switch (player) {//taş kağıt makas
                    case 1://taş
                        System.out.println("Kağıt Taşı Sardı Bilgisayar 1 Puan Kazandı :(");
                        numberOfCom++;
                        break;
                    case 2://kağıt
                        System.out.println("İkiniz de Kağıt Dediniz!! Berabere");
                        break;
                    case 3://makas
                        System.out.println("Makas Kağıdı Kesti Siz 1 Puan Kazandınız :)");
                        numOfPlayer++;
                        break;
                }
                break;
            case 3://Makas
                System.out.println("Bilgisayar Makas Dedi");
                System.out.println("-------------------");
                switch (player) {//taş kağıt makas
                    case 1://taş
                        System.out.println("Taş Makası Kırdı Siz 1 Puan Kazandınız :)");
                        numOfPlayer++;
                        break;
                    case 2://kağıt
                        System.out.println("Makas Kağıdı Kesti Bilgisayar 1 Puan Kazandı :(");
                        numberOfCom++;
                        break;
                    case 3://makas
                        System.out.println("İkiniz de Makas Dediniz!! Berabere");
                        break;
                }
                break;
        }

    }
    }

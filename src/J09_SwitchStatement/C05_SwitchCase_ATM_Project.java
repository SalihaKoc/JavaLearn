package J09_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase_ATM_Project {

    public static void main(String[] args) {

        /*
        Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
        çıkış işlemlerinin yapıldıgı bir ATM app. code create ediniz
        */

        Scanner scan = new Scanner(System.in);

        int bakiye=1000;

        System.out.println("\nHangi İşlemi Yapmak İstersiniz\n");
        System.out.println("1. Bakiye Öğrenme");
        System.out.println("2. Para Çekme");
        System.out.println("3. Para Yatırma");
        System.out.println("4. Çıkış");

        //System.out.println("Bakiye öğrenme -> 1\nPara yatırma -> 2\nPara Çeke -> 3\nÇıkış -> 4\nGiriniz : ");

        byte secim= scan.nextByte();

        switch (secim){
            case 1:
                System.out.print("Bakiyeniz : "+ bakiye+ " Tl"); break;
            case 2:
                System.out.println("Ne kadar para çekmek istiyorsunuz ?");
                int cekbakiye=scan.nextInt();

                if(cekbakiye>bakiye) {
                    System.out.println("Yetersiz Bakiye !");
                }
                    else { bakiye -=cekbakiye;
                System.out.println("Yeni Bakiye : "+ bakiye+" Tl"); }break;
            case 3:
                System.out.println("Ne kadar para yatırmak istiyorsunuz");
                int yatbakiye=scan.nextInt();
                bakiye += yatbakiye;
                System.out.println("Yeni Bakiye : "+ bakiye+" Tl");break;
            case 4:
                System.out.println("İyi Günler"); break;
            default:
                System.out.println("Hatalı Giriş..");
        }
    }
}

package J11_MethodCreation;

import java.util.Scanner;

public class Task04_AtmMethod {

    static Scanner scan = new Scanner(System.in);
    static   int bakiye=1000;

    public static void secim() {
        System.out.print("agam ne yapacaksan seç : ");
        int seçim=scan.nextInt();
        switch (seçim){
            case 1: bakiyeVer(); break;
            case 2: paraYatir(); break;
            case 3: paraCek(); break;
            case 4: cikisYap(); break;
            default:
                System.out.println("yanlış seçim yaptınız");
        }
    }

    private static void cikisYap() {
        System.out.println("Çıkışınız yapılmıştır, yine bekleriz");
    }

    private static void paraCek() {
        System.out.print("Ne kadar para çekeceksiniz ? ");
        int cekilecekMiktar=scan.nextInt();
        if (cekilecekMiktar<=bakiye){
            bakiye-=cekilecekMiktar;
            System.out.println("Yeni bakiyeniz : "+ bakiye);
        }else System.out.println("Bakiyeden fazla çekemezsiniz");
        karar();
    }

    private static void paraYatir() {
        System.out.print("Ne kadar para yatıracaksınız ? ");
        int yatiralacakMiktar=scan.nextInt();
        bakiye+=yatiralacakMiktar;
        System.out.println("Yeni bakiyeniz : "+bakiye);
        //bakiyeVer();
        karar();
    }

    private static void bakiyeVer() {
        System.out.println("Bakiyeniz : "+ bakiye);
        karar();
    }
    public static void karar(){
        System.out.println("Devam için -> 1 \nÇıkış için -> 0");
        int karar=scan.nextInt();
        if (karar==1){
            secim();
        }else if (karar==0){
            cikisYap();
        }else System.out.println("Geçerli seçim yapınız");

    }

}

package J09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız

        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " + "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int kacıncıgun = scan.nextInt();

        if (kacıncıgun>0 && kacıncıgun<8) {
            int yuzgunsonra = ((kacıncıgun + kacıncıgun % 7) % 7);  //kac gun sonrasını ögrenmek istersiniz : int bulunangun= (kacgunsonrası+kacıncıgun)%7
            switch (yuzgunsonra) {
                case 1:
                    System.out.println("Yüz gün sonra bugün PAZARTESİ");
                    break;
                case 2:
                    System.out.println("Yüz gün sonra bugün SALI");
                    break;
                case 3:
                    System.out.println("Yüz gün sonra bugün ÇARŞAMBA");
                    break;
                case 4:
                    System.out.println("Yüz gün sonra bugün PERŞEMBE");
                    break;
                case 5:
                    System.out.println("Yüz gün sonra bugün CUMA");
                    break;
                case 6:
                    System.out.println("Yüz gün sonra bugün CUMARTESİ");
                    break;
                case 7:
                    System.out.println("Yüz gün sonra bugün PAZAR");
                    break;

            }
            }else System.out.println("Hatalı Giriş...");


    }
}


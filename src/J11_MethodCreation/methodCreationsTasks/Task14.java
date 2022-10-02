package J11_MethodCreation.methodCreationsTasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /*Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.
    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */

        Scanner scan= new Scanner(System.in);
        System.out.print("saatlik çalışma ücreti giriniz : ");
       double ucret=scan.nextDouble();
        System.out.print("hangi saatte çalışmaya başladınız : ");
        double mesaibas= scan.nextDouble();
        System.out.print("hangi saatte çalışmayı bitirdiniz: ");
        double mesaibit= scan.nextDouble();
        System.out.print("kazancınızı kaç ile katlayacağımızı giriniz : ");
        double kat=scan.nextDouble();

        System.out.println("Toplam alınacak ücret :" + ucretHesapla(ucret, mesaibit, mesaibas, kat));

    }

    public static double ucretHesapla(double uct, double mBs, double mBt, double kat) {

        double maas=0;
        if (mBs-mBt>8) {

            maas= (8*uct)+((mBs-mBt-8)*uct*kat);

        }else {
            maas= (mBs-mBt)*uct; }

        return maas;

    }


}

package J11_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

    public static void main(String[] args) {

        // task-> girilen 3 notun ortalamasını hesaplayan meyhod create edin

        Scanner scan=new Scanner(System.in);
        System.out.println("1.notu giriniz : ");
        double not1=scan.nextDouble();
        System.out.println("2.notu giriniz : ");
        double not2=scan.nextDouble();
        System.out.println("3.notu giriniz : ");
        double not3=scan.nextDouble();

        double ortalamanız=ortalamaHesapla(not1,not2,not3);
        System.out.println("not ortalamanız = " + ortalamanız);

    }

    public static double ortalamaHesapla(double a, double b, double c) {

        return (a+b+c)/3;
    }


}

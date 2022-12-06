package J37_Enum.enum01;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        //Task-> verilen bir ay numarasına göre kaç gün çektiğini print eden code create ediniz

       // Scanner scan=new Scanner(System.in);
       // System.out.print("Ay numarası giriniz : ");
       // int ay= scan.nextInt();

        Aylar ay=Aylar.MART; //Aylar Enum'ından ay field value MART olarak tanımlandı

        System.out.println("ay = "+ay);
        System.out.println("ay.name() = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());
        switch (ay){
            case OCAK:
                System.out.println("Ocak 31 gündür.."); break;
            case SUBAT:
                System.out.println("Şubat 28 gündür.."); break;
            case MART:
                System.out.println("Mart 31 gündür.."); break;
            case NISAN:
                System.out.println("Nisan 30 gündür.."); break;
            case MAYIS:
                System.out.println("Mayıs 31 gündür.."); break;
            case HAZIRAN:
                System.out.println("Haziran 30 gündür.."); break;
            case TEMMUZ:
                System.out.println("Temmuz 31 gündür.."); break;
            case AGUSTOS:
                System.out.println("Ağustos 31 gündür.."); break;
            case EYLUL:
                System.out.println("Eylül 30 gündür.."); break;
            case EKIM:
                System.out.println("Ekim 31 gündür.."); break;
            case KASIM:
                System.out.println("Kasım 30 gündür.."); break;
            case ARALIK:
                System.out.println("Aralık 31 gündür.."); break;
            default:
                System.out.println("Hatalı Giriş..");
        }
    }
}

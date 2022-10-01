package J08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {

    public static void main(String[] args) {

        /*
        TASK-> girilen yaşın 18den büyüklüğünü kontrol eden code
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Yaş Giriniz : ");
        int yas=scan.nextInt();
      //  if (yas>18) {
      //      System.out.println("Yaş 18'den büyük");
      //  }
         /*
        TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
        18 den kuçuk ise ehliyet alamzsınız print ediniz
         */

        if(yas>=18) { //girilen yaşın 18'den büyük ve eşit olamasını kontrol eder
            System.out.println("Yaş 18'den küçük değil");
        }
        else
            System.out.println("ehliyet alamazsınız"); //if sartı sağlamazsa->yaş18den büyük ve eşit değil


    }
    }


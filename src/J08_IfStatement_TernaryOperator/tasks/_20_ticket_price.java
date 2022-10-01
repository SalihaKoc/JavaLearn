package J08_IfStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Trafik cezasının değerini hesaplayın.
        45 hız sınırıdır.

        Eğer hızınız 55-74 arasında ise:
        Ceza 100 $'dır.

        Eğer hızınız 75 - 84 arasında ise:
        Ceza 150 $'dır.

        Eğer hızınız 85 -94 arasında ise:
        Ceza 320 $'dır.

        Eğer hızınız 94'den daha fazla ise:
        Ceza 500 $'dır.

        ve ayrıca,
        Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
    Örn;

    currentSpeed(Hızınız) 87
    ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

    sonuç 320 olmalıdır.

    currentSpeed(Hızınız) 65
    ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

    sonuç 300 olmalıdır.  */

        Scanner scan = new Scanner(System.in);

        System.out.print("Hız Giriniz : ");

        int currentSpeed = scan.nextInt();

        System.out.print("Ehliyet Var mı ? True/False : ");

        boolean isDriverLicenceAvailable = scan.nextBoolean();

        int ceza=0;

    //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (currentSpeed>=55 && currentSpeed<74) {
            ceza = 100;
        }
        else if (currentSpeed>=75 && currentSpeed<85) {
            ceza = 150;
        }
        else if (currentSpeed>=85 && currentSpeed<95) {
            ceza = 320;
        }
        else if (currentSpeed>=94) {
            ceza = 500;
        }

        if (isDriverLicenceAvailable==false) {
            ceza += 200;
        }

        System.out.println("Cezanız = " + ceza + " $");


    }
}



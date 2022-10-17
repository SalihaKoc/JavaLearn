package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        //bir listte istenen sayının varlığını kontrol eden code

        ArrayList<Integer>listSyi=new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));

        Scanner scan=new Scanner(System.in);
        System.out.print("hangi sayıyı bulmak istiyosunuz ? ");
        int sayi = scan.nextInt();

        boolean varMi=false;
        for (int i = 0; i < listSyi.size(); i++) {
            if (listSyi.get(i)==sayi) {
                varMi=true;
                System.out.println("aradığın sayı var");
                break;
            }
        }
        if (!varMi) {
            System.out.println("aradığın sayı malesef yok");
        }

        /*
        	boolean flag=false;
        for (int i = 0; i < listSayi.size(); i++) {
            flag=listSayi.get(i)==sayi;
            if(flag)
                break;
        }
        System.out.println(flag);
         */

    }
}

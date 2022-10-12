package J15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        //task-> kullanıcıdan alınan değerlerle int array elemanlarını b->k print eden code

        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç elemanlı array istiyorsunuz : ");
        int boyut=scan.nextInt();

        int sayilarArr []=new int[boyut]; //boyutu belirlenmiş boş int array

        for (int i = 0; i < boyut; i++) {
            System.out.print(i + ". index eleman giriniz : ");

            sayilarArr[i]=scan.nextInt();
        }

        System.out.println("İstediğiniz array = " + Arrays.toString(sayilarArr));
        Arrays.sort(sayilarArr); //sayilarArr k->b sıralandı(sortingen oldu)

        for (int i = sayilarArr.length-1; i >= 0 ; i--) {

            System.out.print((sayilarArr[i] + " "));

        }

    }
}

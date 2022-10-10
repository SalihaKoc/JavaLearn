package J13_Break_Continue;

import java.util.Scanner;

public class C06_Task {

    public static void main(String[] args) {

        //task-> girilen bir ifadedeki c karakterine kadar a karakter sayısını print eden code

        Scanner scan = new Scanner(System.in);
        System.out.println("Mail adresi giriniz : ");
        String metin = scan.nextLine().toLowerCase();
        int aSayi = 0;
        for (int i = 0; i <= metin.length() - 1; i++) {
          if(metin.charAt(i)=='a') {
          aSayi++;
          } else if (metin.charAt(i)=='c') {
              break;
          }
            System.out.println("döngüde işleme giren karakterler : "+ metin.charAt(i));
        }
        System.out.println("girdiğiniz metinde a sayısı : "+aSayi);
    scan.close();
    }
}
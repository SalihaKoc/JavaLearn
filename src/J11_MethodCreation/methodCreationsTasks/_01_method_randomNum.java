package J11_MethodCreation.methodCreationsTasks;

import java.util.Scanner;

public class _01_method_randomNum {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Rastgele sayı oluşturulacak maximum değeri giriniz : ");
        int max = scan.nextInt();
        System.out.println("Random sayı : " +randomNum(max-0+1));
    }
    public static int randomNum(int max) {

        return max = (int)(Math.random()*max);
    }


}

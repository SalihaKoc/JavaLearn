package InterviewChallenge.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_FibonacciListNumber {

    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    0-1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {

        List<Integer> fibonacci=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi= scan.nextInt();

        fibonacci.add(0);
        fibonacci.add(1);
        int i=1;
        if (sayi<=1) {
            System.out.println("Daha büyük sayı giriniz..");
        }else {
            while (fibonacci.get(i)<sayi){ //fibonacci elemanları sayidan kucuk oldugu surece
                fibonacci.add(fibonacci.get(i)+fibonacci.get(i-1)); //bir onceki eleman ile topla
                i++;
            }
        }

        if (fibonacci.get(fibonacci.size()-1)>sayi) { //fibonaccideki son eleman, sayıdan buyukse
            fibonacci.remove(fibonacci.get(fibonacci.size()-1)); //bu elemanı kaldır
            System.out.println("girdiğiniz sayı fibonacci dizisinde bulunmamaktadır."+"\nGirilen sayıya kadar olan fibonacci dizisi : "+fibonacci);
        }else System.out.println("Girdiğiniz sayı fibonacci dizisinde bulunmaktadır... "+ fibonacci);

        scan.close();
    }
}

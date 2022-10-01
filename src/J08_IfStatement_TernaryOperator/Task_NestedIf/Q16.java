import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Üç adet sayı giriniz : ");

        int num1= scan.nextInt();
        int num2= scan.nextInt();
        int num3= scan.nextInt();

        if ((num1>num2) && (num1>num3) ) {
            System.out.println("En Büyük Sayı : " + num1);
        } else if ((num2>num1) && (num2>num3)) {
            System.out.println("En Büyük Sayı : " + num2);
        } else {
            System.out.println("En Büyük Sayı : " + num3);
        }
        if ((num1<num2) && (num1<num3) ) {
            System.out.println("En Küçük Sayı : " + num1);
        } else if ((num2<num1) && (num2<num3)) {
            System.out.println("En Küçük Sayı : " + num2);
        } else {
            System.out.println("En Küçük Sayı : " + num3);
        }

    }
}


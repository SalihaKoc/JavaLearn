package J11_MethodCreation;

import java.util.Scanner;

import static J11_MethodCreation.C01_MethodCreation.topla;

public class Task03 {

    public static void main(String[] args) {

        //task->girilen iki sayıyı seçilen dört işleme göre hesaplayan code

        Scanner scan = new Scanner(System.in);
        System.out.println("ilk sayı girin : ");
        int sayi1 = scan.nextInt();
        ;
        System.out.println("ikinci sayı girin : ");
        int sayi2 = scan.nextInt();

        System.out.println("yapmak istediginiz islemi secin :\n1-toplama \n2-cıkarma \n3-carpma \n4-bolme");
        char secim = scan.next().charAt(0);
        switch (secim) {
            case '1':
                topla(sayi1, sayi2);
                break;
            case '2':
                cikar(sayi1, sayi2);
                break;
            case '3':
                carp(sayi1, sayi2);
                break;
            case '4':
                bol(sayi1, sayi2);
                break;
            default:
                System.out.println("hatalı seçim yaptınız");
                break;
        }
    }
    public static void topla(int sayi1, int sayi2) {
        System.out.println("toplam = " + (sayi1 + sayi2));
    }
    public static void cikar(int sayi1, int sayi2) {
        System.out.println("fark = " + (sayi1 - sayi2));
    }
    public static void bol(int sayi1, int sayi2) {
        System.out.println("bolum = " + (sayi1 /sayi2));
    }
    public static void carp(int sayi1, int sayi2) {
        System.out.println("carpım = " + (sayi1 * sayi2));
    }
    }
/**
 * Scanner sc = new Scanner(System.in);
 *         System.out.print("1. sayıyı giriniz : ");
 *         double sayı1 = sc.nextDouble();
 *         System.out.print("2. sayıyı giriniz : ");
 *         double sayı2 = sc.nextDouble();
 *         System.out.print("işleminizi giriniz : ");
 *         char islem = sc.next().charAt(0);
 *         islemMenu(islem, (int) sayı1, (int) sayı2);
 *     }//main sonu
 *     public static void islemMenu(char ch, int x, int y) {
 *         switch (ch) {
 *             case '+':
 *                 topla(x, y);
 *                 break;
 *             case '-':
 *              cıkar(x, y);
 *              break;
 *
 *          case '*':
 *              carp(x, y);
 *              break;
 *          case '/':
 *              bol(x, y);
 *              break;
 *          default:
 *              System.out.println("hatalı seçim yaptınız");
 *      }
 *
 *  }
 *
 *  public static void topla(int a, int b) {
 *      System.out.println("a+b = " + (a + b));
 *  }
 *
 *  public static void carp(int a, int b) {
 *      System.out.println("a*b = " + (a * b));
 *  }
 *
 *  public static void cıkar(int a, int b) {
 *      System.out.println("a-b = " + (a - b));
 *  }
 *
 *  public static void bol(int a, int b) {
 *      System.out.println("a/b = " + (a / b));
 *  }
 *
 * }
 */
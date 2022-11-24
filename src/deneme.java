import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class deneme {
    public static final String R = "\u001B[31m";
    public static final String B = "\u001B[34m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";

    public static void menuYazdir() {
        System.out.println(Y + "============================ CodeForLife DEPO SİSTEMİ ============================\r\n"
                + "   __________________            __________________            __________________    \n"
                + "   | 1-URUN TANIMLA |            | 2-URUN LISTELE |            | 3-URUN GIRISI  |  \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯            ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯            ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯                \n"
                + "   __________________            __________________            __________________  \n"
                + "   | 4-URUN RAFA KOY|            | 5-URUN CIKISI  |            | 6-CIKIS        |  \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯            ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯            ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯   " + G);

        Scanner scan = new Scanner(System.in);
        System.out.print("İSLEM SECİNİZ : ");
        int secm = scan.nextInt();
        switch (secm) {
            case 1:
                System.out.println("tanım"); //urunTanimlama();
                break;
            case 2:
                System.out.println("list");//urunListele();
                break;
            case 3:
                System.out.println("urungır");//urunGirisi();
                break;
            case 4:
                System.out.println("raf");//urunuRafaKoy();
                break;
            case 5:
                System.out.println("cıkıs");//urunCikisi();
                break;
            case 6:
                //cikis();
                System.out.println("Depo yönetiminden çıkıldı");
                break;
            default:
                System.out.println("Hatali deger girdiniz");
                menuYazdir();
        }
    }
        public static void main (String[]args){

        menuYazdir();

        }
    }
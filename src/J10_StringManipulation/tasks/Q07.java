package J10_StringManipulation.tasks;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Üç harfli isim giriniz : ");
        String isim= scan.next().toLowerCase();

        if (isim.length()==3) {

            System.out.println(((isim.charAt(0) == isim.charAt(1)) && (isim.charAt(0) == isim.charAt(2))) ? "Harflerin hepsi aynı" : "harfler aynı değil");

        } else System.out.println("Lütfen üç harfli isim girin !!!");

        scan.close();
    }
}
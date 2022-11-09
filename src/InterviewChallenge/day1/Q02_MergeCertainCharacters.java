package InterviewChallenge.day1;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz : ");
        String str = scan.nextLine();
        System.out.print("Sayı giriniz : ");
        int sayi=scan.nextInt();
        System.out.println("ilkSonHarf(str,sayi) = " + ilkSonHarf(str, sayi));

        System.out.println("merge(str,sayi) = " + merge(str, sayi));
  scan.close();
    }

    private static String ilkSonHarf(String str, int sayi) {

        String ilkSonHarfler = str.substring(0,1)+str.substring(str.length()-1);
        System.out.println("ilkSonHarfler : " + ilkSonHarfler);

        String cikti="";
        for (int i = 0; i < sayi; i++) {
            cikti+=ilkSonHarfler;
        }
        return cikti;
    }
    public static String merge(String str,int a){
        return (str.charAt(0)+""+str.charAt(str.length()-1)).repeat(a);
    }

}

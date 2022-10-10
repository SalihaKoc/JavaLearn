package CodeChallenge.day05;

public class Q02_ForLoop {

    public static void main(String[] args) {

        //Interview Question
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

      // System.out.println("**forLoop**");
      // for (int i = 0 ; i<=255 ; i++) {
      //     char karakter = (char) i;
      //     System.out.println(i + " = " + karakter);
      // }

      // System.out.println("whileLoop");
      // int sayi=0;
      // while (sayi<=255) {
      //     char c= (char) sayi;
      //     System.out.println(sayi + " = " + c);
      //     sayi++;
      // }

        System.out.println("doWhileLoop");
        int sayi=0;
        do {
            char k= (char) sayi;
            System.out.println(sayi + " = " + k);
            sayi++;
        }
        while (sayi<=255);
    }
        
    }

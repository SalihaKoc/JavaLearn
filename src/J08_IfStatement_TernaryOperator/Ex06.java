package J08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        //TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
        //      kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
        //      kontrol edip kalan yıl ve prim gununu print eden code create ediniz

        Scanner scan=new Scanner(System.in);

        System.out.println("Cinsiyetinizi Giriniz : K/E");

        char cinsiyet= scan.next().charAt(0);

        if (cinsiyet=='K') {

            System.out.print("Yaş Giriniz: ");
            int yas=scan.nextInt();

            if (yas>60){

                System.out.print("prim gününü giriniz: ");
                int primGunu=scan.nextInt();

                if (primGunu > 6000) {
                    System.out.println("Tebrikler emekli oldunuz");

                } else System.out.println("Emekliliğiniz için : "+(6000-primGunu)+" yatırmanız lazım");
            } else System.out.println("Emekliliğinize daha " + (60-yas)+ " yıl var");

                }
                else if (cinsiyet=='E') {
            System.out.print("Yaş Giriniz: ");
            int yas=scan.nextInt();

            if (yas>65){

                System.out.print("prim gününü giriniz: ");
                int primGunu=scan.nextInt();

                if (primGunu > 7000) {
                    System.out.println("Tebrikler emekli oldunuz");
                } else System.out.println("Emekliliğiniz için : "+(7000-primGunu)+" yatırmanız lazım");
            } else System.out.println("Emekliliğinize daha " + (65-yas)+ " yıl var");

        } else System.out.println("Doğru Cinsiyet Girin");

    }
}

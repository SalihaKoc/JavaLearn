package J03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {

    public static void main(String[] args) {
        //kullanıcıdan veri almak için şu adam takip edilir
        //1.adım -> Scanner class'dan obj create edilir

        //Scanner scan= new Scanner(System.in); //Scanner classından scan isminde değerini System içinden alan bir obj

        //2.adım -> Kullanıcıdan istenilen veri için bildirimde bulunur->sout("..")

        //System.out.print("Adınızı Giriniz :");

        //3.adım -> Kullanıcının girdiği veri data type'ne göre bir variable atanır

       // String isim= scan.nextLine(); //kullanıcıdan gelen String tipinde isim verisi scan obj'ni nextLine() metoduyla atandı

        //System.out.println("isim = " + isim);

        // Task -> Kullanıcının girdiği değere göre kare alanı ve cevresini hesaplayan bir code create ediniz...

        Scanner scanner = new Scanner(System.in);

        //System.out.print("Kenar giriniz : ");

        //int kenar= scanner.nextInt();

        //System.out.println("Alan : " + (kenar*kenar)+ " Çevre : "+ (kenar*4));

        /* Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
        Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
        1 seker = 1.7 gr
        Ornek : Input : cay sayisi : 10 seker sayisi :2
        Output : Yilda 12.41 kg seker kullaniyorsunuz
        */
/*
        System.out.println("Günlük içtiğiniz çay sayısını giriniz : "); //çay için 2.adım
        int caySayisi= scanner.nextInt();// çay için 3.adım

        System.out.println("Şeker sayınızı giriniz : ");
        int seker= scanner.nextInt();

        System.out.println("Yıllık şeker tüketiminiz : " + (caySayisi*seker*1.7*365)/1000+"kg");


 */
        System.out.println("İsminizi giriniz : ");
       //char ch= scanner.nextLine().charAt(0); //kullanıcıdan gelen string ifadenin 0.indx ilk karakterini alır
       //System.out.print("İsminizin ilk karakteri : "+ ch);

        // String isim = scanner.nextLine(); //kullanıcının girdiği tüm satırı isim' e atar
        //System.out.println("isim =" + isim);

        String ad = scanner.next(); //kullanınıcının girdiği ilk ifadeyi ad'a atar
        System.out.println("ad =" + ad );


    }
}

package ProjeChallenge.ClaruswayStore;

import java.util.Scanner;

public class Store {

    public void run() {
        Scanner scan=new Scanner(System.in);
        System.out.println("CW Store Management Paneline Hoşgeldiniz...");
        System.out.println("1) NoteBook İşlemleri \n" + "2) Marka Listeleme \n"+ "3) Çıkış Yap \n");

        System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz...");

        switch (scan.nextInt()) {

            case 1: NoteBook noteBook =new NoteBook();
            noteBook.menu();
            break;
            case 2: Brand.printBrand();
            break;
            case 3:
                System.out.println("Çıkış Yapılıyor...");
                System.exit(0);
                break;

        }
    }
}

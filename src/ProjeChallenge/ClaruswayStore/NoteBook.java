
package ProjeChallenge.ClaruswayStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteBook extends Product {
    Scanner scan=new Scanner(System.in);
    static int nId=1;

   static List<NoteBook> noteBooks=new ArrayList<>();

    public NoteBook(String name, double price, double discountRate, int amount, Brand brand, double screenSize, int ram, int memory) {
        super(nId,name, price, discountRate, amount, brand, screenSize, ram, memory);
        nId++;
    }

    public NoteBook() {
    }

    @Override
    public void menu() {
        System.out.println("1) Yeni NoteBook Ekleme \n"+ "2) NoteBook Listesini Görüntüleme \n"+"3) NoteBook Silme \n");

        System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz ...");
        int options=scan.nextInt();

        if (options==1) addItem();
        if (options==2) getProducts();
        if (options==3) deleteItem();
    }

    @Override
    public void addItem() {
        System.out.println("Ürün Fiyatı : ");
        double price=scan.nextDouble();
        System.out.println("Ürünün Adı : ");
        String name=scan.nextLine();
        System.out.println("Ürünün İndirim Oranı : ");
        double discountRate=scan.nextDouble();
        System.out.println("Ürünün Stoğu : ");
        int amount=scan.nextInt();
        System.out.println("Ürünün Rami : ");
        int ram=scan.nextInt();
        System.out.println("Ürünün Ekranı : ");
        double screenSize=scan.nextDouble();
        System.out.println("Ürünün Hafızası : ");
        int memory=scan.nextInt();
        System.out.println("Lütfen Ürünün Markasını Listeden Seçiniz : ");
        Brand.printBrand();
        Brand brand = Brand.getBrand(scan.nextInt());
        NoteBook noteBook=new NoteBook(name,price,discountRate,amount,brand,screenSize,ram,memory);
        noteBooks.add(noteBook);
        System.out.println("Eklenen Ürünün İd'si : " + noteBook.getId());

    }

    @Override
    public void getProducts() {
       print(null);
    }

    @Override
    public void deleteItem() {
        getProducts();
        System.out.println("Silinmesini İstediğiniz Ürünün id'sini Giriniz : ");
        int id= scan.nextInt();
        noteBooks.remove(id-1);
        System.out.println("Mevcut Ürün Listesi : ");
        getProducts();
    }

    public void print(List<NoteBook> noteBooks) {
        //Todo
        /*
        for (:) {

        }
        */
    }
}

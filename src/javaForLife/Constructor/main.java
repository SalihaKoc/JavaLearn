package javaForLife.Constructor;

public class main {
    public static void main(String[] args) {

        Kalem Rotring = new Kalem(0.5, 24);

        System.out.println(Rotring.uc);

        Kalem cizimKalemi= new Kalem();
        System.out.println(cizimKalemi.uc);

        Kalem imzaKalemi=new Kalem("Faber Castell");
        System.out.println(imzaKalemi.uc);
        System.out.println(imzaKalemi.fiyat);
        System.out.println(imzaKalemi.model);

    }
}

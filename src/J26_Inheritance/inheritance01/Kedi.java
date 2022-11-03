package J26_Inheritance.inheritance01;

public class Kedi extends Mammal{ //Mammal parent class Mammal child class-torun

    /*
    Child class obj olmadan parent class variable ve methodlara ulaşabilir
     */

    public Kedi() {

        System.out.println("Kedi p'siz cons...");

    }
    public void cirmala(){

        System.out.println("kedi fena cırmalar, miyavlar");
    }

}

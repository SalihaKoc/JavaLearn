package J26_Inheritance.inheritance01;

public class Mammal extends Hayvancik{ //Hayvancık parent class'ın child class-baba

    public Mammal() { //p'siz cons

        System.out.println("MAMMAL p'siz cons...");

    }

    public void sutBeslenme() {

        System.out.println("bebeleri süt ile beslenir");
    }

    public void dogum() {

        System.out.println("nur topu gibi yavrusu olur");
    }
}

package J26_Inheritance.inheritance02;

public class Kedi extends Mammal{

    public Kedi() {

        super();
        System.out.println("Kedi p'siz cons...");

    }
    public Kedi(String str) {

        this();
        System.out.println(super.c);

        System.out.println("Kedi p'li cons...");

    }
    int c=2;

    int d=5;

    @Override
    public void mC() { //Mammal parentten ezen method

        System.out.println("mC -> Kedi class meth call edildi");
    }
}


package J26_Inheritance.inheritance02;

public class Mammal extends Hayvancik {

    public Mammal() {

        this('y');
        System.out.println("MAMMAL p'siz cons...");
    }
    public Mammal(char c) {

        super(17);
        System.out.println("MAMMAL p'li cons...");
    }
    public void mC() {
        System.out.println("mC -> Mammal class meth call edildi");
    }
    int m=1;
    int c=4;

    @Override
    public void mM() { //parentten ezen method

        System.out.println("mM -> Mammal class meth call edildi");
    }
}

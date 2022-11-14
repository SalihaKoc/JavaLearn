package J32_Abstract.Ornek3;

public abstract class Salad extends Food {

    public abstract void madeIn(); //parent ve child abs class'larda aynı isimli

    @Override
    public void taste() {
        System.out.println("sirkeli, limonlu, sumaklı...");
    }
}

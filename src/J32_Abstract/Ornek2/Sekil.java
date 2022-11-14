package J32_Abstract.Ornek2;

public abstract class Sekil {
    private String name;

    public Sekil(String name) {
        setName(name);
    } //p'li oarent cons

    public Sekil() { //p'sz parent cons
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alan();

    public abstract double cevre();

    @Override
    public String toString() { //obj value'lar print eder
        return "Şekil ismi =" + this.name +
                "\n Alan = " + this.alan() +
                "\n Cevre = " + this.cevre()+
                "\n sekil "+ this.ciz();
    }

    public String ciz() {
        return this.name + " cizildi";
    }
    //public void ciz() {
    //    System.out.println(this.name + " çizildi...");
    //}
}

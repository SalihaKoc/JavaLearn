package J32_Abstract.abstract02;

public abstract class Personal {

    String name="Nur Hanım";

    public abstract void maasHesapla(); //abs meth
    public abstract void maasBilgisi(); //abs meth

    public void sigorta() { //conc meth
        System.out.println("agam özel sigorta kapsamındasın...");
    }

}

package J33_Interface;

public class Sahin extends Tofas implements DisDonanim,IcDonanim,Lastik {


    @Override
    public void kapi() {
        System.out.println("4 kapı sedan");
    }

    @Override
    public void kaporta() {
        System.out.println("Akordiyon kaporta");
    }

    @Override
    public void koltuk() {
        System.out.println("deri koltuk yazın sıkıntı");
    }

    @Override
    public void klima() {
        System.out.println("aç camı serinle");
    }

    @Override
    public void ebat() {
        System.out.println("16 inç lastik ebat");
    }

    @Override
    public void jant() {
        System.out.println("senin gibi janti adama çelik 5kollu yakışır");
    }

    @Override
    public void motor() {
        System.out.println("1.6 aile motor");
    }

    @Override
    public void yakit() {
        System.out.println("TÜPitak yoksa ocagın incir ağacı");
    }
}

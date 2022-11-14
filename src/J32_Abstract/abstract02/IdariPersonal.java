package J32_Abstract.abstract02;

public class IdariPersonal extends Personal {


    @Override //mecbur implement edilmeli
    public void maasHesapla() { //Personal parent class'dan override edilen abs meth

        System.out.println("Agam frapan idarecenize saatine $120 gayme vermek lazım");
    }

    @Override //mecbur implement edilmeli
    public void maasBilgisi() { //Personal parent class'dan override edilen abs meth

        System.out.println("Agam cıncık code yazan idari personele ekstradan bi ikramiye");
    }

    @Override //tercihe  override edildi
    public void sigorta() { //Personal parent class'dan override edilen conc meth
        System.out.println("Agam cıncık coder personel full sigorta");
    }
}

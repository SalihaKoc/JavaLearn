package J32_Abstract.abstract02;

public class Runner {

    public static void main(String[] args) {

        Isci mrb1=new Isci();
        mrb1.maasBilgisi(); //Agam marabalar cay-cügara hariç günde 8 saat kürek mahkumu
        mrb1.maasHesapla(); //Agam marabalara en çok yevmiye 400 gayme
        mrb1.name="Ebubekir Güzel İnsan";
        System.out.println("mrb1.name = " + mrb1.name); //mrb1.name = Ebubekir Güzel İnsan
        mrb1.sigorta(); //abs parent class'taki conc meth obj ile call
                        //agam özel sigorta kapsamındasın...
        IdariPersonal cncCdr=new IdariPersonal();

        cncCdr.name="Dilek orjiklerin efendisi";
        System.out.println("cncCdr.name = " + cncCdr.name); //cncCdr.name = Dilek orjiklerin efendisi
        cncCdr.sigorta(); //Agam cıncık coder personel full sigorta
        cncCdr.maasHesapla(); //Agam frapan idarecenize saatine $120 gayme vermek lazım
        cncCdr.maasBilgisi(); //Agam cıncık code yazan idari personele ekstradan bi ikramiye

    }
}

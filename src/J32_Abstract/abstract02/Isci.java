package J32_Abstract.abstract02;

public class Isci extends Personal{ //abs Personal parent classa extends -> concrete child Isci class

    @Override
    public void maasHesapla() { //Personal parent class'dan override edilen abs meth
        System.out.println("Agam marabalara en çok yevmiye 400 gayme");
    }

    @Override
    public void maasBilgisi() { //Personal parent class'dan override edilen abs meth
        System.out.println("Agam marabalar cay-cügara hariç günde 8 saat kürek mahkumu");
    }
}

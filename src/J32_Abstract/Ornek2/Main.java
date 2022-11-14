package J32_Abstract.Ornek2;

public class Main {
    public static void main(String[] args) {
        Dikdortgen dd = new Dikdortgen(15, 6);
        dd.setName(" dikdörtgen");
        //dd.alan();
        //dd.cevre();
        //dd.ciz();
        System.out.println(dd); //üstteki 3 meth call yerine toString'de ayarlanıp bir obj ile cagırdık hepsini

        Cember cmbr = new Cember(4);
        cmbr.setName(" çember");
        System.out.println(cmbr);

    }
}

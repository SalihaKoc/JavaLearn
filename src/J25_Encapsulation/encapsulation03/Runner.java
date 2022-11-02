package J25_Encapsulation.encapsulation03;

public class Runner {

    public static void main(String[] args) {

        Arac honda= new Arac("accord","gri",2000,-2020);
        Arac volvo= new Arac("s80","beyaz",-1800,2015);

        Arac haciMurat= new Arac();

        haciMurat.setModel("serce");
        haciMurat.setMotor(1300);
        haciMurat.setYil(1974);
        haciMurat.setRenk("beyaz");
        System.out.println("honda ne ararsan var onda "+ honda);
        System.out.println("haci murat "+ haciMurat);
        System.out.println("isveç tankı "+ volvo);
    }
}

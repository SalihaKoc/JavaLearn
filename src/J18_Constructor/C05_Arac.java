package J18_Constructor;

public class C05_Arac {

    //fields-> obj'nin üretilirken alacağı değerler
    //bir class'ta birden çok const tanımlanabilir

    /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */

    int maxHiz;
    String model;

    public C05_Arac(int maxHiz) { //1parametreli const

        this(180,"hacıMurat"); //2parametreli cons call edildi.. ilk satıra yazılmalı yoksa CTE verir

        // maxHiz = maxHiz; ->this olmadığı için paramtre değeri inst. cıktı default(0) olur

        this.maxHiz = maxHiz; //this keyword parametre değeri inst variable'e atar
                                //obj maxHiz değeri parametreden alır
        System.out.println("bu sefer de 2parametreli const call edildi");
    }

    public C05_Arac() { //paramtresiz const
    }

    public C05_Arac(int maxHiz, String model) { //2parametreli constr
        this.maxHiz = maxHiz;
        this.model = model;

        System.out.println("bu yazıyı okuyorsan 2p'li const call edilmiştir");

    }

    public C05_Arac(String model,int maxHiz) { //2parametreli constr
        this.maxHiz = maxHiz;
        this.model = model;

        System.out.println("2p'li const call edilmiştir");
    }
}

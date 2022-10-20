package J18_Constructor;

public class C04_Teacher { //teacher obj ureten class

    String ad;
    String soyad;

    int id;
    String brans;
    int tecrube;
    double maas;
    boolean emekli;

    public void dersSaati(){
        System.out.println("agam haftada 20saatten sonrası ekstraya girer");
    }

    public C04_Teacher() {
    }

    //king Of Trick-> parametreli cons default cons'u ezer
    public C04_Teacher(String ad, String soyad, int id, String brans, int tecrube, double maas, boolean emekli) {
        //parametreli constructor üretildi
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
        this.brans = brans;
        this.tecrube = tecrube;
        this.maas = maas;
        this.emekli = emekli;
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", id=" + id +
                ", brans='" + brans + '\'' +
                ", tecrube=" + tecrube +
                ", maas=" + maas +
                ", emekli=" + emekli +
                '}';
    }
}

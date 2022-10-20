package J18_Constructor;

public class C03_Student { //main olmayan sadece student obj create etmek için pojo->plan old java object : obj için standart clas-kalıphane

    //fields->
    String ad;

    @Override
    public String toString() {  //obj referans değeri print etmemesi için
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sinif=" + sinif +
                ", okulNo=" + okulNo +
                ", ortalama=" + ortalama +
                ", takdir=" + takdir +
                '}';
    }

    String soyad;
    int sinif;
    int okulNo;
    double ortalama;
    boolean takdir;

    public void mezuniyet() { //method
        if (ortalama>=50) {
            System.out.println("diploma hayırlı olsun");
        }else System.out.println("seneye de bekleriz devamkee");
    }

    public void sosyalFaaliyet(){
        System.out.println("fiziksel zindelik = zihinsel zindelik . koş babam koş");
    }


}

package J18_Constructor;

public class C03_StudentRunner {

    public static void main(String[] args) {

        C03_Student ogrenci1=new C03_Student(); //ogrenci1 obj create edildi

        ogrenci1.ad="Fatih";
        ogrenci1.soyad="Ataş";
        ogrenci1.okulNo=1001;
        ogrenci1.sinif=1;
        ogrenci1.ortalama=77;
        ogrenci1.takdir=false;
        System.out.println(ogrenci1); //J18_Constructor.C03_Student@17c68925
                                      //toString yaptıktan sonra :
                                      //C03_Student{ad='Fatih', soyad='Ataş', sinif=1, ortalama=77.0, okulNo=1001, takdir=false}
        ogrenci1.mezuniyet(); //diploma hayırlı olsun

        //task->diğer bir ogrenci obj ile tüm field'ları atayıp print ediniz:

        C03_Student ogrenci2=new C03_Student();
        ogrenci2.ad="Saliha";
        ogrenci2.soyad="Koç";
        ogrenci2.okulNo=1002;
        ogrenci2.sinif=2;
        ogrenci2.ortalama=85;
        ogrenci2.takdir=true;

        System.out.println(ogrenci2);
        ogrenci2.mezuniyet();
        ogrenci2.sosyalFaaliyet();
    }
}

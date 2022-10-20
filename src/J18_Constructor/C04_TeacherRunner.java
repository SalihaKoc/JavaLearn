package J18_Constructor;

public class C04_TeacherRunner {

    public static void main(String[] args) {

        C04_Teacher ogretmen1=new C04_Teacher(); //ogretmen1 obj create edildi

        ogretmen1.ad="Muharrem";
        ogretmen1.soyad="Güzsel";
        ogretmen1.brans="Qa";
        ogretmen1.emekli=false;
        ogretmen1.maas=23000;
        ogretmen1.tecrube=11;
        ogretmen1.dersSaati();
        System.out.println(ogretmen1);

        C04_Teacher ogretmen2=new C04_Teacher("Saliha","Koç",101,"dev",2,21.500,false);
        System.out.println(ogretmen2); //C04_Teacher{ad='Saliha', soyad='Koç', id=101, brans='dev', tecrube=2, maas=21.5, emekli=false}


    }
}

package J99_Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class C10_object {

    public static void main(String[] args) {

           /*
           TASK :
           fields --> Universite (String)
           bolum (String)
           ogrcSayisi (int)
           notOrt (int)
           olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
            */

        Universite u01=new Universite("Bogazici","Matematik",571,73);
        Universite u02=new Universite("İstanbul","Matematik",622,77);
        Universite u03=new Universite("Marmara","Hukuk",1453,52);
        Universite u04=new Universite("Itu","Uçak Müh",333,63);
        Universite u05=new Universite("Yıldız Teknik","Gemi Müh.",216,55);

        List<Universite> unv =new ArrayList<>(Arrays.asList(u01,u02,u03,u04,u05));

        System.out.println("Task01 : " + notOrt4Byk(unv)); //false
        System.out.println("Task02 : " + ogrncSayisi110AzMi(unv)); //true
        System.out.println("Task03 : " + enAz1MatVarMi(unv)); //true
        System.out.println("Task04 : " + ogrSayiGoreTersSirala(unv));
        System.out.println("Task05 : " + notOrtTersSira(unv));
        System.out.println("Task06 : " + ogrSayiEnAz2(unv));
        System.out.println("Task07 : " + notOrt63BykOgrSayiToplam(unv));
        System.out.println("Task07 : " + ogrSayi333BykNotOrt(unv));
    }

    //task 01--> notOrt'larinin 74' den buyuk oldg kontrol eden pr create ediniz.
    public static boolean notOrt4Byk(List<Universite> unv) {

        return unv.stream().allMatch(t-> t.getNotOrt()>74);
    }

    //task 02-->ogrc sayilarinin 110 den az olmadigini kontrol eden pr create ediniz.
    public static boolean ogrncSayisi110AzMi(List<Universite> unv) {

        return unv.stream().allMatch(t->t.getOgrcSayisi()>=110);
    }

    //task 03-->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden pr create ediniz.
    public static boolean enAz1MatVarMi(List<Universite> unv) {

        return unv.stream().anyMatch(t->t.getBolum().toLowerCase().contains("matematik"));
    }

    //task 04-->universite'leri ogr sayilarina gore b->k siralayiniz.
    public static List<Universite> ogrSayiGoreTersSirala(List<Universite> unv) {

       return unv.stream().
                sorted(Comparator.comparing(Universite::getOgrcSayisi).reversed()).
                collect(Collectors.toList()); //akıştaki elemanlar liste atandı
        // collect(Collectors.coll) -> Collector class'dan call edilen coll methodu ile akış elemanları atanır
    }

    //task 05-->universite'leri notOrt gore  b->k siralayip ilk 3 'unu print ediniz.
    public static List<Universite> notOrtTersSira(List<Universite> unv) {

        return unv.stream().
                sorted(Comparator.comparing(Universite::getNotOrt).reversed()).
                limit(3).
                collect(Collectors.toList());
    }
    //task 06--> ogrc sayisi en az olan 2. universite'yi  print ediniz.
    public static List<Universite> ogrSayiEnAz2 (List<Universite> unv){

        return unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi)).limit(2).skip(1).
                collect(Collectors.toList());

        //return unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi)).skip(1).findFirst().stream().collect(Collectors.toList());

        //return unv.stream().sorted(Comparator.comparing(Universite::getOgrcSayisi)).collect(Collectors.toList()).subList(1,2);
    }

    //task 07--> notOrt 63 'den buyuk olan universite'lerin ogrc sayilarini toplamini print ediniz.
    public static int notOrt63BykOgrSayiToplam(List<Universite> unv) {

        return unv.stream().filter(t->t.getNotOrt()>63).
                mapToInt(t->t.getOgrcSayisi()). //akıştaki elemanların data type'nı parametredeki değere göre update eder
                sum(); //akıştaki elemanlar toplanır
    }

    //task 08--> Ogrenci sayisi 333'dan buyuk olan universite'lerin notOrt'larinin ortalamasini bulunuz.
    public static OptionalDouble ogrSayi333BykNotOrt(List<Universite> unv) {

        return unv.stream().filter(t->t.getOgrcSayisi()>333).mapToDouble(t->t.getNotOrt()).average();
                                                                                         //average().getAsDouble() yazınca return type double kalabiliyor
    }

    //task 09-->"matematik" bolumlerinin sayisini  print ediniz.
    //task 10-->Ogrenci sayilari 571'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.
    //task 11-->Ogrenci sayilari 1071'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.


}

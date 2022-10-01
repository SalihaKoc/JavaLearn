package J10_StringManipulation;

import java.util.Scanner;

public class C07_IndexOf_LastIndexOf {

    public static void main(String[] args) {

        /* indexOf()
        * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
        * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
         contains den farkı indexini verir, contains ise true false
        */

        String str= "Good of scholl";

        System.out.println("ilk görülen 0 nun yeri index nosu = " + str.indexOf('o'));

        System.out.println("d nin yeri index nosu = " + str.indexOf('d'));

        System.out.println("D nin yeri index nosu = " + str.indexOf('D')); // -1 -> D karakteri olmadığı için

        //TRICK : olmayan karakter index i sorgulanırsa -1 return eder

        System.out.println("od un yeri index nosu = " + str.indexOf("od"));

        /** lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */

        String isim= "mustafa nizamoğlu";

        System.out.println(isim.indexOf('a')); //4

        System.out.println(isim.lastIndexOf('a')); //11

        System.out.println(isim.lastIndexOf("fa")); //5
        System.out.println(isim.indexOf("fa")); //5

        /*  task
         Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

         1-Girilen cumle java icermiyor
         2-Girilen cumle 1 tane java iceriyor
         3-Girilen cumlede birden fazla java var
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("kafi miktarda bir cümle giriniz : ");

        String cumle=scan.nextLine().toLowerCase();

        if (cumle.indexOf("java")==-1) { //cumle.contains("java") !=

            System.out.println("Girilen cumle java icermiyor");

        } else if (cumle.indexOf("java")== cumle.lastIndexOf("java")) {

            System.out.println("Girilen cumle 1 tane java iceriyor");

        } else System.out.println("Girilen cumlede birden fazla java var");





    }
}

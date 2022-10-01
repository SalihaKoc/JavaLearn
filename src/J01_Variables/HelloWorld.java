package J01_Variables;

public class HelloWorld {

    public static void main(String[] args) {

       /* System.out.println("Merhaba Dünya"); //bu komut konsola yazılan metni print eder

        //dan sonra yazılan ifadeler komut veya kod satırı olarak değil yorum olarak tanımlanır.

        /*
        Bu araya yazılan her ifade yorum satırı olur java kod olarak derlemez
        Başarı gayrete aşıktır.
        Bahanesi olanın başarısı olmaz.
         */

//imlecin olduğu satır ctrl+d ile alt satıra kopyalanır
/*
        System.out.println("Javacanlara selam olsun");
        System.out.println("Javacanlara selam olsun");//çalışmasını istemediğimiz kod satırının başına //yazarak yoruma alınır
        System.out.println("Javacanlara selam olsun");//çalışmasını istemediğimiz kod satırının başına //yazarak yoruma alınır
        System.out.println("Javacanlara selam olsun");//çalışmasını istemediğimiz kod satırının başına //yazarak yoruma alınır

 */
        /*
 TRICK : javada code satırı sonuna mutlaka ; konulmalı
 kod satırında kırmızı alt çizgi uyarısı "compile time error" CTE hatası uyarısı demektir.
 CTE düzeltimeden code yazılmaz yazılan code çalışmaz

         */
        /*
        System.out.println("hata"); //cte hatası


         */

        System.out.print("Adım Soyadım : Saliha Koç");
        System.out.println(" Yaşım : 32");
        System.out.println("Memleketim : Ankara");
        System.out.println("Mesleğim : Bilgisayar Mühendisi");

        /*
        TRICK:
        print -> yazdırma işleminden sonraki komutu AYNI satırda devam ettirir.
        println -> yazdırma işleminden sonraki komutu ALR satırda devam ettirir.
        javada space "boşluk" bir karakter olarak tanımlanır.
        h a l u k -> 9 karakter
         */
    }
}

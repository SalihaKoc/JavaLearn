package J19_StaticVariable;

public class C02_StaticBlock {

        /*
        1.Static block yapıları static variable'ları değer ataması ya da update için kullanılır
        2.Static block class olusturuldugunda bütün methodlardan (main dahil) önce çalışır
        3.Birden fazla static block varsa yukarıdan aşağıya sıralama ile çalışır
         */

    static String isim="Haluk Hoca";
    static {
        System.out.println("agam 1.static block çalıştı");
        isim="Dilek Hanım";
        System.out.println("isim = " + isim); //Dilek Hanım
    }

    public static void main(String[] args) {

        System.out.println("main method başladı");
        isim="Kerim Bey";
        System.out.println("isim = " + isim); //Kerim Bey
        System.out.println("main method bitti");


    }

    static {
        System.out.println("agam 2.static block çalıştı");
        isim="Uğur Bey";
        System.out.println("isim = " + isim); //Uğur Bey
    }
}

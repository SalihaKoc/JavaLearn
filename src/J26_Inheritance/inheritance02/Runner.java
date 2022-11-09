package J26_Inheritance.inheritance02;

public class Runner {

    public static void main(String[] args) {

        Kedi k1=new Kedi();
        System.out.println("k1.a = " + k1.a); //0-hayvancık class call
        System.out.println("k1.c = " + k1.c); //2-kedi class call
        System.out.println("k1.d = " + k1.d); //5-kedi class call
        System.out.println("k1.m = " + k1.m); //1-mammal class call

        /*
        Aynı isimli variable'lardan hangisinin kullanıldığı olusturulan object'in data type'ina göre bilinir.
        Variable'ı arastırmaya data type'i class'ından baslanır
         */
        k1.mA(); //parent (haycancık) class call edildi
        k1.mC(); //kedi class call
        k1.mM(); //mammal class

        /*
        Method cagrılırken aynı isimli methodlardan hangisinin kullanılacagına constructor karar verir.
        methodlrı arastırmaya cons ismini tasıyan classdan baslayıp ve parentlerde arastırmaya devam eder
         */

        Mammal k2=new Kedi("Kevser Hanım"); //datatype
        System.out.println("k2.c = " + k2.c);
        System.out.println("k2.a = " + k2.a);
        System.out.println("k2.m = " + k2.m);
       // k2.d -> CTE k2 obj data type class -da variable yok call edilemezz
        k2.mA();//hayvancık class meth call
        k2.mC();//kedi class meth call
        k2.mM();//mammal class meth call

        Hayvancik k3=new Kedi();
        System.out.println("k3.m = " + k3.m);
        System.out.println("k3.a = " + k3.a);
        // k3.c -> datatype hayvancık class oldugu için class'da olmayan variabala
        k3.mA(); //HAYVANCIK class meth call
        k3.mM();//Mammal class meth call edildi

        Mammal m1=new Mammal('$');
        System.out.println("m1.m = " + m1.m); //1
        System.out.println("m1.a = " + m1.a); //0
        System.out.println("m1.c = " + m1.c); //4
      //  m1.d -> parent mammal class child kedi'den variable call edilemez
        m1.mA(); //Hayvancık class call
        m1.mC(); //Mammal class call
        m1.mM(); //MAmmal class call

    }
}

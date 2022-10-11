package J14_Scope;

public class C01_InstanceVariable {
        /*                                  INSTANCE VARIABLE

   1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
      olusturulan variable'lara "instance variable" denir.
   2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
   3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
      Asagida goruldugu gibi "yas" variable'ina deger atamasi yaptim "tecrube" variable'ina yapmadim.
      Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
         "i" variable'i initialize edildi, digerleri initialize edilmedi.
   4) Initialize edilmeyen "instance variable" lar icin Java kendisi deger atamasi yapar.
      Java'nin instance variable'lara kendisinin verdigi degerlere "default value" denir.
            byte, short, int, long icin default value 0'dir.
            float, double icin default value 0.0'dir.
            char icin default value 0'dir.
            boolean icin default value false'dur.
            String icin default value "null" dir.
*/
        static String kurs = "clarus";
        int yas = 48; //initialized ilk atamsı yapılmış ins. variable
        int tecrube;// default deger 0
        String name;// default deger null
        boolean developerMi; // deafult deger false
        static double boy;// default deger 0.0
        char unvan;// default deger bosluk

    public static void main(String[] args) {

        int a=7; //local variable
        System.out.println(a);
        //System.out.println(yas); //instance variable-> değer ataması yapmadan işleme alınmaz
        System.out.println(kurs); //static variable doğrudan static methoda çağrıldı

        a=24;
        System.out.println(a);

        staticMethod(); //static method call edildi -> static olan main sadece static method call eder
        //non_staticMethod(); //non-static method call eilemeezzz...

        //obj creation -> ClassNane objName = new ClassName();

        C01_InstanceVariable ebikGabıkObj=new C01_InstanceVariable(); //obj create edildi

        ebikGabıkObj.boy=1.9; //inst variable call edilip atama yapıldı
        ebikGabıkObj.developerMi=true;
        ebikGabıkObj.name="Saliha";
        System.out.println(ebikGabıkObj.name); //saliha
        System.out.println(ebikGabıkObj.tecrube); //default değer :0
        ebikGabıkObj.yas=33;
        System.out.println("ebikGabıkObj.yas = " + ebikGabıkObj.yas); //33

        C01_InstanceVariable obj1= new C01_InstanceVariable(); //obj1 isminde obje create edildi

        C01_InstanceVariable obj2= new C01_InstanceVariable(); //obj1 isminde obje create edildi

        obj1.boy=1.75;
        obj1.name="haluk bey";
        System.out.println("obj1.boy = " + obj1.boy); //1.75
        System.out.println("obj1.name = " + obj1.name); //haluk bey


    }
    //a=23; //local dısı call edilemez

    public void non_staticMethod(){ //static olmayan method
        System.out.println("static olmayan metoddan bolca selam");
    }

    public static void staticMethod(){ //static method
        System.out.println("static : günes metoddasın devamke");
    }

}

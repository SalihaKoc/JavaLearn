package J18_Constructor;

public class
C01_Constructor {

        /*
        1- constructor ismi Class name ile aynı olmalı. Büyük harf ile başlamalı
        2- constructor create edildiğinde name'den sonra () {} mutlaka kullanılmalı
        3- eğer p'li constructor create edildiğind kava default cons ezer(siler)
        4- cons.'ın return type olmaz method'dan ayıran özelliğidir.
        5- Class oluştuğunda java default cons. kendi create eder.
         */

    String str; //inst variable-> obj variable
    String selam="güzel insan";
   // C01_Constructor obj1= new C01_Constructor();

    public static void main(String[] args) {

        // lass name+ obje name+new keyword + default cons
        C01_Constructor obj1= new C01_Constructor();
        C01_Constructor obj2= new C01_Constructor();
        C01_Constructor obj3= new C01_Constructor();
        C01_Constructor obj4= new C01_Constructor();

        obj1.str="javacan"; //str ins variable obj1 ile call edilerek obj1 javacan değeri atandı
        obj2.str="javatar"; //str ins variable obj2 ile call edilerek obj2 javatar değeri atandı
        System.out.println(obj3.selam);; //güzel insan
        System.out.println(obj1.str); //javacan
        System.out.println(obj2.str); //javatar
        System.out.println(obj4.str); //null

        obj3.aga(); //agama selamkee
        obj1.aga(); //agama selamkee

    }

    public void aga() {
        System.out.println("agama selamkee");
    }
}

package J33_Interface;

public interface DisDonanim {

    public void kapi(); //abs meth

    void kaporta(); //abs meth

    String RENK="opak kırmızı"; //public static final variable

    public default String sisLamp() { //default conc meth
        return "sisli havada dikkat";
    }

    static void anten() { //static conc meth
        System.out.println("antensiz olmaz");
    }

   //public static default void sorunMethod(){ //CTE -> static ve default aynı anda kullanılmaz
   //}

   //DisDonanim obj=new DisDonanim(); //can not be instantiated -> obj olmaz, olamazz

   // public static void main(String[] args) { //bad practice -> projede tek bir main meth ve main class kullanılmalı

   //     System.out.println("RENK = " + RENK);

   //     aga(); //static meth call

   // }



}

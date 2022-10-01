package J02_DataTypes_WrapperClass;

public class C03_Concatenation {

    public static void main(String[] args) {

        String Ad="Saliha";
        String Soyad="Koç";

        int a=7;
        int b=11;

        //Birden çok String variable ile farklı data type variable'lar + ile işleme alınırsa java birleştirme yaparak yeni bir String oluşturur
        // TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre işlem yapılıp String variable'a Concatenation yapılır.

        System.out.println(Ad+Soyad+a+b); //
        System.out.println(a+Ad+Soyad+b); //
        System.out.println(a+b+Ad+Soyad); //
        System.out.println(" "+a+b); //
        System.out.println(Ad+Soyad+(a+b)); //SalihaKoç18
        System.out.println((a+b)+Ad+Soyad); //18SalihaKoç
        System.out.println(Ad+(a-b)+(a-b)); //Saliha-4-4
        System.out.println(Ad+((a-b)+(a-b))); //Saliha-8

        char ch='1';
        System.out.println(Ad+ch); //Saliha1
        System.out.println(a+ch+Ad); //56Saliha
        System.out.println(Ad+(ch+b)); //Saliha60
        System.out.println(a+Ad+ch); //7Saliha1

        /* TRICK-> char data türü işleme girdiği variables'in türüne göre farklı işlem yapar
        Eğer işleme girdiği variables aritmetik bir işlemse ascii değeri ile işlem yapar.
         */



    }
}

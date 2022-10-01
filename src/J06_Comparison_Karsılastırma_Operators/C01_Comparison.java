package J06_Comparison_Karsılastırma_Operators;

public class C01_Comparison {
    public static void main(String[] args) {
        /*

==     Esit               x == y
!=     Esit degil         x != y
>      buyuk              x > y
<      kucuk              x < y
>=     buyuk esit         x >= y
<=     kücük esit         x <= y

        */
        int SlmYas=33;
        int KrmYas=41;
        System.out.println("Kerim B eşit mi Salim B ?   " +(SlmYas==KrmYas) ); //false
        System.out.println("Kerim B eşit değil mi Salim B ?   "+(SlmYas==KrmYas) ); //true
        System.out.println("Kerim B buyuk mu Salim B ?    " +(SlmYas>KrmYas) ); // false
        System.out.println("Kerim B kucuk mu Salim B ?    " +(SlmYas<KrmYas) ); //true

        /*s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir.
        s1 == s2 , s1 ve s2 'nin hafızadaki adres değerlerini karşılaştırır ve  String constant pool üzerinde aynı adresi gösterirler.
        Böylece ekrana TRUE yazdırır. */

        String s1 = "Kerim Bey";
        String s2 = "kerim Bey";
        System.out.println(s2==s1);


    }
}

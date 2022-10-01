package J10_StringManipulation;

public class C05_Start_EndWith {

    public static void main(String[] args) {

        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */
        String s1="istanbul";
        System.out.println(s1.startsWith("i")); //true

        System.out.println(s1.startsWith("is")); //true

        System.out.println(s1.startsWith("s")); //false

        System.out.println(s1.startsWith("a", 3)); //3.index'ten itibaren a ile mi başlar -> true

        System.out.println(s1.startsWith("n", 3)); //false

        System.out.println(s1.endsWith("l")); //true
        System.out.println(s1.endsWith("bu")); //false

        String str="bul";
        System.out.println(s1.endsWith(str)); //true

        int yas=48;
       // System.out.println(s1.endsWith(yas)); // CTE

        //Task -> girilen e-mail hesabını @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
               // @gmail.com ile bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz" print eden code

    }
}

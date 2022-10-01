package J10_StringManipulation;

public class C01_Concatenation {

    public static void main(String[] args) {

        /**
         * concat() methodu içine (parametre) aldığı string variable'ı çalıştığı string'in sonuna ekler
         * Java'da + işlemi yapılırken en az bir string variable varsa java toplama değil concat yapar
         */

        String name="Nur";

        String meslek=" Qa Tester ";

        System.out.println(name.concat(meslek)); //Nur Qa Tester

        System.out.println(name); //Nur

        //TRICK -> String method'ları varible gecici değişiklik yapar
        //ama değişken atama yapılırsa kalıcı değişir

        name=meslek.concat(name);
        System.out.println("name = " + name); //Qa Tester Nur

        System.out.println(name.concat(true + " :) ")); // Qa Tester Nurtrue :)
        System.out.println(name.concat(100 + " :) ")); //Qa Tester Nur100 :)

        //TRICK -> concat methodu parametre olarak string type harici tüm dataları stringe çevirip concat eder


    }

}

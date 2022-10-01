package J04_AritmeticOperators;

public class C02_IncrementDecrement {

    public static void main(String[] args) {

        System.out.println("   ****Artırma *****  ");
        int a=7;
        System.out.println(++a); // arttırır 8 oldu , yazdırdı 8
        System.out.println(a++); //önce yazdırdı 8 , sonra arttırır 8
        System.out.println(a); //yazdırdı 9
        System.out.println(a++ + ++a); // önce yazdırdı 9  sonra arttırdı 10 + önce arttırdı 11 sonra yazdırdı 11 = 20
        System.out.println(a); //yazdırdı 11


    }
}

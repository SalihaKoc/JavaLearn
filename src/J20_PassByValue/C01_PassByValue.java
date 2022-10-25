package J20_PassByValue;

public class C01_PassByValue {

    public static void main(String[] args) {

        /*
        Java Pass By Value bir programlama dilidir.
        Bir primitive variable argument olarak bir methoda call edildiğinde variable değil
        bir copy clone (vesikalık-pointer) değeri gönderilir.
         */

        //task -> verilen fiyat için %24 artırılmış fiyatı print eden method create edin

        double fiyat=100; //primitive double type variable

        System.out.println("method call öncesi fiyat = " + fiyat);
        fiyatArttir(fiyat);
        System.out.println("method call sonrası fiyat = " + fiyat);

    }

    public static void fiyatArttir(double bisey) {
        bisey*=1.24;
        System.out.println("arttırılmış fiyat = " + bisey);
    }
}

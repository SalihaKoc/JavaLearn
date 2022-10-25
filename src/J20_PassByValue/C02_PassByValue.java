package J20_PassByValue;

public class C02_PassByValue {

    public static void main(String[] args) {

        // task -> verilen fiyat için %11 %22 ve %33 indirimli fiyatı print eden method

        double fiyat = 100;

        System.out.println("method call öncesi fiyat = " + fiyat);

        System.out.println("indirim11() = " + indirim11(fiyat));
        System.out.println("indirim22() = " + indirim22(fiyat));
        System.out.println("indirim33() = " + indirim33(fiyat));

    }

    private static double indirim33(double fiyat) {
        return fiyat*=0.67;
    }

    private static double indirim22(double fiyat) {
        return fiyat*=0.78;
    }

    private static double indirim11(double fiyat) {
        return fiyat*=0.89;
    }


}

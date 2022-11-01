package J23_Varargs_StringBuilder.Varargs;

public class C02_Varargs {

    public static void main(String[] args) {

        /*
        arr ve varargs method :
         */

        int arr[]={24,42,33,19,34,45,58,38};

        System.out.println("arrTopla(arr) = " + arrTopla(arr)); //293

        System.out.println("varargs int değer Toplam = " + varargsTopla(24, 42, 33, 19, 34, 45, 58, 38)); //293
        System.out.println("varargs array değer Toplam = " + varargsTopla(arr)); //293

        // TRICK -> varargs method parametreleri array gibi tanımladığı için
        // varargs methoda parametre olrak array de verilebilir

        //task1-> Verilen array elemanları toplamı print eden method create ediniz
        //task2-> task1'i varargs ile çalışınız
    }

    public static int arrTopla(int[] a) {

        int toplam=0;

        for (int w: a) {
            toplam+=w;
        }

        return toplam;
    }
    public static int varargsTopla(int ...b) {
        int toplam=0;

        for (int s:b) {
            toplam+=s;
        }

        return toplam;
    }

}

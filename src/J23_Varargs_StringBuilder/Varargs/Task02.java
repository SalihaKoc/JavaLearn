package J23_Varargs_StringBuilder.Varargs;

public class Task02 {

    public static void main(String[] args) {

        //task-> girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan method

        System.out.println("sonuç = " + toplaCarp(2, 24, 23, 38, 33, 21, 59, 26,10));

        int arrTop[]={24, 23, 38, 33, 21, 59, 26,10};

        System.out.println("(2,arrTop) = " + toplaCarp(2, arrTop));
    }

    public static int toplaCarp(int carpilacakSayi, int...toplanacakSayilar) {
        int toplam=0;
        for (int a: toplanacakSayilar) {
            toplam+=a;
        }
        return carpilacakSayi*toplam;
    }


}

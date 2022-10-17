package J15_Arrays.Tasks;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        int sayi[]={5,6,8,12,14,19};

        int toplam=0;
        for (int i: sayi) {
            if(i%2==0){
                toplam+=i;
            }else toplam-=i;
        }
        System.out.println("sonuç = " + toplam);
    }
}

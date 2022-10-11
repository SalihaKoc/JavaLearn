package CodeChallenge.day06;

public class Q04_NestedForLoop {

     /*  Problem Tanımı
    Girilen bir sayı kadar satır ve sütünu olan ve
    sağ kenara dayalı üçgeni basan kodu yazınız.

    Ekran Çıktısı
    Bir sayi giriniz: 5
           *
          **
         ***
        ****
       *****
     */
     public static void main(String[] args) {

         for (int satir = 1; satir <=5 ; satir++) { //satır kontrolu

             for (int bosluk = 5-satir; bosluk > 0; bosluk--) { //bosluk kontrolu

                 System.out.print(" ");

             }
             for (int sutun = 1; sutun <= satir ; sutun++) { //sutun kontrolu

                 System.out.print("*");

             }
             System.out.println();
         }
         for (int i = 1; i <=5; i++) {
             for (int j = 1; j <=i ; j++) {
                 System.out.print("*");
             }
             System.out.println();
         }
     }
}

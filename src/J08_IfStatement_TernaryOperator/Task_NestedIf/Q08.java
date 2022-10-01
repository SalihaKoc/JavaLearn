import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet ürün aldınız ? ");
        int adet = scan.nextInt();

        System.out.print("Liste fiyatı kaçtır ? ");
        double fiyat = scan.nextDouble();
        double eskiFiyat=0;
        double yeniFiyat = 0;

        System.out.print("Kartınız var mı ? E/H : ");
        char cvp = scan.next().toUpperCase().charAt(0);

        if (cvp == 'E') {
            if (adet > 10) {
                System.out.println("%20 indirim kazandınız \n Eski borcunuz :" + (eskiFiyat=adet*fiyat) + "\n Yeni borcunuz : " + (yeniFiyat = adet * fiyat * 0.8));
            } else {
                System.out.println("%15 indirim kazandınız \n Eski borcunuz :" + (eskiFiyat=adet*fiyat) + "\n Yeni borcunuz : " + (yeniFiyat = adet * fiyat * 0.85));
            }

        } else if (cvp == 'H') {
            if (adet > 10) {
                System.out.println("%15 indirim kazandınız \n Eski borcunuz :" + (eskiFiyat=adet*fiyat) + "\n Yeni borcunuz : " + (yeniFiyat = adet * fiyat * 0.85));
            } else {
                System.out.println("%10 indirim kazandınız \n Eski borcunuz :" + (eskiFiyat=adet*fiyat) + "\n Yeni borcunuz : " + (yeniFiyat = adet * fiyat * 0.9));

            }

        }
        else System.out.println("Hatalı giriş...");

    }
}
package J10_StringManipulation;

public class C11_ValueOf_parse {

    public static void main(String[] args) {

        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        //Task -> String type verilen iki adet bağıs miktarını toplayan code create edin

        String bagis1="1500";
        String bagis2="2500";

        int bagisDegeri1=Integer.valueOf(bagis1); //bagis1 string içindeki sayı değerini int'e çevirdi bagisDegeri1'e atadı
        int bagisDegeri2=Integer.valueOf(bagis2); //bagis1 string içindeki sayı değerini int'e çevirdi bagisDegeri1'e atadı

        System.out.println("toplam bağış değeri : " + (bagisDegeri1 + bagisDegeri2)); //4000

        int fetih =Integer.valueOf("1453");
        System.out.println(fetih); //1453

        System.out.println("toplam bağış : " + (Integer.parseInt(bagis1) + Integer.parseInt(bagis2))); //toplam bağış : 4000

        int tc=1234567;

        String strTc= String.valueOf(tc);
        System.out.println("strTc : "+strTc);
        System.out.println("strTc + tc = "+ strTc + tc); //12345671234567

        String fiyat="$150";
        System.out.println(fiyat.replaceAll("$", ""));
        int yeniFiyat=Integer.valueOf(fiyat);
        System.out.println("yeniFİyat = " + yeniFiyat);




    }
}

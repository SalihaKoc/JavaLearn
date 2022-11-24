package J36_Map.Tasks;

import java.util.*;

public class Task04 {

    ///			KELİME ANALİZİ

    /*
     * Girilen bir metinde kelimelerin kaç kere geçtiğini bulan program yazınız.
     *
     * 1. Adım : ( Kelime = Kaç Kere Geçiyor ) Şeklinde veri tutmak için HashMap oluşturun.
     * 2. Adım : Girilen metni split methodu ile parçalayalım.
     * 			 ilk önce "." ya göre parçalayıp cümleleri elde edelim
     * 			 daha sonra " " boşluğa göre parçalayıp kelimeleri elde edelim
     * 3. Adım : Tüm kelimeleri kontrol etmek için for döngüsü kullanalım ve tüm kelimeleri oluşturduğumuz hashMap'e aktaralım.
     * 			 Eğer hashmap'te yoksa ekleyelim ve sayısına 1 yazalım.
     * 		 	 Eğer hashmap'te zaten varsa, sayısını bir artıralım.
     * 3. Adım : Tüm kelimeler kontrol edildikten çıktı verelim. Ve tüm kelimeleri tekrar sayısıyla birlikte gösterelim.
     *
     * İpucu : "." özel karakter olduğu için "\\." şeklinde split ediniz.
     * */

    public static void main(String[] args) {

        HashMap <String,Integer> kelimeKacKere = new HashMap<>();

        Scanner scan=new Scanner(System.in);
        System.out.println("Metin Giriniz : ");
        String metin=scan.nextLine();
        System.out.println();

        List<String> cumleListe=new ArrayList<>(Arrays.asList(metin.split("\\.")));
        System.out.println("cumleListe = " + cumleListe);

        for (int i = 0; i < cumleListe.size(); i++) {
            List <String> kelimeListe=new ArrayList<>(Arrays.asList(cumleListe.get(i).trim().split(" ")));

            //System.out.println("kelimeListe = " + kelimeListe);

            for (int j = 0; j < kelimeListe.size(); j++) {
                if(kelimeKacKere.containsKey(kelimeListe.get(j))) kelimeKacKere.replace(kelimeListe.get(j), kelimeKacKere.get(kelimeListe.get(j))+1);
				else kelimeKacKere.put(kelimeListe.get(j),1);
            }
        }
        System.out.println("kelimeKacKere = " + kelimeKacKere);

    }

}

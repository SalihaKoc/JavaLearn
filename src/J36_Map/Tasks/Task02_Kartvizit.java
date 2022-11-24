package J36_Map.Tasks;

import java.util.HashMap;
import java.util.Map;

public class Task02_Kartvizit {
    public static void main(String[] args) {
        /*
        Task ->
         Key:isim ,email,adres,telefon
         Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir
         map tanımlayıp print eden code create ediniz
         */

        HashMap<String, String> semihKartvizit = new HashMap<>();
        semihKartvizit.put("İsim", "Semih");
        semihKartvizit.put("Email", "semih06@gmail");
        semihKartvizit.put("Adres", "Ankara");
        semihKartvizit.put("Telefon", "3124523");

        HashMap<String, String> ismailKartvizit = new HashMap<>();
        ismailKartvizit.put("İsim", "İsmail");
        ismailKartvizit.put("Email", "ismail@gmail");
        ismailKartvizit.put("Adres", "İstanbul");
        ismailKartvizit.put("Telefon", "2125514");

        Map<String, HashMap<String, String>> kartvizit = new HashMap<>();

        kartvizit.put("QA Semih", semihKartvizit);
        kartvizit.put("QA İsmail", ismailKartvizit);

        System.out.println("kartvizit = " + kartvizit); //kartvizit = {QA İsmail={Email=ismail@gmail, İsim=İsmail, Telefon=2125514, Adres=İstanbul}, QA Semih={Email=semih06@gmail, İsim=Semih, Telefon=3124523, Adres=Ankara}}

        System.out.println("kartvizit.get(\"QA Semih\") = " + kartvizit.get("QA Semih")); //{Email=semih06@gmail, İsim=Semih, Telefon=3124523, Adres=Ankara}
        System.out.println("kartvizit.get(\"QA Semih\").get(\"Telefon\") = " + kartvizit.get("QA Semih").get("Telefon")); //= 3124523

        Map<Integer, Kartvizit> krt = new HashMap<>();
        Kartvizit k1 = new Kartvizit("Enise", "enise@gmail", "google company", "4352");
        krt.put(k1.id, k1);

        System.out.println("krt = " + krt); //{101=isim='Enise', email='enise@gmail', adres='google company', telefon='4352'}

        System.out.println("krt.get(k1.id) = " + krt.get(k1.id)); //krt.get(k1.id) = isim='Enise', email='enise@gmail', adres='google company', telefon='4352'
        System.out.println("krt.get(101) = " + krt.get(101)); //krt.get(101) = isim='Enise', email='enise@gmail', adres='google company', telefon='4352'

    }
}
//        semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}

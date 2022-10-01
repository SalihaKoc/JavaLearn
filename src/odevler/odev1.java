package odevler;

public class odev1 {
    public static void main(String[] args) {
    /* java escape special characters -> https://www.w3schools.com/java/java_strings_specchars.asp
​
	  \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
	          \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
	          \\: prints a back slash :\ (ters slash) yazdırır
	          \': prints single quote :' tek tırnak yazdırır.
	          \": prints double quote :"" Çift tırnak yazdırır.
	 */

        System.out.println("\"Hello\" " +","+ "\"World \\ / \""); //  Soru-1 : konsola "Hello ", "World  \ /"seklinde yazdırınız

        System.out.println("P\nA\nZ\nA\nR\nT\nE\nS\nİ"); // Soru-2 : Pazartesi kelimesini her harfini ayrı bir satira gelecek sekilde yazdırınız.

        System.out.println("\"Java\" ile hayat cok 'afilli'"); //Soru-3 : "Java" ile hayat cok 'afilli' yazdırınız

        System.out.println("\"Başarı\" gayrete \n 'aşıktır'\n\n\n \t \"Clarusway ile java çok kolay...\""); //Soru-4 : "Basari" gayrete 'asiktir'  yazdırınız sonraki "Clarusway ile java cok kolay ..." ifadesi  3 satır sonra ve satır basından 1 tab ileride yazılsın.

        /*
        TASK:
		 * Sadece System.out.println kullanarak bu işlemleri yapınız.
         *    Herhangi bir değişken kullanmayın.
         * 1. Adım : İsim ve Soyismiminizi ekrana yazdırın.
         * 2. Adım : Satır atlayarak boyunuzu ekrana yazdırın.
         * 3. Adım : Satır atlayarak kilonu ekrana yazdırın.
         * 4. Adım : Satır atlayarak hobilerinizi ekrana yazdırın.
​    */
        System.out.println("\nAd Soyad : Saliha Koç \nBoy : 161\nKilo : 65\nHobiler : Film izlemek, kitap okumak, program yazmak" );


    }
}

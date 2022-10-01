package J08_IfStatement_TernaryOperator;

public class C01_ifStatement {

    public static void main(String[] args) {
        {
            int krmYas = 45;
            int ismlYas = 63;

            if (krmYas == ismlYas) {
                System.out.println("Aynı yaştasınız güzel insanlar");
                System.out.println("Yoksa siz ikiz misiniz?");
            }
            if (krmYas >= 40)
                System.out.println("Krm Bey olgunluk yaşındasınız");
          //if blok'ta {} kullanılmazsa ilk ;'a kadar olan komut çalışır veya çalışmaz alt satırdan devam eder

                System.out.println("Bu yazıyı okuduysanız 12.satırdakş if'den bağımsız");


            if (krmYas + ismlYas > 100) {
                System.out.println("Krm Bey ve İsml Bey yaşları toplamı 100'den büyük");
            }
            System.out.println("Selam JavaCanlar");
        }
        //Ctrl+Alt+L --> code reformat java format

        /*
        Bağımsız if statement yapıları sadece kendi scop(kapsamlarını) run eder
        Birden fazla bağımsız if statement yapıları hepsinin body çalışabileceği gibi hiç birisini body de çalışmayabilir
         */

    }
}
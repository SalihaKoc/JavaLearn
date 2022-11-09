package J29_Exceptions;

import javax.lang.model.type.ArrayType;
import java.util.Scanner;

public class C01_ArithmeticException {

    public static void main(String[] args) {

        String str="";
        //str.charAt(2); // RTE-> StrinIndexOfBoundsException
        Scanner scan=new Scanner(System.in);

        System.out.print("birinci sayı giriniz : ");
        int sayi1= scan.nextInt();
        System.out.print("ikinci sayı giriniz : ");
        int sayi2= scan.nextInt();

        int oran; //RTE-> ArithmeticException / by zero

        try { //dene --> hatanın olma ihtimali oldugu code block

            /*
            1. try-catch kullanıldıgında try block hatasız çalışırsa catch block asla calısmaz.
               catch block try block exception hata yakalarsa çalışır.
            2. try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch block tanımlanabilir.
               aynı anda sadece bir catch block çalısabilir, hiç bir catch block çalışmayadabilir.
            3. parent-child ilişkisi olan catchlerde child önce yazılmalı aksi halde CTE
             */
            oran = sayi1 / sayi2;
            System.out.println(oran);
            System.out.println("try block'tan selamlar");

        }catch (ArithmeticException falanFilan){
            System.out.println("bölmede bölen 0 olmaz " + falanFilan.getMessage()); //exception olustugunda sadece hata mesajı print etmek icin getMessage() kullanılır
            falanFilan.printStackTrace(); //olusan exception tum detay bilgisi print etmek icin kullanılır
            System.out.println("cırak catch'den selamlar");
        }
        catch (ArrayIndexOutOfBoundsException arrayExc)
        {
            System.out.println("array'de olmayan eleman istirsen");
        }catch (Exception ebikGabik) { //Exception class tüm exceptionların Hz Ademi parent class -> bad practice
            //hata yakalandıgında yapılacak aksiyonların oldugu block

            //Exception -> olusan hata data type
            //ebikGabik -> javanın olusan exceptiona atayacagı obj name, best practice: e
            System.out.println("sayı 0 a bölünmez");
            System.out.println("catch block'tan selamlar");
        }
        finally { //catch block'lardan sonra istenirse finally block kullanılabilir
            /*
            try-catch içinde yapılan işlemlerden sonra mutlaka calısması gereken block varsa finally tanımlanır.
            hata durumunda catch calısmazsa pr sonlanır. ama finally tanımlanırsa catch calısmasa bile pr akısı devam eder.
            finally block hata olsa da olmasa da calısır.
            cloud database ortamlarında baglantı kesmek icin kullanılır. cloud ile connection yazdıgınızda code basarılı bir
            sekilde calısırsa işlem bittiginde finally block ile connection kapanmazsa maliyet pahalı olur.
             */
            System.out.println("finally block'tan selamlar");
        }
       // catch (ArithmeticException falanFilan) { //child exception
       //
       // }
        System.out.println("sorun handle devamkee"); //programın sonuna kadar calıstıgı mesajı
    }
}

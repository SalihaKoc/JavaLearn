package J11_MethodCreation.methodCreationsTasks;

import java.util.Scanner;

public class Task11_hackerDili {

    public static void main(String[] args) {

    /*Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.
    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */

        Scanner scan=new Scanner(System.in);
        System.out.print("Metin Giriniz : ");
        String metin=scan.nextLine().toLowerCase();
        hackerDili(metin);

    }

    public static void hackerDili(String m) {


         m=  m.replaceAll("s","5");
         m= m.replaceAll("a","4");
         m= m.replaceAll("e","3");
         m= m.replaceAll("i","1");
         m= m.replaceAll("o","0");

        System.out.println("hackerDili ile metin : "+ m);

    }


}
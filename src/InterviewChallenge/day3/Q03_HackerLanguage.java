package InterviewChallenge.day3;

import java.util.Scanner;

public class Q03_HackerLanguage {

    public static void main(String[] args) {

        // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
        //    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
        //    s -> 5
        //    a -> 4
        //    e -> 3
        //    i -> 1
        //    o -> 0
        //    Test data
        //    hackerDili("java ile hersey guzel")
        //    j4v4 1l3 h3r53y guz3l
        //    İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir metin giriniz : ");
        String metin=scan.nextLine();

        hackerDili(metin);
        hackerDili1(metin);

        scan.close();
    }

    private static void hackerDili1(String metin) {

        String arr[] = new String[metin.length()];
        for (int i = 0; i < metin.length(); i++) {
            arr[i]=metin.substring(i,i+1);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < metin.length(); i++) {
            if (arr[i].contains("s")) {arr[i]="5";}
            if (arr[i].contains("a")) {arr[i]="4";}
            if (arr[i].contains("e")) {arr[i]="3";}
            if (arr[i].contains("i")) {arr[i]="1";}
            if (arr[i].contains("o")) {arr[i]="0";}
            System.out.print(arr[i]);
        }

    }
    private static void hackerDili(String metin) {

        System.out.println((metin.replaceAll("s", "5").replaceAll("a", "4").replaceAll("e", "3").replaceAll("i", "1").replaceAll("o", "0")));

    }
}

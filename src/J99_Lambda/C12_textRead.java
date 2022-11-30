package J99_Lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class C12_textRead {

    public static void main(String[] args) throws IOException {

        //Task01 --> readText dosyasını okuyunuz (print ediniz)
        Path read = Path.of("src/J99_Lambda/readText"); //erişilecek dosyanın path'i tanımlandı
        Stream<String> akis = Files.lines(read);
        //Stream<String> akis= Files.lines(Path.of("src/J99_Lambda/readText"));
        akis.forEach(System.out::println); //akıştaki satırlar (lines) print edildi

        //Task02 --> haluk.txt dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle print ediniz.)
        System.out.println("Task02 :");
        Files.lines(Paths.get("src/J99_Lambda/readText")). //erişim verilen path'deki satırlar akısa alındı
        map(String::toUpperCase).forEach(System.out::println);
        //Files.readAllLines(read).stream().map(String::toUpperCase).forEach(System.out::println);

        //TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle print ediniz..
        System.out.println("Task03 :");
        Files.readAllLines(read).stream().
                limit(1). //akıstaki ilk eleman alındı = ilk satır
                //findFirst();
                map(String::toLowerCase).forEach(System.out::println);

        //TASK 04 --> haluk dosyasinda "basari" kelimesinin kac satirda gectiginiz print ediniz.
        System.out.println("Task04 :");
        System.out.println(Files.lines(Paths.get("src/J99_Lambda/readText")).
                map(String::toLowerCase).filter(t -> t.contains("basarı")).count());

        //TASK 05 --> haluk.txt dosyasindaki farkli kelimeleri  print ediniz..
        //TASK 06 --> haluk.txt dosyasindaki tum kelimeleri natural order  print ediniz..
        //TASK 07 --> haluk.txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
        //TASK 08 --> haluk.txt dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
        //TASK 09 --> haluk.txt dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
        //TASK 10 --> haluk.txt dosyasinda kac /farklı harf kullanildigini print ediniz.
        //TASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini print ediniz.
        //TASK 12 --> haluk.txt dosyasinda  farkli kelimeleri print ediniz



    }

}

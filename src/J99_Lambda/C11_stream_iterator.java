package J99_Lambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C11_stream_iterator {

    public static void main(String[] args) {

        System.out.println("Task01 - ameleTopla : " + toplaAmele(10)); //55
        System.out.println("Task01 - toplaCincix : " + toplaCincix(10)); //55
        System.out.println("Task02 - toplaCift() : " + toplaCift(24)); //156
        System.out.println("Task03 - toplaIlkXSayi : " + toplaIlkXCiftSayi(10)); //110
        System.out.println("Task04 - toplaIlkXTekSayi : " + toplaIlkXTekSayi(10)); //100
        ikininilkXKuvvet(7); //2 4 8 16 32 64 128
        System.out.println();
        System.out.println("\"Task08 - istenenSayiXKuvvet : " + istenenSayiXKuvvet(7, 5)); //16807
        System.out.println("\"Task08 - istenenSayiXKuvvet : " + istenenSayiXKuvvet(3, 5)); //243
        System.out.println("\"Task08 - istenenSayiXKuvvet : " + istenenSayiXKuvvet(10, 2)); //100
    }

    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program create ediniz.
    public static int toplaAmele(int x) { //Structured Programming
        int toplam=0;
        for (int i = 0; i<=x ; i++) {
            toplam+=i;
        }
        return toplam;
    }
    public static int toplaCincix(int x) { //Functional Programming
        return IntStream. //manual akış tanımlandı
                range(1,x+1). //1dahil x+1 hariç -> 1,2,3...x int sayılarından aralık tanımlandı
                sum(); //akışa giren 1,2,3...x tam sayıları toplandı
    }
    //range(startInclusive,endExclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endExclusive'e (exclusive) kadar sıralı bir IntStream return eder.
    //rangeClosed(startInclusive,endInclusive);-> 1'lik artımlı bir adımla startInclusive'den (dahil) endInclusive'e (dahil) kadar  sıralı bir IntStream return eder.

    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program create ediniz.
    public static int toplaCift(int x) { //Functional Programming
        return IntStream. //manual akış tanımlandı
                //range(1,x+1). //1dahil x+1 hariç -> 1,2,3...x int sayılarından aralık tanımlandı
                rangeClosed(1,x). //1 ve x dahil -> 1,2,3...x int sayılarından aralık tanımlandı
                filter(C01_LambdaExpression::ciftMi). //akıstaki cift sayılar akısa alındı
                sum(); //akışa giren 1,2,3...x tam sayıları toplandı
    }

    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan code create ediniz.
    public static int toplaIlkXCiftSayi(int x) {
        return IntStream.
                iterate(2,t->t+2). //2'den baslayıp 2 artırılan tekrar işlemi tanımlandı->2,4,6,8....
                limit(x). //akıstaki ilk x eleman akısa alınır
                sum(); //akıstaki x eleman toplandı
    }
    //iterate(seed, repeat action) --> seed'den başlayarak repeat action'a göre  sonsuza kadar elemanları akısa alır.

    //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi  create ediniz.
    public static int toplaIlkXTekSayi(int x) {
        return IntStream.
                iterate(1,t->t+2). //1'den baslayıp 2 artırılan tekrar işlemi tanımlandı->1,3,5...
                        limit(x). //akıstaki ilk x eleman akısa alınır
                        sum(); //akıstaki x eleman toplandı
    }

    //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi  create ediniz.
    public static void ikininilkXKuvvet(int x) {
        IntStream.iterate(2,t->t*2). //2'den baslayıp 2ile carpılarak tekrar islemi tanımlandı
                limit(x).forEach(C01_LambdaExpression::yazdir);
    }

    //TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi  create ediniz.

    //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi  create ediniz.

    //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi  create ediniz.
    public static OptionalInt istenenSayiXKuvvet(int istenenSayi, int x) {
        return IntStream.iterate(istenenSayi,t->t*istenenSayi).limit(x).skip(x-1).findFirst();
    }


}

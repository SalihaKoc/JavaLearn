package odevler;

public class odev2 {

    public static void main(String[] args) {

        //a şıkkı
        int sayi1=20, sayi2=34, cep;
        System.out.println("a şıkkı");
        System.out.println("Swap öncesi değerler :" + (" sayi1="+(sayi1)) + (" sayi2="+(sayi2)));
        cep=sayi1;
        sayi1=sayi2;
        sayi2=cep;
        System.out.println("Swap sonrası değerler :" + (" sayi1="+(sayi1)) + (" sayi2="+(sayi2)));

        //b şıkkı,
        System.out.println("b şıkkı");
        System.out.println("Swap öncesi değerler :" + (" sayi1="+(sayi1)) + (" sayi2="+(sayi2)));
        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("Swap sonrası değerler :" +(" sayi1="+(sayi1)) + (" sayi2="+(sayi2)));


    }
}

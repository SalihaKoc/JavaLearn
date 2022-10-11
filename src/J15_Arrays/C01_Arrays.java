package J15_Arrays;

import java.util.Arrays;

public class C01_Arrays {

    public static void main(String[] args) {

        /*
        Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
        Array olusturulurken 2 seyi declare etmeliyiz:
        1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
        2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
        array= tepsiye benzer..
        Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
        isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
        */
        //Array Tanımlama...
        int a; //declare edilen ama atanmayan primitive data
        int arr [] ; //declare (tanımlanan) edilen ama atanmayan int type array
        //tanımlanan array atama yapılmadan kullanılamaz...

        String isimArr []={"muharrem","enise","cebrail","nazım","özge"}; //hem tanımlama hem atama yapılan Strin Array
        // String [] isimArr1 ={"muharrem","enise","cebrail","nazım","özge"}; //hem tanımlama hem atama yapılan Strin Array

        int sayiArr[]=new int[5]; //java heap memory'de 5 default ->0 olan int array create edildi
                                  // [0,0,0,0,0]

        //Array'e eleman ekleme...
        sayiArr[2]=34;
        sayiArr[0]=35;
        sayiArr[1]=34;
        sayiArr[3]=61;
        sayiArr[0]=34; //0 index array elemanı 34 değeri ile update edildi
                       //array elemanları unique olmak zorunda değildir tekrarlı array elemanı olabilir

        //array eleman sayısı boyut değeri...
        System.out.println("sayiArr.length = " + sayiArr.length); //5

        //array son elemanı
        System.out.println("array son elemanı = " +isimArr [isimArr.length - 1]); //özge
        isimArr[isimArr.length-1]="QA Özge Hanım"; //array son eleman update edildi

        //array'de olmayan elaman

       // okkalı bir TRICK ->> sayiArr[11]=23; //CTE vermez, olmayan elaman RTE verir...-> array run time'de oluşur

        //array elemanları print etme
        for (int i = 0; i <isimArr.length ; i++) {
            System.out.print(isimArr[i]+" ");
        }
        System.out.println();
        System.out.println("isimArr = " + isimArr); //[Ljava.lang.String;@246ae04d -> isimArr'nin referans değeridir
        System.out.println(Arrays.toString(isimArr)); //[muharrem, enise, cebrail, nazım, QA Özge Hanım] -> isimArr'yi stringe çevirdi

        //task -> sayıArr elemanlarından değeri tek olanları print eden code :

        for (int i = 0; i < sayiArr.length-1; i++) {
            if (sayiArr[i]%2!=0){
                System.out.println(sayiArr[i]);
            }
        }

        //task -> sayılar çift index elemanları
        for (int i = 0; i < sayiArr.length; i+=2) {
            //if(i%2==0){
                System.out.println(i +". indexteki sayı : "+sayiArr[i]);
        }

        //task -> isimArr 5 harflı elemanlarından oluşan arrayı print eden code

        String yeniArr[]=new String[isimArr.length]; //isimArr elamanı kadar boş yeni arr
        //int koltukSayisi=0;
        for (int i = 0; i < isimArr.length; i++) {
            if (isimArr[i].length()==5) {
                //koltukSayisi++;
                yeniArr[i]=isimArr[i];
            }
        }
        //System.out.println(koltukSayisi);
        System.out.println(Arrays.toString(yeniArr));

    }
}

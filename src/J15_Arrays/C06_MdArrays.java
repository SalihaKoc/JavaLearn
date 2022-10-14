package J15_Arrays;

import java.util.Arrays;

public class C06_MdArrays {

    public static void main(String[] args) {

        /*
             Çok Boyutlu Diziler
        Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
        Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
        formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
        matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
        satır ve sütun sayısını girmemiz yeterli olacaktır.
        * TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
        Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

       * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer array
       *  icerdeki  array'lere  inner array denir
       * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
       *  Array'i ancak tum elemenlari atanarak declare edilmeli
       * 3- Multi dimensional array'de bir elemanin indexi icin
       *  en distaki array haric, elemania kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
       */

        //MdArray tanımlama...

        int mdArr[][]=new int [3][5]; //3satır-5sütun ->3

        //bir sitede her birine 10 dairelik 8 katlı 6 apt var. Nasıl array tanımlanır

            //TRICK-> Arr'i uzunlukları ile tanımlamak için inner(daire) uzunlukları aynı olmalıdır
        int site[][][]=new int [6][8][10];

        //24 kişilik 3 sınıf ve 21 kişilik 5 sınıfı olan okul nasıl array yapılır

        int sınıf24[][]=new int[3][24]; //24 kişilik 3 sınıf
        int sınıf21[][]=new int[5][21]; //21 kişilik 5 sınıf

        //MdArray eleman ekleme...
        mdArr[2][4]=35; //2.kat 4.daire değeri 35 atandı
        mdArr[0][3]=34; //0.kat 3.daire değeri 34 atandı
        System.out.println(mdArr[0][3]); //34

        //elemanları girilerek Array tanımlama...
        int arr[][]={{1,2,3}, //0.kat
                    {10,20},  //1.kat
                    {101}}    //2.kat
                ; //3katlı apt
        //101 eleman index-> arr[2][0]

        //Array elemanları print etme...

        System.out.println(arr[1]); // [I@19dfb72a -> referansı veriyor !!
        System.out.println(Arrays.toString(arr[1])); // [10, 20]
        System.out.println(arr[1][0]); // 10 -> yalnız değer olduğu için bu şekilde yazdırılabilir

        // Multidimensional array'leri yazdirmak icin toString methodu kullanilamz
        // toString methodu outer methodu Stringe cevirir
        // outer arrayin icinde inner arrayler oldugundan toString methodunda inner array'lerin referans degerlerini yazdirilir

        // MultiDimensional Array'lerde istenen bir eleman nasil yazdirilir.

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr)); // [[I@17c68925, [I@19dfb72a, [I@7e0ea639] -> referansları getirdi
        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr)); // [[1, 2, 3], [10, 20], [101]] -> deep olunca derinlemesine katları getiriyor



    }
}

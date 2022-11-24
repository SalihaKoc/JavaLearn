package J36_Map;

import java.util.Hashtable;

public class C12_HashTable {

    public static void main(String[] args) {

        /*
        HashTable -> HashMap'e kullanılan tüm methodlar hashTable ile call edilir
        1- HashMap ve TreeMap thread-safe ve synchronized olmadığı için Map'ler arasında thread-safe ve synchronize
           olan bir map'e ihtiyaç oldugundan HashTable tanımlanmıştır.
        2- HashTable HashMap'e göre daha yavaştır.
        3- HashTable key ve value'larda null değere izin vermez.
        4- HashTable elaman ataması yapılırken HashMap gibi random(rastgele:hurra) yapar.
         */

        Hashtable <String,String> ht= new Hashtable<>();

        ht.put("kebap","adana");
        ht.put("döner","sivas");
        ht.put("köfte","tekirdağ");
        ht.put("çorba","beyran");
        ht.put("söğüş",""); //{köfte=tekirdağ, söğüş=, çorba=beyran, döner=sivas, kebap=adana}

        System.out.println("ht = " + ht);

        ht.put("döner","dönerse senindir"); //döner key update edilir...

        System.out.println("ht = " + ht); //{köfte=tekirdağ, söğüş=, çorba=beyran, döner=dönerse senindir, kebap=adana}

       //ht.put(null,"trileçe"); //RTE -> NullPointerException
       //ht.put("kahve",null); //RTE -> NullPointerException

        System.out.println("ht = " + ht);

        Hashtable <String,String> ht1= new Hashtable<>();

        ht1.put("salata","patlıcan közleme");
        ht1.put("ara sıcak","içli köfte");
        System.out.println("ht1 = " + ht1);
        ht.putAll(ht1);
        System.out.println("ht = " + ht); //{köfte=tekirdağ, salata=patlıcan közleme, söğüş=, çorba=beyran, döner=dönerse senindir, ara sıcak=içli köfte, kebap=adana}
        System.out.println("ht1 = " + ht1); //{salata=patlıcan közleme, ara sıcak=içli köfte}
    }
}

package J35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {

    public static void main(String[] args) {

    /*
    Queue coll interface oldugu için child class olan LinkedList ve PriorptyQueue ile obj üretilir
    Eczane, yemekhane vs belirli şart ile aksiyon alan elamanlar için kullanılır.
    Cons seçimine göre queue obj özellikleri belirlenir
    FIFO-> first in first out : Coll ilk giren eleman ilk çıkar. Eleman en sona eklenir
     */

        Queue <String> q1=new LinkedList<>(Arrays.asList("Cebrail", "Sümeyra","Yakup","Muharrem"));
        System.out.println("q1 = " + q1); //[Cebrail, Sümeyra, Yakup, Muharrem]
        q1.add("Erol");
        System.out.println("q1 = " + q1); //[Cebrail, Sümeyra, Yakup, Muharrem, Erol]

        Queue <String> q2=new PriorityQueue<>(Arrays.asList("JavaCAN","JavaSU","JavaNAZ","JavİYE"));
        System.out.println("q2 = " + q2); //[JavaCAN, JavaSU, JavaNAZ, JavİYE]
        q2.add("javiDAN");
        System.out.println("q2 = " + q2); //[JavaCAN, JavaSU, JavaNAZ, JavİYE, javiDAN]

        System.out.println("q1.element() = " + q1.element()); //Cebrail

        System.out.println("q1.peek() = " + q1.peek()); //Cebrail

        System.out.println("q1.remove() = " + q1.remove()); //Cebrail

        System.out.println("q1.poll() = " + q1.poll()); //Sümeyra

        //peek() -> copy-paste gib ilk elemanı return eder ama silmez
        //pool() -> cut-paste gibi ilk elemanı siler ve return eder
        //element() -> ilk elemanı silmeden return eder
        //remove() -> ilk elemanı siler ve return eder

        //TRICK : pool ve remove farkı -> eğer queue coll boş ise remove NoSuchElementException
        //pool ise null return eder

        q1.clear(); //q1 elemanları silindi
        System.out.println("q1 = " + q1); //[]
        System.out.println("q1.size() = " + q1.size()); //0
        System.out.println("q1.poll() = " + q1.poll()); //null
       //System.out.println("q1.remove() = " + q1.remove()); //NoSuchElementException

        //offer() -> queue coll eleman eklemek için kullanılır
        System.out.println("q2.offer(\"küşleme\") = " + q2.offer("küşleme")); //true

        //TRICK : offer ve and farkı -> eğer queue coll eleman kısıtlaması yapılmış ise //
        // add meth Exception fırlatır, offer ise true/false döndürür


    }
}

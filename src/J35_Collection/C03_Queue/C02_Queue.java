package J35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Queue {

    public static void main(String[] args) {

        /*
        Dequeue : Double Ended Queue -> Queue'larda FIFO Deque'lerde hem FIFO hem de LIFO geçerli
        LIFO:Last in First Out
         */

        Deque <String> dq1=new LinkedList<>(Arrays.asList("Küşleme","Önkol","Böbrek Yatağı","Ezme","Haydariye"));
        System.out.println("dq1 = " + dq1); //[Küşleme, Önkol, Böbrek Yatağı, Ezme, Haydariye]
        dq1.add("Humus");
        System.out.println("dq1 = " + dq1); //[Küşleme, Önkol, Böbrek Yatağı, Ezme, Haydariye, Humus]

        System.out.println("dq1.getFirst() = " + dq1.getFirst()); //Küşleme
        System.out.println("dq1 = " + dq1); //[Küşleme, Önkol, Böbrek Yatağı, Ezme, Haydariye, Humus]

        System.out.println("dq1.getLast() = " + dq1.getLast()); //Humus
        System.out.println("dq1 = " + dq1); //[Küşleme, Önkol, Böbrek Yatağı, Ezme, Haydariye, Humus]

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst()); //Küşleme
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.peekLast() = " + dq1.peekLast()); //Humus
        System.out.println("dq1 = " + dq1);

        /*
        TRICK : getFirst() meth deque coll boş ise NoSuchElementException firlatır
                peekFirst() meth deque boş ise null return eder
         */

        dq1.clear();
        System.out.println("dq1 = " + dq1); //[]
        System.out.println("dq1.peekFirst() = " + dq1.peekFirst()); //null
        //System.out.println("dq1.getFirst() = " + dq1.getFirst()); //RTE : NoSuchElementException
        //System.out.println("selametle app run oldu Devamke");
        Deque <String> dq2=new LinkedList<>(Arrays.asList("havuç dilimi","sütlaç","güllaç","kazandibi"));

        System.out.println("dq2.pollFirst() = " + dq2.pollFirst()); //havuç dilimi
        System.out.println("dq2.pollLast() = " + dq2.pollLast()); //kazandibi
        System.out.println("dq2.removeFirst() = " + dq2.removeFirst()); //sütlaç
        System.out.println("dq2.removeLast() = " + dq2.removeLast()); //güllaç
        System.out.println("selametle app run oldu Devamke");

        //bosalan dequeue'de :
        System.out.println("dq2.pollLast() = " + dq2.pollLast()); //null
        System.out.println("dq2.removeFirst() = " + dq2.removeFirst()); //NoSuchElementException

        /*
        TRICK : offer ve add farkı -> eğer
         */
    }
}

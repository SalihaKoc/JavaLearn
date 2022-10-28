package J21_ImmutableClass;

import java.util.ArrayList;

public class C06_OCA_ImmutableClass {

    public static void main(String[] args) {

        ArrayList<Integer> values =new ArrayList<>();
        System.out.println("method öncesi values = " + values);
        values.add(4);
        values.add(5);
        values.set(1,6);
        values.remove(0);

        for (Integer v: values) {
            System.out.println("method sonrası values = " + values); //arrayList mutable
        }
    }
}

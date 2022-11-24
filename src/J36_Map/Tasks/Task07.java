package J36_Map.Tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task07 {

    /*
    returnKey() isminde bir method oluşturun.
    Parametresi     String-Integer HashMap olsun.
    Return tipi Array List olsun.
    Hashmap:
                       "Lion",     1
                       "Tiger",    2
                       "Elephant", 3
                       "Cat",      4
                       "Dog",      5
    Tüm ANAHTARLARI(Keys) for döngüsü ile döndürün.
     */

    public static void main(String[] args) {

        HashMap<String, Integer> animal = new HashMap<>();
        animal.put("Lion", 1);
        animal.put("Tiger", 2);
        animal.put("Elephant", 3);
        animal.put("Cat", 4);
        animal.put("Dog", 5);

        System.out.println("returnKey(animal) = " + returnKey(animal));

    }

    private static ArrayList<String> returnKey(HashMap<String, Integer> animal) {

        List<String> keys = new ArrayList<>();

        for (String i : animal.keySet()) {
            keys.add(i);
        }
        return (ArrayList<String>) keys;

    }

}
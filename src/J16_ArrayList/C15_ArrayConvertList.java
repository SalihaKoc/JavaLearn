package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;

public class C15_ArrayConvertList {

    public static void main(String[] args) {

        //King of TRICK -> Array'den çevrilen list Array kaynaklı olduğu için array davranışı gösterir, boyut sabittir.
        //Dolayısıyla remove, add method çalışmaz

        String arrJavaCan[]={"Akif","Gamze","Musty","Sevdenur"};

        List<String> listJavatar= Arrays.asList(arrJavaCan); //arrJavaCan değerleri list eleman olarak atandı

        System.out.println("listJavatar = " + listJavatar);

        System.out.println("listJavatar.size() = " + listJavatar.size());

        //listJavatar.add("sefilCan Haluk"); //array'e eleman eklenmeeezzz
                                             //RTE : UnsupportedOperationException

        // listJavatar.clear(); //RTE : UnsupportedOperationException

        //Kral Trick -> list data type ArrayList tanımlanırsa RTE vermez, kaynağı array de olsa list davranır boyut esnekliği yapar

        ArrayList<String> listJavatar1=new ArrayList<>(Arrays.asList(arrJavaCan));
        listJavatar1.add("Haluk");
        System.out.println("listJavatar1 = " + listJavatar1); //[Akif, Gamze, Musty, Sevdenur, Haluk]

    }
}

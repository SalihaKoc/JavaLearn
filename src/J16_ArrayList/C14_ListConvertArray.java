package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C14_ListConvertArray {

    public static void main(String[] args) {

        //list'i array'e çevirme-> toArray();

        //1.yöntem-> toArray(); parametre olarak String[0] alarak yapılır

        ArrayList<String> listUlke=new ArrayList<>(List.of("Almanya","Amerika","İngiltere","İsveç"));

        String arrUlke[]=listUlke.toArray(new String[0]); //ulkeList'i elemanları arrUlke olarak atandı

        System.out.println("listUlke = "+listUlke);
        System.out.println("arrUlke =  " + Arrays.toString(arrUlke));

        //2.yöntem-> oluşturulan array'in data type'i Object olarak atanır
        //TRICK-> Object class javada tüm classların parent'i (atasıdır)
        //Object class javada parent'i olmayan tek class'tır (tüm vagonları çeken ama çekilemez lokomotif)
        //String Integer Class'lar Object Class child'i olduğu için istenen durumlarda data type olarak object class kullanılabilir

        Object arrUlkeler[]=listUlke.toArray();
        System.out.println("arrUlkeler = "+Arrays.toString(arrUlkeler));

    }
}

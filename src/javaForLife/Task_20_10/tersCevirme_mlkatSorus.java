package javaForLife.Task_20_10;

import java.util.*;

public class tersCevirme_mlkatSorus {

    //Girilen String'i ArrayList kullanarak ters ceviriniz.

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("string bir değer giriniz : ");
        String metin= scan.nextLine();

        ArrayList<String> list = new ArrayList<>(List.of(metin.split("")));
        System.out.println(list);
        //  for (int i = metinList.size()-1; i >=0 ; i--) {
        //      System.out.print(metinList.get(i));
        //  }

        Collections.reverse(list);
        String arr[] = list.toArray(new String[0]); //arr adında arr oluşturulup ArrayList, Array yapıldı
        String str2 = Arrays.toString(arr); //Array de String ifadeye çevrildi
        System.out.println(str2.replaceAll("\\W", ""));//Str deki harf hariç geri kalan karakterler atıldı ([ , ] , ve virgül kaldırıldı)

    scan.close();
    }
}

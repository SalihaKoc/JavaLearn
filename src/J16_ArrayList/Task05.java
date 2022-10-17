package J16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task05 {

    public static void main(String[] args) {

        /*TASK :
    2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
    listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
    Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

     */
        String isimArr[][]={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};

        yeniList(isimArr);

    }

    private static ArrayList <String> yeniList(String[][] isimArr) {

        ArrayList <String> bosList=new ArrayList<>(); //boş liste

        for (int i = 0; i < isimArr.length; i++) {
            for (int j = 0; j < isimArr[i].length; j++) {
                bosList.add(isimArr[i][j]); //her katın her dairesindeki eleman döngü ile alınıp boş liste atandı
            }
        }
        System.out.println("sıralama öncesi : " +bosList);

        Collections.sort(bosList);

        System.out.println("sıralama sonrası : " +bosList);

        return bosList;
    }
}

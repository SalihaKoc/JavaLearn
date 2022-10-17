package J16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task07 {

    public static void main(String[] args) {

        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */


        List<String> isimList=new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));

        String str3=isimList.get(2); //listteki 3.eleman 2.index ile str'ye atandı

        String str8=isimList.get(7); //listteki 8.eleman 7.index ile str'ye atandı

        System.out.println("isimList = " + isimList);

        isimList.set(2,str8); //3.eleman 2.index str8 ile update edildi
        isimList.set(7,str3); //8.eleman 7.index str3 ile update edildi
        System.out.println("isimList = " + isimList);

        /*
        String temp=str.get(2);
        str.set(2,str.get(7));
        str.set(7,temp);
         */
    }
}

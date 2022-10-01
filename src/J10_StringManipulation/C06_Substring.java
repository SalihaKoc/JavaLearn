package J10_StringManipulation;

import java.util.Scanner;

public class C06_Substring {

    public static void main(String[] args) {

        /*
        substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> eclusive/haric
         */

        String str="Java bilen sırtı yere gelmez :) ";

        System.out.println(str.substring(10)); //  sırtı yere gelmez :)

        //str datasının son 10 karakterini print eden code..

        System.out.println(str.substring(str.length() - 10)); //gelmez :)

        //str datasının ilk 10 karakterini print eden code.. // Java bilen

        System.out.println(str.substring(0, 10));

        //str datasının ilk karakterini print eden code.. // J

        System.out.println(str.substring(0, 1));

        //girilen 4 harfli kelimeyi tersten primnt eden code

        Scanner scan= new Scanner((System.in));
        System.out.println("4 harfli kelime girin : ");
        String str1=scan.next();

        for(int i=str1.length()-1;i>=0;i--) //i'yi kelime uzunluğunun bir eksiği kadar tanımlıyoruz başlangıç değeri olarak.
        {
            System.out.print(str1.charAt(i));
        }

        //if (str1.length()!=4) {
       //    System.out.println("4 harfli kelime istedik !!!");
       //}
       //else {
       //    System.out.print(str1.substring(str1.length() - 1));
       //    System.out.print(str1.substring(2,3));
       //    System.out.print(str1.substring(1,2));
       //    System.out.print(str1.substring(0,1));

       //}


    }
}

package J23_Varargs_StringBuilder.Varargs.StringBuilder;

import javax.sound.midi.Soundbank;

public class C02_StringBuilder {

    public static void main(String[] args) {

        // StringBuilder obj create etme...
        // 1. yol
        StringBuilder sb1=new StringBuilder();// default capacity 16 bit olan value'su olmayan  bos sb

        System.out.println("sb1.length() = " + sb1.length());//0 -> length(): sb 'deki karakter sayısı return eder

        System.out.println("sb1.capacity() = " + sb1.capacity());//16

        sb1.append("jAVATAR");//javatar sb1' eklendi
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//16

        sb1.append(" selam ").append("olsun").append(" ").append(24).append(" ").append(true);
        System.out.println("sb1 = " + sb1);// jAVATAR selam olsun24true
        System.out.println("sb1.capacity() = " + sb1.capacity());//34 -> capcity aşma durumunda yeni capacity : eski capacity * 2 + 2  -> 16*2+2 = 34 değeri atanır

        sb1.append(" basarı gayrete asıktır :)");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//70 -> capcity aşma durumunda yeni capacity : eski capacity * 2 + 2  -> 34*2+2 =70 değeri atanır

        //2.yol

        StringBuilder sb2= new StringBuilder("Kevser Hanıma selamlar");
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity());

        // trimToSize() -> fazladan ayrılan capacity silinir
        System.out.println("sb2.length() = "+sb2.length());
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity());

        //3.yol
        StringBuilder sb3= new StringBuilder(11);
        System.out.println("sb3.length() = " + sb3.length());
        System.out.println("sb3.capacity() = " + sb3.capacity());
        sb3.append("Ebubekir Bey");
        System.out.println("sb3.capacity() = " + sb3.capacity());

        //istenen bir karakter index'i alma
        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));

        //belirli aralıktaki karakterleri alma
        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13));
        //System.out.println("sb1.subSequence(17) = " + sb1.subSequence(17)); derlemiyor
        System.out.println("sb1.substring(17) = " + sb1.substring(17));
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13));

        //belirli bir index'deki karakteri silmek
        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3)); //3.index silindi
        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7)); //3,4,5,6. indexdekiler siliniyor

        //istenen karakter veya karakterler eklemek
        System.out.println("sb3.insert(4,\":)\") = " + sb3.insert(4, ":)")); //Ebub:)ekir Bey
        String s="güzel insan";
        //System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s)); //Ebub:)ekigüzel insanr Bey
        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7)); //Eel ibub:)ekir Bey -> sb3 value'sini 1.indexine s value'sinin 3 ve 7.indexlerine
        StringBuilder sb4= new StringBuilder("Nihan hanım");
        System.out.println("sb4.insert(5,\"Qa team lead\",0,2) = " + sb4.insert(5, "Qa team lead", 0, 2)); //NihanQa hanım

        //istenen index'deki karakteri değiştirme
        sb4.setCharAt(6,'A');
        sb4.setCharAt(sb4.indexOf(" "),':');
        System.out.println("sb4 = " + sb4); //NihanQA:hanım
        System.out.println("sb4.insert(6,\" \") = " + sb4.insert(5, " ")); //Nihan QA:hanım

        //istenen index karakter yerine birden çok karakter eklemek
        System.out.println("sb4.replace(8,10,\"hi\") = " + sb4.replace(8, 10, "hi"));

        //Sb obj String'e cevirmek -> toString()
        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase()); //sb3 stringe cevrilerek toUpperCase method calıstı

        //String ile StringBuilder karsilastirmasi
        /*
        Compare iki sb'i esit mi diye kontrol etmek icin ilk harften baslayarak tum karakterleri karsilastirir
        Ayni olan karakterler icin bir sey return etmezken farkli olan ilk karakter icin ascii tablosuna gore kac deger
        geride veya ileride oldugunu print eder
        Tamamen ayni ise bize 0 return eder

        bir sb ile bir String'i compare etmek istersek Java CTE verir
         */
        StringBuilder sb5=new StringBuilder("javaCAN");
        StringBuilder sb6=new StringBuilder("javaCAN");
        String str1="javaCAN";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6)); //0
       // sb6.compareTo(str1); //CTE
        System.out.println("sb6.compareTo(str1) = " + sb6.compareTo(new StringBuilder(str1)));

        System.out.println("sb6.equals(sb5) = " + sb6.equals(sb5)); //false -> SB equals == gibi çalışır hem value hem referans bakar
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6)); //true

        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString())); //true

    }
}

package J11_MethodCreation.methodCreationsTasks;

import java.util.Scanner;

public class Task12_mailKontrol {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
        Scanner scan=new Scanner (System.in);
        System.out.println("Mail adresi giriniz : ");
        String mail=scan.nextLine();

        System.out.println(mailKontrol(mail));


    }
    public static boolean mailKontrol(String m) {

        boolean dogruMu;
        if (m.contains("@") && m.contains(".")&& (m.indexOf("@")>0 )) {
            dogruMu=true;
        } else dogruMu=false;
        return dogruMu;
        }

    }

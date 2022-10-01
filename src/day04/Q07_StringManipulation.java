package day04;

import java.util.Scanner;

public class Q07_StringManipulation {

    public static void main(String[] args) {

        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String s= sc.next().toLowerCase();

        if (s.contains("xyz")) {

            System.out.println("true");
        }
        else System.out.println("false");

       //boolean xyziceriyormu=false;
       //if (s.contains("xyz")) xyziceriyormu=true;
       //    System.out.println(xyziceriyormu);
       //}   else xyziceriyormu=false;
       //System.out.println(xyziceriyormu);

    }
}

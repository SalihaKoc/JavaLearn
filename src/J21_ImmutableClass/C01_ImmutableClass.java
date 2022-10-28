package J21_ImmutableClass;

public class C01_ImmutableClass {

    public static void main(String[] args) {

        String str1="murat"; // ilk değeri murat atanan str1 variable
        String str2="murat"; // str1 ve str2 aynı ilk değere sahip oldugu için String havuzunda ortak referans atanır

        String str3= new String("murat"); // değerleri aynı referans farklı obj
        String str4= new String("murat"); // değerleri aynı referans farklı obj

        String str5=str1+"";

        System.out.println("str1==str2 = " + (str1 == str2)); //true
        System.out.println("str1==str3 = " + (str1 == str3)); //false
        System.out.println("str1.equals(str2) = " + str1.equals(str2)); //true
        System.out.println("str3==str4 = " + (str3 == str4)); //false
        System.out.println("str1==str5 = " + (str1 == str5)); //false
        System.out.println("str1.equals(str5) = " + str1.equals(str5)); //true

    }
}

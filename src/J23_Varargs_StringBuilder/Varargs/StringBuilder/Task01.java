package J23_Varargs_StringBuilder.Varargs.StringBuilder;

public class Task01 {

    public static void main(String[] args) {

        /*
        Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir method yazın.
        (without case sensitivity)
        Eg : input : I love Java
        Output: "Reversed sentence : avaJ evol I
        It is not a palindrome"
         */
        System.out.println("tersString(\"ece\") = " + tersString("ece"));// ece
        System.out.println("tersString(\"serhat\") = " + tersString("serhat"));// tahres
        StringBuilder sb1= new StringBuilder("ali");

        tersSB(sb1);
        tersSB(new StringBuilder("serhat"));
        System.out.println("isPalindrom(\"ey edip adanada pide ye\") = " + isPalindrom("ey edip adanada pide ye")); //true
        System.out.println("isPalindrom(\"nazım bey\") = " + isPalindrom("nazım bey")); //false
    }

    private static void tersSB(StringBuilder sb1) {
        System.out.println("sb1.reverse() = " + sb1.reverse());
    }

    public static String tersString(String str) {
        String tersStr="";
        for (int i = str.length()-1; i >=0; i--) {
            tersStr+=str.charAt(i);
        }
        return tersStr;
    }

    public static boolean isPalindrom(String str) {
        if (str==null) {
            return false;
        }
        return new StringBuilder(str).reverse().toString().equals(str);
    }

}

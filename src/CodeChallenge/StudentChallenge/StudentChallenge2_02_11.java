package CodeChallenge.StudentChallenge;

public class StudentChallenge2_02_11 {

    public static void main(String[] args) {

        /*
        Bir Stringde ilk uniq karakteri bulup return eden method create ediniz.
        Ex:
        String str1="AAABBBCCCDEF";
        String uniqf="D";
         */
        String str1="AAABBBCCCDEF";
        System.out.println("uniq(str1) = " + uniq(str1));

    }

    public static String uniq(String str1) {
        String uniqbos="";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.indexOf(str1.charAt(i))==str1.lastIndexOf(str1.charAt(i))){
                uniqbos=String.valueOf(str1.charAt(i)); break;
            }
        }
        return uniqbos.length()==0 ? "Stringinizde uniq karakter bulunmamaktadır" : uniqbos;
    }
}

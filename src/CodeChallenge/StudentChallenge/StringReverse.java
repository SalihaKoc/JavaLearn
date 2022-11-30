package CodeChallenge.StudentChallenge;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverse {

    public static void main(String[] args) {

        String str= "javaCAN & JAVATAR";

        forLastIndex(str);
        forFirstIndex(str);
        whileSubstring(str);
        stringBuilder(str);
        stringBuffer(str);
        stringArrayIle(str);
        charArray(str);
        byteArray(str);
        arrayList(str);
        recursion(str);
        stack(str);
        lambda(str);
        unicodeRLO(str);
    }

    private static void unicodeRLO(String str) {
        System.out.println("Unicode RightToLeft Override ile : " + "\u202E" + str);
    }

    private static void lambda(String str) {
        System.out.println("Lambda ile : " + Stream.of(str).map(t -> t.split("")).flatMap(Arrays::stream).reduce("", (s, c) -> c + s));
        System.out.println("Lambda ile : " + str.chars().mapToObj(ch -> Character.toString(ch)).reduce("", (s, c) -> c + s));
        System.out.println("Lambda ile : " + str.chars().mapToObj(Character::toString).reduce("", (s, c) -> c + s));
        System.out.println("Lambda ile : " + Stream.of(str).map(t -> new StringBuilder(t).reverse()).collect(Collectors.joining()));
    }

    private static void stack(String str) {
        Stack <Character> stack=new Stack<Character>();
        char[] ch=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            stack.push(ch[i]);
        }
        int i=0;
        while(!stack.isEmpty()) {
            ch[i++]=stack.pop();
        }
        System.out.println("Stack ile : "+ String.copyValueOf(ch));
        System.out.println("Stack ile : "+ new String(ch));
    }

    private static void recursion(String str) {
        if (!str.isEmpty()) {
        System.out.print(str.charAt(str.length()-1));
        recursion(str.substring(0,str.length()-1));
        }else System.out.println();
    }

    private static void arrayList(String str) {
        ArrayList<String> list=new ArrayList<>(List.of(str.split("")));
        Collections.reverse(list);
        System.out.println("ArrayList ile : " + list);
        String[] array= list.toArray(list.toArray(new String[0]));
        System.out.println("ArrayList ile : " + String.join("",array));
        System.out.println("ArrayList ile : " + String.join("!",array));
    }

    private static void byteArray(String str) {
        byte[] bytes= str.getBytes();
        System.out.println("str'nin son hali = " + Arrays.toString(bytes));
        for (int l = 0, r = str.length()-1; l<r; l++, r--) {
            byte temp=bytes[l];
            bytes[l]=bytes[r];
            bytes[r]=temp;
        }
        System.out.println("Byte Array ile : " + new String(bytes));
    }

    private static void charArray(String str) {
        char[] charArray=str.toCharArray();
        System.out.print("Char Array ile : ");
        for (int i = charArray.length-1; i>=0 ; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();
    }

    private static void stringArrayIle(String str) {
        String[] strArray=str.split("");
        System.out.print("String Array ile : ");
        for (int i = strArray.length-1; i >=0; i--) {
            System.out.print(strArray[i]);
        }
        System.out.println(); //dummy
    }

    private static void stringBuffer(String str) {
        StringBuffer sb = new StringBuffer(str);
        System.out.println("StringBuffer ile : " + sb.reverse());
    }

    private static void stringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println("StringBuilder ile : " + sb.reverse());
    }

    private static void whileSubstring(String str) {
        String s5="";
        while (str.length()>0) {
            s5+=str.charAt(str.length()-1);
            str=str.substring(0,str.length()-1);
        }
        System.out.println("While Substring ile : " + s5);
    }

    private static void forFirstIndex(String str) {
        String s3="";
        String s4="";
        for (int i = 0; i < str.length(); i++) {
            s3=str.charAt(i)+s3;
            s4=str.substring(i,i+1)+s4;
        }
        System.out.println("For Loop First Index CharAt ile : "+ s3);
        System.out.println("For Loop First Index Substring ile : "+ s4);
    }

    private static void forLastIndex(String str) {
        String s1="";
        String s2="";
        for (int i =str.length()-1; i >=0; i--) {
            s1+=str.charAt(i);
            s2+=str.substring(i,i+1);
        }
        System.out.println("For Loop Last Index CharAt ile : "+ s1);
        System.out.println("For Loop Last Index Substring ile : "+ s2);
    }

}

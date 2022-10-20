package javaForLife.staticKeyword;

public class Student1 {

    static int a;
    int b;

    public Student1(){
        a+=3;
        b++;
    }
    public static int kareAl() {

        return a*a;
    }

    public static void main(String[] args) {

        Student1 s1=new Student1();
        Student1 s2=new Student1();
        System.out.println(s1.a);
        System.out.println(s2.b);
        int c=s1.kareAl();
        System.out.println("-a "+c+" -b "+s2.b);
    }
}


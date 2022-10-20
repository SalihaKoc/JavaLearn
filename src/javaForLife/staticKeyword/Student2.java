package javaForLife.staticKeyword;

public class Student2 {
    int id;

    public Student2() {
        id++;
        System.out.println(id);
    }

    public static void main(String[] args) {

        Student2 s1= new Student2();
        Student2 s2=new Student2();
    }
}


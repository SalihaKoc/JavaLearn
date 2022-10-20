package javaForLife.staticKeyword;

public class Student3 {

    int id;
    String name;
    static String bootcamp="Clarusway";

    public Student3 (int id,String name,String bootcamp) {
        this.id=id;
        this.name=name;
        this.bootcamp=bootcamp;
    }

    public static void main(String[] args) {

        Student3 s1=new Student3(101,"Hardy","developer");
        Student3 s2=new Student3(102,"Ashley","qa");

        System.out.println(s1.id);
        System.out.println(s2.id);

        System.out.println(s1.name);
        System.out.println(s2.name);

        System.out.println(s1.bootcamp);
        System.out.println(s2.bootcamp);
    }
}

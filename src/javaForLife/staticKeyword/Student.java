package javaForLife.staticKeyword;

public class Student {

    int studentNo;
    static int studentId;
    public Student() {
        this.studentNo++;
        studentId++;
    }
    public static int idVer(){
        return studentId;
    }
    public int noVEr() {

        return studentNo;
    }
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();
        Student s5=new Student();
        System.out.println("s5.noVEr() = " + s5.noVEr());
        System.out.println("s5.idVer() = " + s5.idVer());
    }
}

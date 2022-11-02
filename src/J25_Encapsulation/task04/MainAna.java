package J25_Encapsulation.task04;

import java.util.Scanner;

public class MainAna {
    /*
    Burada iki adet class vardır. Biri Main, diğeri ise student ,
    student classı içinde;
    String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz.

    Main classın içinde;
    girilen değerleri aşagıdaki gibi print eden code create ediniz
    Örnek:
    age 12'dir.
    name Steven'dır.

    name(isim) olarak;
    "Student name is Steven"
    ve
    age(yaş) olarak da;
    "He is 12 years old"
 */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Adınızı giriniz : ");
        String ad=scan.nextLine();
        System.out.print("Yaşınızı giriniz : ");
        int yas=scan.nextInt();

        Student s1=new Student(ad,yas);
        System.out.println("Student name is "+s1.getName()+"\nHe is "+s1.getAge()+" years old");


    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

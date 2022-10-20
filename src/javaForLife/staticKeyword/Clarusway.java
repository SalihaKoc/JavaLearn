package javaForLife.staticKeyword;

public class Clarusway {

    int age;
    static int id;

    Clarusway(int i) {
        id+=i;
        age+=i;

    }

    public static void main(String[] args) {

        new Clarusway(33);

        Clarusway hardy =new Clarusway(48);

        System.out.println("hardy.age = " + hardy.age +" hardy.id "+hardy.id);  //age static olmadığı için erişemiyor

    }

}

package J26_Inheritance.task02;

public class SubClass extends SuperClass {

    public static void main(String[] args) {

        SubClass obj=new SubClass();
        obj.myMethod();
    }
    int num=10;
    public void goster() {
        System.out.println("Bu method Sub classsın görüntülenme methodudur. ");
    }

    public void myMethod() {

        goster(); //subClass call
        super.goster(); //superClass call
        System.out.println("subClass num= "+ num);
        System.out.println("superClass num= "+ super.num);

    }
}

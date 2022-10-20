package javaForLife.staticKeyword;

public class StaticBlocks {

    static  int id;

    static {
        System.out.println("2.static block");
        id=102;
    }

    static {
        System.out.println("1.static block");
        id=101;
    }
    public StaticBlocks(){
        System.out.println("constructor");
        System.out.println(++id);
    }

    public static void main(String[] args) {

        System.out.println("main başladı");
        System.out.println(++id);
        StaticBlocks s1= new StaticBlocks();
        System.out.println("main bitti");
    }
}

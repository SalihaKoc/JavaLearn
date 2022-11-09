package javaForLife.InterviewQuestion;

public class q16_swap {

    // Swap two variable values without using a third variable

    public static void main(String[] args) {

        int a=10;
        int b=20;

       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("a = " + a);
       System.out.println("b = " + b);

       // a=a+b-(b=a);
       // System.out.println("a = " + a);
       // System.out.println("b = " + b);

    }

}

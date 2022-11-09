package javaForLife.InterviewQuestion;

public class q15_finra {

    /*
    Write a method which prints out the members from 1 to 30 but
    for numbers which are a multiple of 3, print "FIN" instead of the number and
    for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number
    */

    public static void main(String[] args) {

        for (int i = 1; i <=30 ; i++) {
            if((i%15)==0) {
                System.out.println("FINRA");
            } else if (i%3==0) {
                System.out.println("FIN");
            } else if ((i%5==0)) {
            System.out.println("RA");
            }else System.out.println(i);
        }

        /*
        for (int i = 1; i <=30 ; i++) {
            if(i%3==0 || i%5==0) {
             if (i%3==0)
                System.out.print("FIN");
             if ((i%5==0))
                System.out.print("RA");
                System.out.println();
            } else System.out.println(i);
        }
         */

    }
}

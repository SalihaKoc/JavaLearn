package CodeChallenge.day05;

public class Q03_ForLoop {

    public static void main(String[] args) {

        //Convert "Java" to "J*a*v*a*"
        /* ForLoop
         print even numbers from 100 to 0 but do not use decrement(i--).

        INPUT      :
        OUTPUT  : 100 98 96 94 92 ....2 0
         */

        String metin="Java";
        for (int i=0; i<=metin.length()-1; i++) {
            System.out.print(metin.charAt(i)+"*");
        }
        System.out.println();

        for (int i=100; i>=0; i-=2) {
            System.out.print(i+" " );
        }

    }
}

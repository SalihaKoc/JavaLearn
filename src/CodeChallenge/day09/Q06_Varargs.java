package CodeChallenge.day09;

public class Q06_Varargs {

    public static void main(String[] args) {

        // Create a multiply method with double varargs (return double)

        multiplyAll(1.2, 2.1, 3.7, 4.3, 5.5, 6.6, 7.7, 8.7, 9.1, 10.2);
    }


    public static double multiplyAll(double... sayi) {
        double carpim = 1;
        for (double each : sayi) {
            carpim *= each;
        }
        System.out.println("carpim = " + carpim);
        return carpim;
    }
}
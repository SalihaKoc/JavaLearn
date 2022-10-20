package CodeChallenge.day08;

public class Q01_Arrays {

    public static void main(String[] args) {

    //Type a method to check if an int Array is symmetrical or not.

        int sayi[]= {1,2,3,3,2,1,0};

        System.out.println("simetrikMi(sayi) = " + simetrikMi(sayi));

    }
    private static boolean simetrikMi(int[] sayi) {

        boolean flag=false;
        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] == sayi[sayi.length - 1 - i]) {
                flag = true;
            } else flag =false;
              break;
        }
        return flag;

    }
}

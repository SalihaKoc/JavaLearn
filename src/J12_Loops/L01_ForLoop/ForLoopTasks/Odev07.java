package J12_Loops.L01_ForLoop.ForLoopTasks;

public class Odev07 {

    public static void main(String[] args) {

//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15

        int satir = 5;
        for (int i = 1; i <= satir; i++) {
            int say = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(say + " ");
                say = say + satir - j;
            }
            System.out.println();
        }
    }
}

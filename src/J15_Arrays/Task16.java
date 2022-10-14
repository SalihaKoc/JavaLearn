package J15_Arrays;

public class Task16 {

    public static void main(String[] args) {

        //task-> sayı arr'deki son elemanların çarpımını

        int sayi[][]={{1,2,3},{9,8},{24,0,4}};

        int carpim=1;
        for (int i = 0; i < sayi.length; i++) {

                carpim *= sayi[i][sayi[i].length - 1];

            }
        System.out.println("arr'de satırlardaki son elemanların çarpımı = "+ carpim); //3+8+4 = 96
        }

    }
package J15_Arrays;

public class Task15 {

    public static void main(String[] args) {

       // task-> arr tüm elamanlarının çarpımın yazınız

        int sayi[][]={{1,2,3},{9,8}};

        int carpim=1;
        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
                carpim*=sayi[i][j];
            }
        }
        System.out.println("arr'deki sayıların çarpımı : "+carpim);
    }
}

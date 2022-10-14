package J15_Arrays;

public class Task17 {

    public static void main(String[] args) {

        //task-> sayı arr'deki en büyük elemanı print eden code

        int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};

        int max=0; //int max=sayi[0][2]; -> meselam 3 atanabilir vs

        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
               if (sayi[i][j]>max) {
                   max=sayi[i][j];
                }
            }
        }
        System.out.println("arr'deki en büyük sayı : "+ max);

        //task-> sayı arr'deki en küçük elemanı print eden code

        int min=0;

        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
                if (sayi[i][j]<min) {
                    min=sayi[i][j];
                }
            }
        }
        System.out.println("arr'deki en küçük sayı : "+ min);
    }
}

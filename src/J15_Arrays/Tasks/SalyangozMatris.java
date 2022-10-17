package J15_Arrays.Tasks;

import java.util.Scanner;

public class SalyangozMatris {

    public static void main(String[] args) {

        /* Task-> girilen değere göre  salyangoz matris  create eden code create ediniz
        input :3
        output:
                1       2       3
                8       9       4
                7       6       5

         input :4
         output :
                1       2       3       4
                12      13      14      5
                11      16      15      6
                10      9       8       7
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("boyut değeri giriniz : ");
        int boyut= scan.nextInt();

        int matris[][]=new int[boyut][boyut];

        int xDuzlem=0, yDuzlem=0, toplam=1;
        boolean artis=true;

        for (int i = 0; i < boyut; i++) {
            matris[xDuzlem][yDuzlem]=toplam;
            if (artis) {
                while (xDuzlem + 1 < boyut && matris[xDuzlem + 1][yDuzlem] == 0)

                    matris[++xDuzlem][yDuzlem] = ++toplam;
                while (xDuzlem + 1 < boyut && matris[xDuzlem][yDuzlem + 1] == 0)
                    matris[xDuzlem][++yDuzlem] = ++toplam;
                         }
                else {
                while (xDuzlem > 0 && matris[xDuzlem - 1][yDuzlem] == 0)
                    matris[--xDuzlem][yDuzlem] = ++toplam;

                while (yDuzlem > 0 && matris[xDuzlem][yDuzlem - 1] == 0)
                    matris[xDuzlem][--yDuzlem] = ++toplam;
            }
                         artis= !artis;
        }
                for (int satir = 0; satir < boyut; satir++){
            for (int sutun = 0; sutun < boyut; sutun++)

              System.out.print(matris[sutun][satir] + "\t");
                    System.out.println();
        }
        }
    }

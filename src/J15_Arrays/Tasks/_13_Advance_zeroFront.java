package J15_Arrays.Tasks;

import javax.accessibility.AccessibleAction;
import java.util.Arrays;
import java.util.Scanner;

public class _13_Advance_zeroFront {

    public static void main(String[] args) {

      /*
   Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

   Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1

       */
        //int sayi[]={1,0,0,1,0};

        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç boyutlu array istersiniz : ");
        int boyut=scan.nextInt();
        int sayi[]=new int[boyut];
        for (int i = 0; i < sayi.length ; i++) {
            System.out.print(i+". index giriniz : ");
            sayi[i]=scan.nextInt();
        }
        Arrays.sort(sayi);
        System.out.println(Arrays.toString(sayi));

    }
}
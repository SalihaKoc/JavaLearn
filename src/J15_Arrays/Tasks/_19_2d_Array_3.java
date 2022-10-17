package J15_Arrays.Tasks;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.
         */
        String arr[][]={{"new jersey","atlanta","ohio"} ,
                        {"Pittsburgh" ,"ohio","new york","ohio"} ,
                        {"ohio","new york"}};
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j]=="ohio") {
                    arr[i][j]="Florida";
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}


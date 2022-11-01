package J15_Arrays;

import java.util.Arrays;

public class C03_Arrays {

    public static void main(String[] args) {

        //Stringi array'e çevirme... split()-> girilen parametre değere gör String ifade parçalanır

        String str="javaCAN'lara selam olsun. En kısa zamanda bolcana offer, sonrası TUZLABALIK :)";

        //task-> string ifadeyi kelime sayısını print eden code
        String strArr[]=str.split(" "); //str her " " karaktere göre parçalanır
                                              //her bir parça strArr'in bir elamanı olarak atandı
        System.out.println(Arrays.toString(strArr)); //[javaCAN'lara, selam, olsun., En, kısa, zamanda, bolcana, offer,, sonrası, TUZLABALIK, :)]

        System.out.println(strArr.length); // 11

        //task-> string ifadeyi harf sayısını print eden code
        String harfArr[]= str.split(""); //string harf harf "("")hiçliğe gööre" parcalandı

        System.out.println(Arrays.toString(harfArr)); // [j, a, v, a, C, A, N, ', l, a, r, a,  , s, e, l, a, m,  , o, l, s, u, n, .,  , E, n,  , k, ı, s, a,  , z, a, m, a, n, d, a,  , b, o, l, c, a, n, a,  , o, f, f, e, r, ,,  , s, o, n, r, a, s, ı,  , T, U, Z, L, A, B, A, L, I, K,  , :, )]
        System.out.println(harfArr.length); //78


    }
}

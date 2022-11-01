package CodeChallenge.day09.printf;

public class C01_TemelBilgiler {

    //https://www.digitalocean.com/community/tutorials/java-printf-method

    public static void main(String[] args) {
        int sayi = 753;
        String str = "Bootcamp Clarusway";
        double db = 3.89563056;

        System.out.println(sayi+"-"+str+"-"+db); //753-Bootcamp Clarusway-3.89563056

        System.out.printf("sayi : %d , str : %s , db : %f\n",sayi,str,db); //sayi : 753 , str : Bootcamp Clarusway , db : 3,895631

        System.out.printf("sayi : %d , str : %S , db : %f \n",sayi,str,db); //sayi : 753 , str : BOOTCAMP CLARUSWAY , db : 3,895631

        System.out.printf("sayi : %10d , str : %-10.10S , db : %-5.3f\n",sayi,str,db); //sayi :        753 , str : BOOTCAMP C , db : 3,896

        //%10d -> 10 hanelik yer ayir, kapasite
        //%-20.10S -> sola yaslayarak 20 birimlik kapasite ver, String ifadenin buyuk harf ile 10 karakterini yazdir
        //%-5.3f ->sola yaslayarak 5 birimlik kapasite ver, virgulden sonra 3 hane yazdir
        // \n -> new line yeni satıra geç
        // - : sola yaslamak
        // %S : büyük harfle yazdır %s -> küçük harfle yazdır

        // %x.y -> x:kapasite y:karakter sayisi

        System.out.printf("sayi : %-10d , str : %-8.8s , db : %07.4f",sayi,str,db); //sayi : 753        , str : Bootcamp , db : 03,8956


    }
}
package day02;

public class Q01_Modulus {

    public static void main(String[] args) {
        // verilen 12345 sayisinin rakamlarini yukaridan asagiya dogru yazdiriniz
        // Hint: use / and %
        //    input: 12345
        //    output: 1
        //            2
        //            3
        //            4
        //            5

        int x=12345;

        int birler= x%10; //5
        int onlar = (x/10)%10; //4
        int yüzler = (x/100)%10;  //3
        int binler = (x/1000)%10; //2
        int onbinler = (x/10000); //1

        System.out.println(onbinler+ "\n"+binler+"\n"+ yüzler+"\n"+onlar+"\n"+birler );


    }
}

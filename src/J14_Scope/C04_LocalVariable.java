package J14_Scope;

public class C04_LocalVariable {

    public static void main(String[] args) {

        int yas=33; //main method local variable
        System.out.println(yas);

        for (int i = 1; i <7 ; i++) { //for loop başı
            System.out.print(yas+" :) "); //yas local variable aynı local'e call edildi
            i++; // i loop variable loap içi call edildi
        } //for loop sonu

       // i=34; //local dısı call edileemez

        yas=35; //local variable localinde call edildi
    }
    //yas=48; //local dısı call edilemeez
}

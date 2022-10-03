package J11_MethodCreation;

public class C04_MethodCreation {

    public static void main(String[] args) {

        String name="saliha";
        System.out.println("car car "+name);
        C04_MethodDepo.gecmeNotu(24); //depo class'tan class name ile method call edildi

        C04_MethodDepo.topla(3,5);

        /*
        Farklı class'tan call etmek için ...
        1.method static -> gökteki güneş gibi
        2.className.methodName() şeklinde call edilir. Aynı class'taki method doğrudan call edilir..
         */

        selamVer(); //aynı class'tan method name ile call edildi
        C03_MethodOverloading.topla(45,0.25);
    }

    public static void selamVer (){
        System.out.println("agam selamlar Devamkee :)");
    }


}

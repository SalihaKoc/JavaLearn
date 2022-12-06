package J37_Enum.enum04;

public class Runner {

    public static void main(String[] args) {

        Aylar ay=Aylar.MAYIS;

        System.out.println("ay.ordinal() = " + ay.ordinal()); //4
        System.out.println("ay = " + ay); //MAYIS
        System.out.println("ay.name() = " + ay.name()); //MAYIS
        System.out.println("ay.gunler = " + ay.gunler); //31
        ay.gunMiktari(); //enum meth call edildi - 31

    }
}

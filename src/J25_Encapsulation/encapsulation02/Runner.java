package J25_Encapsulation.encapsulation02;

public class Runner {

    public static void main(String[] args) {

        Kisi obj1=new Kisi("Ümit","K","umitK33",33); //obj create edildi

        obj1.ad="Güzel insan Ümit Bey";

        System.out.println("obj1.ad = " + obj1.ad);

        System.out.println("obj1.soyad = " + obj1.soyad);

        System.out.println("obj1.getPassword() = " + obj1.getPassword());

        obj1.setYas(-34);

        System.out.println("obj1.getYas() = " + obj1.getYas());
    }
}

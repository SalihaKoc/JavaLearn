package J02_DataTypes_WrapperClass;

public class C01_VariableCreate {

    public static void main(String[] args) {

        //1.yol -> best practice(Recommended) tavsiye edilen
        int yas=48;
        int maas=33000;

        System.out.println("yas"); //yas
        System.out.println(yas); //48
        System.out.println(maas);//33000
        System.out.println("Nur Hanım Başlangıç Maaşı : " +maas);//Nur Hanım Başlangıç Maaşı : 33000

        //2.yol
        int boy; // değeri atanmayan boy isminde bir int tanımlandı declaration
       // System.out.println(boy); //değeri atanmamıl değişkeni hiç bir aksiyonda kullanılamaz
        boy=175;
        System.out.println("Boyunuz : " +boy);

        //3.yol
        int yevmiye, age, kilo; //birden çok aynı tipte değişken tanımlandı
        age=33;
        yevmiye = 1000;
        kilo=99; //tanımlama değişkenlere değer ataması yapıldı

        int gunluk=1500, yıl=2022, ağırlık=99;
            //TRICK bir variable sadece tanımlanabilir ama  birden çok değer atanabilir
        System.out.println(gunluk);

        gunluk=1800; //gunluk yeni değeri 1800 olarak atandı
        System.out.println("Günlük son değeri : " +gunluk);
        System.out.println("Günlük değeri:" + gunluk+ "yıl değeri: " + yıl + yas + yevmiye + ağırlık);
    }
}

package J33_Interface;

public class Runner {

    public static void main(String[] args) {

        Sahin dgnshn = new Sahin();

        dgnshn.ebat();

        dgnshn.jant();

        dgnshn.kapi();

        dgnshn.kaporta();

        dgnshn.klima();

        dgnshn.koltuk();

        dgnshn.motor();

        System.out.println("dgnshn.sisLamp() = " + dgnshn.sisLamp()); //default conc meth obj ile call edildi

        dgnshn.sunroof();

        dgnshn.yakit();

        System.out.println("DisDonanim.RENK = " + DisDonanim.RENK);
        System.out.println("IcDonanim.RENK = " + IcDonanim.RENK);
        System.out.println("Lastik.RENK = " + Lastik.RENK);
       //System.out.println("Lastik.RENK = " + RENK); aynı isimli variabla interface name ile call edilir

        // IcDonanim.KUMAS="deri"; -> CTE final variable atama yapılamazzz

        System.out.println("IcDonanim.KUMAS = " + IcDonanim.KUMAS);
        System.out.println("IcDonanim.MUSIC = " + IcDonanim.MUSIC);
        DisDonanim.anten(); //static conc meth Interface name ile call edildi
    }
}

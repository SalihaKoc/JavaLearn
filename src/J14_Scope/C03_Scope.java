package J14_Scope;

public class C03_Scope {

    public static void main(String[] args) {

        C01_InstanceVariable kus=new C01_InstanceVariable(); //istediğim class'dan kus
        kus.name="HÜMA";
        kus.developerMi=false;

        System.out.println("kus.name = " + kus.name); //HÜMA

        C01_InstanceVariable.staticMethod(); //class name ile mehod call edildi

        kus.non_staticMethod(); //obj ile non-static method call

    }
}

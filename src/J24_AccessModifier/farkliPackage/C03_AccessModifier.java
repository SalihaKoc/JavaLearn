package J24_AccessModifier.farkliPackage;

import J24_AccessModifier.C01_AccessModifier;

public class C03_AccessModifier {

    private String privateTeamLead="Hakan Aydın";
    String defaultName="Cebrail Bey";
    protected  String ptotecteName="Dilek Hanım";
    public String publicName="Gamze Hanım";

    public static void main(String[] args) {

        C01_AccessModifier obj9=new C01_AccessModifier(23,63); // public cons.
        System.out.println("obj9.publicYas = " + obj9.publicYas); //public var.
      //  obj9.defaultYas() --->> default variable package dışı erişileme
        // obj9.protectedMethod() --->> protectede method package dışı call edilemez
    }

}

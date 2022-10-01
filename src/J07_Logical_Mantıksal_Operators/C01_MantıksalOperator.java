package J07_Logical_Mantıksal_Operators;

public class C01_MantıksalOperator {

    public static void main(String[] args) {

       /* -------- && - and - (ve)---------

                True   &&    True    -->  True
        True   &&    False   -->  False
        False  &&    True    -->  False
        False  &&    False   -->  False


                -------- ||- or - (veya)---------

                True   ||    True    -->  True
        True   ||    False   -->  True
        False  ||    True    -->  True
        False  ||    False   -->  False
        */

        //AND
        boolean b1=true;
        int a=3;
        int c=7;

        System.out.println(b1&(a<c));
        System.out.println(b1&&(a>c));
        System.out.println(b1&(a==c));

        //OR
        System.out.println(b1||(a<c));
        System.out.println(b1||(a>c));
        System.out.println(b1||(a==c));

        //NOT
        System.out.println(!(b1&(a<c)));
        System.out.println(!(b1&&(a>c)));
        System.out.println(!(b1||(a==c)));


}
}

package javaForLife.CnytHcTasks;

public class C04_Reverse {

    public static void main(String[] args) {

        /**
         * String str = "a-bc-d1ef-ghjk";
         * Output--->    "k-jh-g1fe-dcba" Yani sadece harfleri reverse edeceğiniz bir method create ediniz
         */

        harfReverse();

    }

    private static void harfReverse() {
        String str = "a-bc-d1ef-ghjk";
        StringBuilder str1 = new StringBuilder();
        str1.append(str);

        System.out.println(str1.reverse());

    }
}

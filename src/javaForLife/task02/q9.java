package javaForLife.task02;

public class q9 {
    /*String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
		String str1 = “$13.99”
		String str2 = “$10.55”
		İpucu :)) : Double.parseDouble() methodunu kullanabilirsiniz. */

    public static void main(String[] args) {

        String str1 = "$13.99";
        String str2 = "$10.55";

        double str1yeni = Double.parseDouble(str1.replace("$", ""));
        double str2yeni = Double.parseDouble(str2.replace("$", ""));

        System.out.println("toplam = " + (str1yeni + str2yeni));
    }



}

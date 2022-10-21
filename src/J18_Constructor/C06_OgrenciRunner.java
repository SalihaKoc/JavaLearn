package J18_Constructor;

public class C06_OgrenciRunner {

    public static void main(String[] args) {

        C06_Ogrenci talebe=new C06_Ogrenci("Saliha",21);

        System.out.println("talebe.isim = " + talebe.isim); //saliha
        System.out.println("talebe.yas = " + talebe.yas); //21
        System.out.println("talebe.yas = " + talebe.age);
        System.out.println("talebe.name = " + talebe.name);

    }
}

package J02_DataTypes_WrapperClass;

public class C04_WrapperClass {

    public static void main(String[] args) {

        String name="Saliha";
        int yas=32;

        System.out.println(name.toUpperCase()); //SALİHA

        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        // Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla ara çözüm imkanı sunmuştur.

        //TASK id ve tc String değerlerinin toplamını print eden code yazınız
        String tc= "1234455";
        String id="98765";
        System.out.println(tc+id); // concat-> birleştirme : 123445598765

        int yenitc=Integer.valueOf(tc); //tc string değerinni int çevirdi ve yenitc'ye atadı
        System.out.println("yenitc = "+ yenitc);

        int yeniid=Integer.valueOf(id); //id string değerinni int çevirdi ve yeniid'ye atadı
        System.out.println("yeniid = "+ yeniid);

        System.out.println("toplamı =" + (yenitc+yeniid)); //aritmetik toplama :1333220

        String okulno="234543L";
        //int yeniokulno= Integer.valueOf(okulno); //run time exception -> çalışma zamanı hatası



        // TASK-> byte short int maximum ve minimum değerlerini print eden code yazınız
        //System.out.println("yeniOkulNo = " + yeniOkulNo);
        // System.out.println("madem geldin dünyaya otur çalış javaya");

        byte maxByteDegeri = Byte.MAX_VALUE;
        byte minByteDegeri = Byte.MIN_VALUE;
        System.out.println("maxByteDegeri = " + maxByteDegeri);
        System.out.println("minByteDegeri = " + minByteDegeri);

        System.out.println("Integer.MAX_VALUE =" + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE =" + Integer.MIN_VALUE);

        int a=5;
        System.out.println(a); //5
        System.out.println(5); //5

    }
}

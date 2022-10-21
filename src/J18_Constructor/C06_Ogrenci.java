package J18_Constructor;

public class C06_Ogrenci { //ogrnci obj için kalıphane

    //fields
    String isim = "Merve";
    int yas;

    String name;
    int age;

    public C06_Ogrenci(String isim, int yas) {
        // this.isim = isim; //parametre isim değeri inst. obj isim değerine atandı
        // this.yas = yas; ;//parametre yas değeri inst. obj yas değerine atandı
        isim = isim; //pramtre isim yine parametre isme atandı inst. obj isim degeri değişmedi
        yas = yas; //pramtre yas yine parametre yas atandı inst. obj yas degeri değişmedi
       //name = isim; //parametre isim değeri inst. obj name değerine atandı
       //age = yas; //parametre yas değeri inst. obj age değerine atandı
        System.out.println("const'taki isim : " + isim);
        System.out.println("const'taki isim : " + this.isim);
        System.out.println("const'taki isim : " + name);

    }
}
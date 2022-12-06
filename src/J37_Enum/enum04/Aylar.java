package J37_Enum.enum04;

public enum Aylar {

   // OCAK(31,"kış","Ayşe"),
    OCAK(31),
    SUBAT(2),
    MART(31),
    NISAN(30),
    MAYIS(31),
    HAZIRAN(30),
    TEMMUZ(31),
    AGUSTOS(31),
    EYLUL(30),
    EKIM(31),
    KASIM(30),
    ARALIK(31);

    int gunler;
    Aylar(int gunSayisi) {
        gunler=gunSayisi;
    }
   // Aylar(int gunSayisi, String mevsim, String birthDay) { //p'li cons p'sizi ezer
   //     gunler=gunSayisi;
   // }

    void gunMiktari() {
        System.out.println("günler : "+ gunler);
    }
}

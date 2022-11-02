package J25_Encapsulation.encapsulation02;

public class Kisi {

    /*
    kisi pojo class için fields -> ad, soyad, password (String), yas
    tüm field'ları kullanıcı görebilmeli ve password hariç update edebilmeli
    password encapsulated update edilmemeli. yas variable negatif girmeye karsı encapsule edilsin
    runner class'da obje ile field'ları print eden code
     */

   String ad;
   String soyad;
   private String password;
   private int yas;

    public Kisi(String ad, String soyad, String password, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.password = password;
        this.yas = yas;
    }

    public String getPassword() {
        return password;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {

        this.yas=Math.abs(yas);
      // if (yas<0) {
      //     this.yas=yas*(-1);
      // }else this.yas=yas;
    }
}

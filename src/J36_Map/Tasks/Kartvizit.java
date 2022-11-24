package J36_Map.Tasks;

public class Kartvizit { //pojo -> obj üretecek

    String isim;
    String email;
    String adres;
    String telefon;

    int id=100;

    public Kartvizit(String isim, String email, String adres, String telefon) {
        this.isim = isim;
        this.email = email;
        this.adres = adres;
        this.telefon = telefon;
        this.id++;
    }

    @Override
    public String toString() {
        return "isim='" + isim + '\'' +
                ", email='" + email + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'';
    }
}

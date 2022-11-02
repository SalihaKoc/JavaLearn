package J25_Encapsulation.encapsulation03;

public class Arac{

    /*
    1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
    olan Araba  isimli bir class cretae ediniz.
    2- bütün fieldları parametre alan bir constructor tanımlayınız.
    3- ArabaMain isminde main için bir class oluşturunuz.
    4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
    5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
     */

    private String model;
    private String renk;
    private int motor;
    private int yil;

    public Arac(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;
        setMotor(motor);
        setYil(yil);
        //this.motor = motor;
        //this.yil = yil;
    }

    public Arac() {
    }

    public void setMotor(int motor) {
        if (motor<1000) {
            this.motor = 1001;
        }else  this.motor=motor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setYil(int yil) {
        if (yil<0) {
            this.yil=yil*(-1);
        }else this.yil = yil;
    }

    public String getModel() {
        return model;
    }

    public String getRenk() {
        return renk;
    }

    public int getMotor() {
        return motor;
    }

    public int getYil() {
        return yil;
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil;
    }
}

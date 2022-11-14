package J32_Abstract.Ornek2;

public class Dikdortgen extends Sekil {
    private double uzunKenar;
    private double kisaKenar;

    public Dikdortgen(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    @Override
    public double alan() {
        return this.uzunKenar * this.kisaKenar;
    }

    @Override
    public double cevre() {
        return (this.uzunKenar + this.kisaKenar) * 2;
    }
}

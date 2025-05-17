package BANGUNRUANG;

public class Bola extends BangunRuang implements Hitung {
    double jari;

    public Bola(double r) {
        this.jari = r;
    }

    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(jari, 3);
    }

    @Override
    public double luasPermukaan() {
        return 4 * Math.PI * Math.pow(jari, 2);
    }

    @Override
    public void display() {
        System.out.println("Volume Bola: " + volume());
        System.out.println("Luas Permukaan Bola: " + luasPermukaan());
    }
}
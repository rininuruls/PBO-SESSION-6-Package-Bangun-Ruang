package BANGUNRUANG;

public class Tabung extends BangunRuang implements Hitung {
    double jari, tinggi;

    public Tabung(double r, double t) {
        this.jari = r;
        this.tinggi = t;
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(jari, 2) * tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * Math.PI * jari * (jari + tinggi);
    }

    @Override
    public void display() {
        System.out.println("Volume Tabung: " + volume());
        System.out.println("Luas Permukaan Tabung: " + luasPermukaan());
    }
}
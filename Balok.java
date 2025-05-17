package BANGUNRUANG;

public class Balok extends BangunRuang implements Hitung {
    double panjang, lebar, tinggi;

    // Overloading constructor
    public Balok(double sisi) {
        this.panjang = this.lebar = this.tinggi = sisi;
    }

    public Balok(double p, double l, double t) {
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
    }

    // Overriding abstract methods
    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * (panjang * lebar + lebar * tinggi + panjang * tinggi);
    }

    @Override
    public void display() {
        System.out.println("Volume Balok: " + volume());
        System.out.println("Luas Permukaan Balok: " + luasPermukaan());
    }
}

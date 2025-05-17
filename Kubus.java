package BANGUNRUANG;

public class Kubus  extends Balok {
    public Kubus(double sisi) {
        super(sisi);
    }

    @Override
    public void display() {
        System.out.println("Volume Kubus: " + volume());
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan());
    }
}
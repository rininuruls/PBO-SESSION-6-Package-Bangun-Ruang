package BANGUNRUANG;

public class App {
    public static void main(String[] args) {
        Balok balok = new Balok(4, 3, 2);
        Kubus kubus = new Kubus(5);
        Bola bola = new Bola(7);
        Tabung tabung = new Tabung(3.5, 10);

        balok.display();
        System.out.println();

        kubus.display();
        System.out.println();

        bola.display();
        System.out.println();

        tabung.display();
    }
}
package aggregation.lingkaran;

public class Aggregation {
    public static void main(String[] args) {
        Titik titik = new Titik(10, 10);
        Lingkaran lingkaran = new Lingkaran(titik, 12);
        lingkaran.printLingkaran();
    }
}

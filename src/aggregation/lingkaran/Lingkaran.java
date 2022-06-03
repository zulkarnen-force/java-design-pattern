package aggregation.lingkaran;

public class Lingkaran {
    
    private Titik titik;
    private int jari;

    public Lingkaran(Titik titik, int jari) {
        this.titik = titik;
        this.jari = jari;
    }
    
    public void printLingkaran(){
        System.out.println("Posisi titik");
        titik.setTitik();
        System.out.println("Jari-jari : " + jari);
    }

}

package composition.pohon;

public class Pohon {
    private String name;
    private Daun daun;

    public Pohon(String name, float ruas) {
        this.name = name;
        this.daun = new Daun(ruas);
    }

    public void printPohon(){
        System.out.println("Pohon name " + name);
        System.out.println("Jumlah ruas daun " + daun.getRuas());
    }
    
}

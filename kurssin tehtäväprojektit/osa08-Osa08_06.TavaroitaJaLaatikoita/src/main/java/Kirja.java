
public class Kirja implements Talletettava{
    private String kirjoittaja;
    private String kirja;
    private double paino;
    public Kirja(String kirjoittaja, String kirja, double paino){
        this.kirja = kirja;
        this.kirjoittaja = kirjoittaja;
        this.paino = paino;
    }
    public double paino(){
        return this.paino;
    }
    
    public String toString(){
        return kirjoittaja + ": " + kirja;
    }
}

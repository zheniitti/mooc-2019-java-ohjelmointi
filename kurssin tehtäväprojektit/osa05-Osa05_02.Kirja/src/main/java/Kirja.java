
public class Kirja {
    private String nimi;
    private String kirjailija;
    private int sivujenmäärä;
    
    public Kirja(String kirjailija, String nimi, int sivujenmäärä){
        this.kirjailija = kirjailija;
        this.nimi = nimi;
        this.sivujenmäärä = sivujenmäärä;
    }
    
    public String getKirjailija(){
        return this.kirjailija;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public int getSivuja(){
        return this.sivujenmäärä;
    }
    
    public String toString(){
        return this.kirjailija + ", " + this.nimi + ", " + this.sivujenmäärä + " sivua";
    }
}

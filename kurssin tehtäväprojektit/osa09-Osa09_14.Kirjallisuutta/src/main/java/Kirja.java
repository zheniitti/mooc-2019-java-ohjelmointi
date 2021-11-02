
public class Kirja {
    private String nimi; private int ika;
    
    public Kirja(String n, int v){
        nimi = n; ika = v;
    }
    
    public String getNimi(){
        return nimi;
    }
    
    public int getIka(){
        return ika;
    }
    
    public String toString(){
        return this.getNimi() + " (" + this.ika + " vuotiaille ja vanhemmille)";
    }
}

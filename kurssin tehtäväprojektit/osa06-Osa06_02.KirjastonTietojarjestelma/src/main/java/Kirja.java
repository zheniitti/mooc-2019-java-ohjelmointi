
public class Kirja {
    private String nimeke;
    private String julkaisija;
    private int julkaisuvuosi;
    
    public Kirja(String nimeke, String julkaisija, int julkaisuvuosi){
        this.julkaisija = julkaisija;
        this.julkaisuvuosi = julkaisuvuosi;
        this.nimeke = nimeke;
    }
    
    public String nimeke(){
        return nimeke;
    }
    
    public String julkaisija(){
        return julkaisija;
    }
    
    public int julkaisuvuosi(){
        return julkaisuvuosi;
    }
    
    public String toString(){
        return nimeke + ", " + julkaisija + ", "+ julkaisuvuosi;
    }
}



public class Ostos {
    private String tuote;
    private int kpl;
    private int hinta;
    
    public Ostos(String tuote, int kpl, int yksikkohinta){
        this.kpl = kpl;
        this.tuote = tuote;
        this.hinta = yksikkohinta;
    }
    
    public int hinta(){
        return this.kpl * this.hinta;
    }
    
    public String getNimi(){
        return tuote;
    }
    
    public void kasvataMaaraa(){
        kpl = kpl+1;
    }
    
    public String toString(){
        return tuote +": " + kpl;
    }
}

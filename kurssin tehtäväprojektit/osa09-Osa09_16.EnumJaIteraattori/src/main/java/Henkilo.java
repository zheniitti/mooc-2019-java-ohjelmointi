
public class Henkilo {
    private String nimi;
    private Koulutus koulutus;
    
    public Henkilo(String n, Koulutus k){
    this.nimi = n; this.koulutus = k;
    }
    
    public Koulutus getKoulutus(){
        return this.koulutus;
    }
    
    public String toString(){
    return this.nimi+", "+this.koulutus;
    }
    
}

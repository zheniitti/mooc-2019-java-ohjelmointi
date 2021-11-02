
public class Laskuri {
    private int arvo;
    
    public Laskuri(){
        this.arvo = 0;
    }
    
    public Laskuri(int arvo){
        this.arvo = arvo;
    }
    
    public int arvo(){
        return this.arvo;
    }
    
    public void lisaa(){
        this.arvo++;
    }
    
    public void vahenna(){
        this.arvo = this.arvo-1;
    }
    
    public void lisaa(int lisays){
        if(lisays>0){
            this.arvo = this.arvo + lisays;
        }
    }
    
    public void vahenna(int vahennys){
        if(vahennys>0){
            this.arvo = this.arvo - vahennys;
        }
    }
}

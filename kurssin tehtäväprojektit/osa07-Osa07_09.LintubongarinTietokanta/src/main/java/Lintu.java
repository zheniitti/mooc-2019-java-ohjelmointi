
public class Lintu {
    final String nimi;
    final String lnimi;
    private int havainnot;
    
    public Lintu(String nimi, String lnimi){
        this.nimi = nimi;
        this.lnimi = lnimi;
        this.havainnot = 0;
                
    }
    
    public void lisaaHavainto(){
        this.havainnot ++;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public String getLnimi(){
        return this.lnimi;
    }
    
    public int havainnot(){
        return this.havainnot;
    }
    
    @Override
    public String toString(){
        return this.nimi + " (" + this.lnimi + "): " + this.havainnot;
    }
}

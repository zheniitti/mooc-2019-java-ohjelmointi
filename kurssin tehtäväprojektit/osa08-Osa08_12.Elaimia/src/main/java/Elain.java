
public abstract class Elain {
    private String nimi;
    
    public Elain(String nimi) {
        this.nimi = nimi;
    }
    
    public String getNimi() {
        return this.nimi;
    }
    
    public void syo(){
        System.out.println(nimi+ " syo");
    }
    
     public void nuku(){
        System.out.println(nimi+ " nukkuu");
    }
}

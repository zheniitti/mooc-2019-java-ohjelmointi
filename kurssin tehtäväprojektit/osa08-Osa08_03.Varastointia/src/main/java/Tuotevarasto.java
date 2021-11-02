
public class Tuotevarasto extends Varasto{
    private String nimi;
    
    public Tuotevarasto(String nimi, double tilavuus){
        super(tilavuus);
        this.nimi = nimi;
    }
    
    public String getNimi(){
        return this.nimi;
    }
    
    public void setNimi(String uusiNimi) {
        this.nimi = uusiNimi;
    }
    
    public String toString(){
        return this.nimi +": "+ super.toString();
    }
}

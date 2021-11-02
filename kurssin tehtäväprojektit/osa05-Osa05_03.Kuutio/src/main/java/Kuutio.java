
public class Kuutio {
    private int sarmanPituus;
    private int tilavuus;
    
    public Kuutio(int särmänpituus){
        this.sarmanPituus = särmänpituus;
    }
    
    public int tilavuus(){
        this.tilavuus = this.sarmanPituus * this.sarmanPituus * this.sarmanPituus;
        return this.tilavuus;
    }
    
    @Override
    public String toString(){
        return ("Kuution särmän pituus on " + this.sarmanPituus + ", tilavuus on " + this.tilavuus);
    }
}

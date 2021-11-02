
public class CDLevy implements Talletettava{
    private String artisti;
    private String levy;
    private int vuosi;
    private double paino;
    
    public CDLevy(String artisti, String l, int v){
        this.artisti = artisti;
        this.levy = l;
        this.vuosi = v;
        this.paino = 0.1;
    }
    public double paino(){
        return this.paino;
    }
    
    public String toString(){
        return artisti + ": " + levy + " (" + vuosi+ ")";
    }
}

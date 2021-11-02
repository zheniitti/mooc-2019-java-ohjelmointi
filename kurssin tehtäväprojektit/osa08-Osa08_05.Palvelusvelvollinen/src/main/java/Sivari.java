
public class Sivari implements Palvelusvelvollinen{
    private int paivia;
    
    
    public Sivari(){
        paivia = 362;
    }
    
    public int paiviaJaljella(){
        return paivia;
    }
    
    public void palvele(){
        if(!(paivia== 0)){
            paivia  = paivia -1;
        }
    }
}

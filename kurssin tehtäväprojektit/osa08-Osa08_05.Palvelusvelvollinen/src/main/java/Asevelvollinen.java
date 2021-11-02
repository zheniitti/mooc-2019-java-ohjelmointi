
public class Asevelvollinen implements Palvelusvelvollinen{
    private int palveluspaivia;
    public Asevelvollinen(int paivia){
        palveluspaivia = paivia;
    }
    
    public int paiviaJaljella(){
        return palveluspaivia;
    }
    
    public void palvele(){
        if(!(palveluspaivia== 0)){
            palveluspaivia = palveluspaivia -1;
        }
    }
}

import java.util.ArrayList;
public class Pakkaus {
    private ArrayList<Lahja> pakkaus;
    
    public Pakkaus(){
      this.pakkaus = new ArrayList<>();  
    }
    
    
    public void lisaaLahja(Lahja lahja){
        
        this.pakkaus.add(lahja);
    }
    
    public int yhteispaino() {
        int yhteispaino = 0;
        for (Lahja paino: pakkaus){
            int paino1 = (int) paino.getPaino();
            yhteispaino = paino1 + yhteispaino;
            
        }
        return yhteispaino;
    }
}

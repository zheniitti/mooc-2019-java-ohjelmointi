import java.util.HashMap;
public class Velkakirja {
    private HashMap<String, Double> velkakirja;
    public Velkakirja(){
        velkakirja = new HashMap<>();
    }
    
    public void asetaLaina(String kenelle, double maara) {
        Double määrä = maara;
        velkakirja.put(kenelle, määrä);
    }
    
    public double paljonkoVelkaa(String kuka){
        return velkakirja.getOrDefault(kuka, 0.0);
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public class Varasto {
    private Map<String, Integer> hinta;
    private Map<String, Integer> saldo;
    
    public Varasto(){
        hinta = new HashMap<>();
        saldo = new HashMap<>();
        
    }
    
    public void lisaaTuote(String tuote, int hinta, int saldo){
        this.hinta.put(tuote, hinta);
        this.saldo.put(tuote, saldo);
    }
    
    public int hinta(String tuote){
        if(hinta.containsKey(tuote)){
            return hinta.get(tuote);
        }
        return -99;
    }
    
    public int saldo(String tuote){
        if(saldo.containsKey(tuote)){
            return saldo.get(tuote);
        }
        return 0;
    }
    
    public boolean ota(String tuote){
        if(!saldo.containsKey(tuote)){
            return false;
        }
        if(saldo.get(tuote)==0){
            return false;
        }
        int s = saldo.get(tuote);
        saldo.put(tuote, (s-1));
        return true;
    }
    
    public Set<String> tuotteet(){
        
        return saldo.keySet();
    }
}

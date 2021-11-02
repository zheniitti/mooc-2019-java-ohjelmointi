package sovellus;
import java.util.List;
import java.util.ArrayList;
import sovellus.Sensori;
import java.util.Collection;
import java.util.stream.Collectors;

public class Keskiarvosensori implements Sensori{
    private ArrayList<Sensori> lista;
    private ArrayList<Integer> mitt;
    public Keskiarvosensori(){
        lista = new ArrayList<>();
        this.mitt = new ArrayList<>();
    }
    
    public void lisaaSensori(Sensori lisattava){
        lista.add(lisattava);
    }
    
    public boolean onPaalla(){
        for(Sensori s: lista){
            if(!s.onPaalla()){
                return false;                
            }
        }
        return true;
    }

    public void paalle(){
        for(Sensori s: lista){
            s.paalle();
        }
    } 

    public void poisPaalta(){
        for(Sensori s: lista){
            s.poisPaalta();
        }
    }  

    public int mittaa(){
        if(lista.isEmpty()){
            throw new IllegalStateException();
        }
        if(!this.onPaalla()){
            throw new IllegalStateException();
        }
        int summa = 0;
        for(Sensori s: lista){
            mitt.add(s.mittaa());
            summa = summa + s.mittaa();
        }
        return summa/lista.size();
    }
    
    public List<Integer> mittaukset(){   
        
        return mitt;
    }
}

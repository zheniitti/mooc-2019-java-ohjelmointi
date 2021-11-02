import java.util.List;
import java.util.ArrayList;

public class Ostoskori {
    private List<Ostos> lista;
    
    public Ostoskori(){
        lista = new ArrayList<>();
        
    }
    
    public void lisaa(String tuote, int hinta){
        ArrayList<String> nimet = new ArrayList<>();
        Ostos Ostos = new Ostos(tuote, 1, hinta);
        if(!lista.isEmpty()){
            for (Ostos o: lista){
                nimet.add(o.getNimi());
            }
        
            if(!(nimet.contains(tuote))){                
                lista.add(Ostos);
            }
            else{
                for(Ostos o: lista){
                    if(o.getNimi().equals(tuote)){
                        o.kasvataMaaraa();
                    }
                }
            }
            
        }
        else{
            lista.add(Ostos);
        }
    }
    
    public int hinta(){
        int summa = 0;
        for(Ostos o: lista){
            summa = summa + o.hinta();
        }
        return summa;
    }
    public void tulosta(){
        for(Ostos o: lista){
            System.out.println(o);
        }
    }
    
    
}

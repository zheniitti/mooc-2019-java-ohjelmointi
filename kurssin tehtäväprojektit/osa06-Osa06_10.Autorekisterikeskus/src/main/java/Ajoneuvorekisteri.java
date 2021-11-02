import java.util.HashMap; import java.util.ArrayList;
public class Ajoneuvorekisteri {
    private HashMap<Rekisterinumero, String> omistajat;
    public Ajoneuvorekisteri(){
        omistajat = new HashMap<>();
    }
    
    public boolean lisaa(Rekisterinumero rekkari, String omistaja){
        if(!(omistajat.containsKey(rekkari))){
            omistajat.put(rekkari, omistaja);
            return true;
        }
        if((omistajat.get(rekkari).equals(null))){
            omistajat.put(rekkari, omistaja);
            return true;
        }
        
        return false;
    }
    
    public String hae(Rekisterinumero rekkari){
        return omistajat.get(rekkari);
    }
    
    public boolean poista(Rekisterinumero rekkari){
        if(omistajat.containsKey(rekkari) && omistajat.get(rekkari).isEmpty()){
            return false;
        }
        if(!(omistajat.containsKey(rekkari))){ 
            return false;
        }
        if(omistajat.containsKey(rekkari)){
            omistajat.remove(rekkari);
            return true;
        }
        return false;
    }
    
    public void tulostaRekisterinumerot(){
        for(Rekisterinumero rek: this.omistajat.keySet()){
            System.out.println(rek);
        }
    }
    
    public void tulostaOmistajat(){
        ArrayList<String> omistajatlista = new ArrayList<>();
        for(String omistaja: this.omistajat.values()){
            if(!(omistajatlista.contains(omistaja))){
                omistajatlista.add(omistaja);
            }
        }
        for(String omistaja: omistajatlista){
        System.out.println(omistaja);
    }
    }
}

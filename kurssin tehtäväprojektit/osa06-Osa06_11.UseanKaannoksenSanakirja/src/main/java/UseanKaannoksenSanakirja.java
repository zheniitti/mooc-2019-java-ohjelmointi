import java.util.HashMap; import java.util.ArrayList;
public class UseanKaannoksenSanakirja {
    private HashMap<String, ArrayList<String>> sanakirja;
    public UseanKaannoksenSanakirja(){
    sanakirja = new HashMap<>();
}
    public void lisaa(String sana, String kaannos){
        sanakirja.putIfAbsent(sana, new ArrayList<>());
        sanakirja.get(sana).add(kaannos);
    }
    
    public ArrayList<String> kaanna(String sana){
        if(!sanakirja.containsKey(sana)){
            return new ArrayList<String>();
            }
        
        if(sanakirja.get(sana).isEmpty()){
            return new ArrayList<String>();
        }
        return sanakirja.get(sana);
    }
    
    public void poista(String sana){
        if(sanakirja.containsKey(sana)){
        sanakirja.get(sana).clear();
        }
    }
}

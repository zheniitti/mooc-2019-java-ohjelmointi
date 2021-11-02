import java.util.ArrayList; import java.util.HashMap;
public class Kellari {
    private HashMap<String, ArrayList<String>> kellari;
    public Kellari(){
        kellari = new HashMap<>();
    }
    
    public void lisaa(String komero, String tavara){
        kellari.putIfAbsent(komero, new ArrayList<>());
        kellari.get(komero).add(tavara);
    }
    
    public ArrayList<String> sisalto(String komero){
        return kellari.getOrDefault(komero, new ArrayList<>());
    }
    
    public void poista(String komero, String tavara){
        if(!kellari.containsKey(komero)){
            return;
        }
        kellari.get(komero).remove(tavara);
        if(kellari.get(komero).isEmpty()){
            kellari.remove(komero);
        }
    }
    
    public ArrayList<String> komerot() {
        ArrayList<String> komerot = new ArrayList<>();
        for (String komero : this.kellari.keySet()) {
            komerot.add(komero);
        }

        return komerot;
    }

}


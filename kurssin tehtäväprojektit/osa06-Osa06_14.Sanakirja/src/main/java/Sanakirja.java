import java.util.HashMap; import java.util.ArrayList;
public class Sanakirja {
    private HashMap<String, String> sanakirja;
    public Sanakirja(){
    sanakirja= new HashMap<>();
}
    public String kaanna(String sana){
        return sanakirja.get(sana);
    }
    
    public void lisaa(String sana, String kaannos){
        sanakirja.put(sana, kaannos);
    }
    
    public int sanojenLukumaara(){
        return sanakirja.size();
    }
    
    public ArrayList<String> kaannoksetListana(){
        ArrayList<String> lista = new ArrayList<>();
        for(String sana: sanakirja.keySet()){
            String merkkijono = sana + " = " + sanakirja.get(sana);
            lista.add(merkkijono);
        }
        return lista;
    }
}

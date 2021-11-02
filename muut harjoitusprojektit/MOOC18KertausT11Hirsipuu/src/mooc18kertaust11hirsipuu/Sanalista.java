
package mooc18kertaust11hirsipuu;
import java.util.*;
import java.util.stream.Collectors;


public class Sanalista {
    List<String> sanat;
    
    public Sanalista(List<String> l){
        this.sanat = l;        
    }
    
    public List<String> sanat(){
        return this.sanat;
    }
    
    public Sanalista sanatJoidenPituusOn(int pituus){
        List<String> uus = this.sanat.stream().filter(s -> s.length() == pituus).collect(Collectors.toCollection(ArrayList::new));
        return new Sanalista(uus);
    }
    
    public Sanalista sanatJoissaEiEsiinnyKirjainta(char kirjain){
        String c = ""+kirjain;
        List<String> uus = this.sanat.stream().filter(s -> s.contains(c)).collect(Collectors.toCollection(ArrayList::new));
        return new Sanalista(uus);
    }
    
    public Sanalista sanatJoissaMerkit(String merkkijono){
        
        HashMap<Integer, String> indeksijakirjain = new HashMap();
        for(int i=0; i<merkkijono.length(); i++){
            String kirjain = ""+merkkijono.charAt(i);
            if(!kirjain.equals("-")){
                indeksijakirjain.put(i, kirjain);
            }         
        }
        
        List<String> uus = new ArrayList();
        
        
        this.sanat.stream().forEach(s -> {
            
            if(s.length() == merkkijono.length()){
                
                boolean onkosamakirjain = true;
                for(int i=0; i<s.length(); i++){
                    String kirjain = ""+s.charAt(i);
                    if(!indeksijakirjain.get(i).equals(s) ){
                        onkosamakirjain = false;
                    }                
                }
                if(onkosamakirjain){
                    uus.add(s);
                }
                
            }            
            
        });
        
        
        
        return new Sanalista(uus);
        
    }
    
    
    public int koko(){
        return this.sanat.size();
    }
}

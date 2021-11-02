package mooc18kertaust11hirsipuu;

import java.util.*;

public class Hirsipuu {
    private final Sanalista sanalista;
    private String valittusana;
    int arvaustajaljella;
    ArrayList<Character> kaytetyt;
    
    
    public Hirsipuu(Sanalista s, int a){
        this.arvaustajaljella = a;
        this.sanalista = s;
        Collections.shuffle(this.sanalista.sanat);
        this.valittusana = this.sanalista.sanat.get(0);        
        this.kaytetyt = new ArrayList();
    }

    
    
    public boolean arvaa(Character merkki){
        if(!this.kaytetyt.contains(merkki)){
            this.kaytetyt.add(merkki);
        }
        
        if(this.valittusana.contains(""+merkki)){
            return true;
        }
        else{
            this.arvaustajaljella--;
            return false;
        }        
    }
    
    
    
    
    public List<Character> arvaukset(){
        return this.kaytetyt;
    }
    
    
    
    
    public int arvauksiaJaljella(){
        return this.arvaustajaljella;
    }
    
    
    
    public String sana(){
        StringBuilder builder = new StringBuilder();
        
        for(int i=0; i<this.valittusana.length(); i++ ){
            
            if(this.kaytetyt.contains(this.valittusana.charAt(i))){
                builder.append(this.valittusana.charAt(i));
            }
            else{
                builder.append("-"); 
            }
            
        }        
        return builder.toString();
    }
    
    
    
    
    public String oikeaSana(){
        return this.valittusana;
    }
    
    
    
    
    public boolean onLoppu(){
        if(this.sana().equals(this.valittusana)){
            return true;
        }
        else{
            return false;
        }
    }
}

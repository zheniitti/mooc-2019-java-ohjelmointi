
package maatila;
import java.util.ArrayList; 
import java.lang.IllegalStateException;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class Maatila implements Eleleva{
    
    private ArrayList<Lehma> lehmatlista;
    private String omistaja;
    private Navetta navetta;
    
    public Maatila(String nimi, Navetta n){
        omistaja = nimi;
        navetta = n;
        lehmatlista = new ArrayList<>();
    }
    
    public String getOmistaja(){
        return omistaja;
    }
    
    public String toString(){
        if(lehmatlista.isEmpty()){
            return "Maatilan omistaja: " + omistaja + 
                    "\nNavetan maitosäiliö: " + navetta.getMaitosailio() +
                    "\nEi lehmiä.";
        }else{
            String rivit ="    ";
            for(Lehma le: lehmatlista){
                rivit = rivit + le.toString() +"\n    ";
            }
            return "Maatilan omistaja: " + omistaja + 
                    "\nNavetan maitosäiliö: " + navetta.getMaitosailio() +
                    "\nLehmät:\n" + rivit;
        }
    }
    
    public void eleleTunti(){
        if(lehmatlista.size() > 0){
            for(Lehma moo: lehmatlista){
                moo.eleleTunti();
            }
        }
    }
    
    public void lisaaLehma(Lehma lehma){
        lehmatlista.add(lehma);
    }
    
    public void hoidaLehmat(){
        if(!lehmatlista.isEmpty()){
            for(Lehma moomoo: lehmatlista){
                navetta.hoida(moomoo);
            }
        }
    }
    
    public void asennaNavettaanLypsyrobotti(Lypsyrobotti r){
        navetta.asennaLypsyrobotti(r);
    }
}

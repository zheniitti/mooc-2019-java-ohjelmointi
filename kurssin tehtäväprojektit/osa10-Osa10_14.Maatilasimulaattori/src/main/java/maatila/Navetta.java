
package maatila;
import java.util.ArrayList; 
import java.lang.IllegalStateException;
import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class Navetta {
    private Maitosailio navetansailio; 
    private Lypsyrobotti robo;
    
    public Navetta (Maitosailio maitosailio){
        navetansailio = maitosailio; 
        robo = null;
    }
    public Maitosailio getMaitosailio() {
        return navetansailio;
        
    }
    public void asennaLypsyrobotti(Lypsyrobotti lypsyrobotti){
        robo = lypsyrobotti;
    }
    public void hoida(Lehma lehma){
        if(robo == null){
            throw new IllegalStateException();
        }
        else{
            robo.setMaitosailio(navetansailio);
            robo.lypsa(lehma);
        }
    }
    public void hoida(List<Lehma> lehmat){
        if(robo == null){
            throw new IllegalStateException();
        }
        else{
            robo.setMaitosailio(navetansailio);
            for(Lypsava lehma: lehmat){
                robo.lypsa(lehma);
            }
        }
    }
    
    public String toString(){
        return "Navetta: " + this.getMaitosailio();
    }
}

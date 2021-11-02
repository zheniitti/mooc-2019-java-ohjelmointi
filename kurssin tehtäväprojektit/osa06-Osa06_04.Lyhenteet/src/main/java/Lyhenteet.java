import java.util.HashMap;
public class Lyhenteet {
    private HashMap<String, String> lyhenteet;
    public Lyhenteet(){
        this.lyhenteet = new HashMap<>();
    }
    public void lisaaLyhenne(String lyhenne, String selite){
        lyhenteet.put(lyhenne, selite);
    }
    
    public boolean onkoLyhennetta(String lyhenne){
        return (lyhenteet.containsKey(lyhenne));
    }
    
    public String haeLyhenne(String lyhenne){
        if(lyhenteet.containsKey(lyhenne)){
            return lyhenteet.get(lyhenne);
        }
        return null;
    }
}

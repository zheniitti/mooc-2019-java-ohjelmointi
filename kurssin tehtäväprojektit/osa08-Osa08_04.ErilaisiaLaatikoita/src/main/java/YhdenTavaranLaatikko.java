
public class YhdenTavaranLaatikko extends Laatikko{
    private Tavara t;
    private int i;
    
    public YhdenTavaranLaatikko(){
        t = new Tavara(null, 0);
        i = 0;
    }
    
    public void lisaa(Tavara t){
        
        if(i<1){
            this.t = t;
        }
        i++;
    }
    
    public boolean onkoLaatikossa(Tavara t){
        return this.t.equals(t);
    }
}

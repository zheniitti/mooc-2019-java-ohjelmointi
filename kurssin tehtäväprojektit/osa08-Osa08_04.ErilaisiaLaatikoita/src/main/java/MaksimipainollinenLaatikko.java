import java.util.ArrayList;
public class MaksimipainollinenLaatikko extends Laatikko{
    private int max;
    private ArrayList<Tavara> tavarat;
    
    public MaksimipainollinenLaatikko(int maksimipaino){
        this.max = maksimipaino;
        tavarat = new ArrayList<>();
    }
    
    private int yhteispaino(){
        int ypaino = 0;
        for (Tavara t: tavarat){
            ypaino = ypaino + t.getPaino();
        }
        return ypaino;
    }
    
    public void lisaa(Tavara t){
        if(yhteispaino()+t.getPaino()>this.max){
            return;
        }
        else{
            tavarat.add(t);
        }
    }
    
    public boolean onkoLaatikossa(Tavara t){
        return this.tavarat.contains(t);
    }
}

import java.util.ArrayList; import java.util.HashMap;

public class Matkalaukku {
    private int maksimi;
    private ArrayList<Tavara> sisalto;
    public Matkalaukku(int max){
        this.maksimi = max;
        this.sisalto = new ArrayList<>();
    }
    
    public void lisaaTavara(Tavara tavara){
        if(tavara.getPaino()+this.yhteispaino()<=this.maksimi){
            sisalto.add(tavara);
        }
    }
    
    public String toString(){
        int kplmaara = sisalto.size();
        int yhteispaino = 0;
        for (Tavara tavara: sisalto){
            yhteispaino = yhteispaino + tavara.getPaino();
        }
        if(kplmaara==0){
            return "ei tavaroita (0 kg)";
        }
        if (kplmaara == 1){
            return "1 tavara ("+yhteispaino+" kg)";
        }
        
        return kplmaara+" tavaraa (" + yhteispaino + " kg)";
    }
    
    public void tulostaTavarat(){
        if(sisalto.isEmpty()){
            System.out.println("Laukku on tyhjä.");
        }
        else 
            
            for (Tavara tavara: sisalto){
            System.out.println(tavara.getNimi() + " ("+tavara.getPaino()+" kg)");
        }
    }
    
    public int yhteispaino(){
        int yhteispaino = 0;
        for (Tavara tavara: sisalto){
            yhteispaino = yhteispaino + tavara.getPaino();
        }
        return yhteispaino;
    }
    
    public Tavara raskainTavara(){
        int raskainpaino = 0;
        if(!sisalto.isEmpty()){
            for (Tavara tavara: sisalto){
            if(tavara.getPaino()>raskainpaino){
                raskainpaino = tavara.getPaino();
            }
        }
        for (Tavara tavara: sisalto){
            if(tavara.getPaino()==raskainpaino){
                return tavara;
            }
        }
        }
        return null;
    }
}

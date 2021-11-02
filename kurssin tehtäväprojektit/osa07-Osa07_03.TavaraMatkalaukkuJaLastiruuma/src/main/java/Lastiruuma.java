import java.util.ArrayList;
public class Lastiruuma {
    private int max;
    private ArrayList<Matkalaukku> ruuma;
    public Lastiruuma(int max){
        this.max = max;
        this.ruuma = new ArrayList<>();
    }
    
    public void lisaaMatkalaukku(Matkalaukku matkalaukku){
        if(this.yhteispaino()+matkalaukku.yhteispaino()<=this.max){
            this.ruuma.add(matkalaukku);
        }
    }
    
    public int yhteispaino(){
        int yhteis = 0;
        if(!this.ruuma.isEmpty()){
            for (Matkalaukku laukku: this.ruuma){
            yhteis = yhteis + laukku.yhteispaino();
        }
            return yhteis;
        }
        return 0;
    }
    
    
    public void tulostaTavarat(){
        for(Matkalaukku laukku: ruuma){
            laukku.tulostaTavarat();
        }
    }
    
    @Override
    public String toString(){
        return this.ruuma.size() + " matkalaukkua " + "("+this.yhteispaino()+" kg)";
    }
}

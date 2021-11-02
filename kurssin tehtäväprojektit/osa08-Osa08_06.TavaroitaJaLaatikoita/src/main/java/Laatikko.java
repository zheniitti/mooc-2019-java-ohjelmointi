import java.util.ArrayList;

public class Laatikko implements Talletettava{
    private double maxp;
    private ArrayList<Talletettava> lista;
    
    public Laatikko(double maxp){
        this.maxp = maxp;
        this.lista = new ArrayList<>();
    }
    
    public void lisaa(Talletettava t){
        if(t.paino()+this.paino()<= this.maxp){
            lista.add(t);
        }
       
    }
    
    public double paino(){
        double paino = 0.0;
        if(!lista.isEmpty()){
            for(Talletettava esine: lista){
                paino = paino + esine.paino();
            }
        }
        return paino;
    }
    
    public String toString(){
        return "Laatikko: " + lista.size() +" esinettä, paino yhteensä " + paino() + " kiloa";
    }
}

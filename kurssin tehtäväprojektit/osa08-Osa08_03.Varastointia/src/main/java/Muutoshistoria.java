import java.util.ArrayList;
public class Muutoshistoria {
    private ArrayList<Double> muutoshistoria;
    
    public Muutoshistoria(){
        this.muutoshistoria = new ArrayList<>();       
        }
    
    public void lisaa(double tilanne){
        muutoshistoria.add(tilanne);
            
    }
    
    public void nollaa(){
    muutoshistoria.clear();
    }
    
    public String toString(){
    return muutoshistoria.toString();
    }
    
    public double maxArvo(){              //palauttaa muutoshistorian suurimman arvon. Jos historia on tyhjä, metodi palauttaa nollan.
        double max = 0.0;
        for (double luku: muutoshistoria){
            if(luku>max){
                max = luku;
            }
        }
        return max;
    }
            
    public double minArvo(){ //palauttaa muutoshistorian pienimmän arvon. Jos historia on tyhjä, metodi palauttaa nollan.
        double min = muutoshistoria.get(0);
        for (double luku: muutoshistoria){
            if(luku<min){
                min = luku;
            }
        }
        return min;
    }
        
    

    public double keskiarvo(){ //palauttaa muutoshistorian arvojen keskiarvon. Jos historia on tyhjä, metodi palauttaa nollan.
        double ka = 0.0;
        double summa = 0.0;
        if(muutoshistoria.size()!=0){
            for (double luku: muutoshistoria){
                summa = summa + luku;
            }
            return summa/muutoshistoria.size();
        }
        return 0.0;
    }
}

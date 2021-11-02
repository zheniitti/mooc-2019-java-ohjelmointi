import java.util.ArrayList;

public class Lauma implements Siirrettava{
    private ArrayList<Siirrettava> lista;
    
    public Lauma(){
        this.lista = new ArrayList<>();
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava){
        this.lista.add(siirrettava);
    }
    
    public void siirra(int dx, int dy){
        for(Siirrettava s: lista){
            s.siirra(dx, dy);
        }
    }
    
    public String toString(){
        String esitys = "";
        for(Siirrettava s: lista){
            esitys = esitys + "\n" + s;
        }
        return esitys;
    }
}

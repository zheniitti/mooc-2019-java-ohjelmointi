import java.util.ArrayList;
import java.util.Collections;
public class Kasi implements Comparable<Kasi>{
    private ArrayList<Kortti> lista;
    
    public Kasi(){
        lista = new ArrayList<>();
    }
    
    public void lisaa(Kortti k){
        lista.add(k);
    }
    
    public void tulosta(){
        lista.stream().forEach(k->System.out.println(k));
    }
    
    public void jarjesta(){
        Collections.sort(lista);
        lista.stream().forEach(k->System.out.println(k));
    }
    
    private int arvo(){
        int i = 0;
        int ta = 0;        
        while (i<lista.size()){
            ta = ta + lista.get(i).getArvo();
            i++;
        }
        return ta;
    }
    
    @Override
    public int compareTo(Kasi k){
        return this.arvo()-k.arvo();
    }
    
    public void jarjestaMaittain() {
        Collections.sort(lista, new SamatMaatVierekkainArvojarjestykseen());
    }

    
}

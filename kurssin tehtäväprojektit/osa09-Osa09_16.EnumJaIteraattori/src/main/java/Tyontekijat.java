import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Tyontekijat {
    private ArrayList<Henkilo> lista;
    
    public Tyontekijat(){
        lista = new ArrayList<>();
    }
    
    public void lisaa(Henkilo lisattava){
        lista.add(lisattava);
    }
    
    public void lisaa(List<Henkilo> lisattavat){
        lisattavat.stream().forEach(h -> lista.add(h));
    }
    
    public void tulosta(){
            Iterator<Henkilo> it = lista.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    public void tulosta(Koulutus koulutus){
            Iterator<Henkilo> it = lista.iterator();

        while(it.hasNext()){
            if(it.next().getKoulutus()!=koulutus){
                it.remove();
            }
        }
        lista.stream().forEach(h->System.out.println(h));
    }
    
    public void irtisano(Koulutus koulutus){
            Iterator<Henkilo> it = lista.iterator();

        while(it.hasNext()){
            if(it.next().getKoulutus()==koulutus){
                it.remove();
            }
        }
    }
}

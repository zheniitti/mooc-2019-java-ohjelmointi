import java.util.ArrayList;
import java.util.List;

public class Putki<T>{
    private ArrayList<T> lista;
    public Putki(){
        lista = new ArrayList<>();
    }
    public T otaPutkesta(){
        if(!lista.isEmpty()){
            Object t = lista.get(0);
            lista.remove(0);
            return (T)t;
        }else {
            return null;
        }
    }
    public boolean onkoPutkessa(){
        if(lista.isEmpty()){
            return false;
        }
        else {
            return true;
        }
    }
    
    public void lisaaPutkeen(T arvo) {
        lista.add(arvo);
    }
    
}

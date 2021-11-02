
public class Piilo<T> {
    private T tyyppi;
    public Piilo(){
        tyyppi = null;
    }
    public void laitaPiiloon(T piilotettava){
        tyyppi = piilotettava;
    }
    
    public T otaPiilosta(){
        Object t = tyyppi;
        tyyppi = null;
        return (T) t;
    }
    
    public boolean onkoPiilossa(){
        if(tyyppi == null){
            return false;
        }
        else{
            return true;
        }
    }
}

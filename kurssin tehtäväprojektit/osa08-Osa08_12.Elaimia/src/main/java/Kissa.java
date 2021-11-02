
public class Kissa extends Elain implements Aanteleva{
    public Kissa(String nimi){
        super(nimi);
    }
    
    public Kissa(){
        super("Koira");
    }
    
    public void mourua(){
        System.out.println(super.getNimi()+ " mouruaa");
    }
    
    
    
    public void aantele(){
        this.mourua();
    }
}

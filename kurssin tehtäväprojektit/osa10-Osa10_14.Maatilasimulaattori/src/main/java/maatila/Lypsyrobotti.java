package maatila;

public class Lypsyrobotti {
    private Maitosailio sailio;
    
    public Lypsyrobotti(){
        sailio = null;
    }
    public void setMaitosailio(Maitosailio maitosailio){
        sailio = maitosailio;
    }
    public Maitosailio getMaitosailio(){
        return sailio;
    }
    public void lypsa(Lypsava lypsava){
        if(sailio==null){
            lypsava.lypsa();
            System.out.println("Maidot menevät hukkaan!");
        }
        else{
            sailio.lisaaSailioon(lypsava.lypsa());
        }
    }
}

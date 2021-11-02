public class Elokuva {
    private String nimi;
    private int ikaraja;
    
    public Elokuva(String elokuvanNimi, int elokuvanIkaraja){
        this.ikaraja = elokuvanIkaraja;
        this.nimi = elokuvanNimi;
    }
    
     public String nimi(){
         return nimi;
     }
     
     public int ikaraja(){
         return ikaraja;
     }
}

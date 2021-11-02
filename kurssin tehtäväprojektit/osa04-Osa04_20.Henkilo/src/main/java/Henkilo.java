
public class Henkilo {
    private String nimi;
    private int ika;
    
    public Henkilo(String nimi){
        this.ika = 0;
        this.nimi = nimi;
    }
    
    public void tulostaHenkilo(){
        System.out.println(nimi+", ikä "+ika+" vuotta");
    }
    
    public void vanhene(){
        ika = ika+1;
    }
    
    public int palautaIka(){
        return ika;
    }
}

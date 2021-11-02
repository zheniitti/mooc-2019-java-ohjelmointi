
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }

    
    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha(this.euroa+lisattava.euroa, this.senttia+lisattava.senttia);
        return uusi;
}   
 
    public boolean vahemman(Raha verrattava){
        if(this.euroa<verrattava.euroa){
            return true;
        }
        if(this.euroa==verrattava.euroa && this.senttia < verrattava.senttia){
            return true;
        }
        return false;
    }
    
    public Raha miinus(Raha vahentaja){
        Raha tämä = new Raha(this.euroa, this.senttia);
        
        if(tämä.vahemman(vahentaja)){
            Raha uusi = new Raha(0,0);
            return uusi;
        }
        
        else if(this.senttia<vahentaja.senttia){
            int uusisentti = this.senttia+100-vahentaja.senttia;
            int uusieuro = this.euroa-1-vahentaja.euroa;
            Raha uusi = new Raha(uusieuro, uusisentti);
            return uusi;
            }
        
        else if(this.senttia>=vahentaja.senttia){
            int uusisentti = this.senttia-vahentaja.senttia;
            int uusieuro = this.euroa-vahentaja.euroa;
            Raha uusi = new Raha(uusieuro, uusisentti);
            return uusi;
        }
       
        return tämä;
        
        }
    
    
    
    }



    


public class VahenevaLaskuri {

    private int arvo;  // oliomuuttuja joka muistaa laskurin arvon
    private int arvoAlussa; 
    public VahenevaLaskuri(int arvoAlussa) {
        this.arvo = arvoAlussa;
        this.arvoAlussa = arvoAlussa;
    }

    public void tulostaArvo() {
        // älä koske tässä olevaan koodiin!
        System.out.println("arvo: " + this.arvo);
    }

    public void vahene() {
        if(arvo>0){
            arvo = arvo-1;
        }
    }

    public void nollaa(){
        arvo=0;
    }
    
    public void palautaAlkuarvo(){
        arvo = arvoAlussa;
    }
}

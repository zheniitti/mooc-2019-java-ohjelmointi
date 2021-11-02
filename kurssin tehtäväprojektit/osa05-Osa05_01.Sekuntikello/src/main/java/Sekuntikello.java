public class Sekuntikello {
    private Viisari sadasosa;
    private Viisari sekunti;
    
    public Sekuntikello(){
        this.sadasosa = new Viisari(100);
        this.sekunti = new Viisari (60);
}
    
    public void etene(){
        this.sadasosa.etene();
        if(this.sadasosa.arvo()==0){
            this.sekunti.etene();
        }
    }
    
    public String toString(){
        return this.sekunti + ":" + this.sadasosa;
    }
}


public class Taikaneliotehdas {
    private int rivi;
    private int sarake;
    private int koko;

    public Taikanelio luoTaikanelio(int koko) {  
        this.koko = koko;        
        Taikanelio nelio = new Taikanelio(this.koko);
        if(koko%2==0){
            return nelio;
        }        
        rivi = 0;
        sarake = koko/2;
        nelio.asetaArvo(rivi, sarake, 1); 
        int i = 0;
        
        for(int a = 2; a <= koko*koko; a++){
            i++;
            if(i==koko){
                this.alas();  
                i = 0;
                               
            }else{
                this.ylos();
                this.oikealle(); 
            }            
            nelio.asetaArvo(rivi, sarake, a);
        }        
        return nelio;
    }
    
    private void alas(){
        this.rivi += 1;
    }
    
    private void ylos(){
        if(this.rivi == 0){ //jos edellinen rivi on ylin rivi,
            this.rivi = this.koko - 1; //niin tämä rivi on alin rivi.
        }
        else{
            this.rivi -= 1;             //muuten tämä rivi on siirtyy ylemmäs.
        }
    }
   
    private void oikealle(){
        if(this.sarake == this.koko -1){ //jos edellinen sarake on viimeinen sarake,
            this.sarake = 0;                //niin tämä sarake on ensimmäinen sarake.
        }
        else{
        this.sarake += 1;                   //muuten tämä sarake on seuraava sarake.
        }
    } 
    

    
}


public class Sailio {
    public int maara;
    public Sailio(){
        this.maara = 0;
    }
    
    public void lisaa(int maara){
        if(maara>0){
            this.maara = this.maara + maara;
            if(this.maara>=100){
                this.maara = 100;}
        }
    }
    
    public void poista(int maara){
        if(maara>0){
                    this.maara = this.maara - maara;
                }
                if(this.maara <0){
                    this.maara = 0;
                }
    }
    
   
    
    public int sisalto(){
        return this.maara;
    }
    
    @Override
    public String toString(){
        return this.sisalto() + "/100";
    }
}

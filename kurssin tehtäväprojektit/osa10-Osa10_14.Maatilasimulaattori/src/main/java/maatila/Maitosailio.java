
package maatila;
import java.lang.Math;

public class Maitosailio {
    private double tilavuus;
    private double saldo;
    
    public Maitosailio(){
        this.tilavuus = 2000.0;
        this.saldo = 0.0;
    }
    
    public Maitosailio(double v){
        this.tilavuus = 1.0*v;
        this.saldo = 0.0;
    }
    
    public double getTilavuus(){
        return this.tilavuus;        
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    public double paljonkoTilaaJaljella(){
        return this.tilavuus - this.saldo;
    }
    
    public void lisaaSailioon(double maara) {
        if(maara<=0.0){
            return;
        }
        if(this.saldo + maara >= this.tilavuus){
            this.saldo = this.tilavuus;
        }
        else{
            this.saldo += maara;
        }
    }
    
    public double otaSailiosta(double maara){
        if(maara<0){
            return 0;
        }
        if(maara >= saldo){
            saldo = 0.0;
            return saldo;
        }else{
            saldo -= maara;
            return maara;
        }
    }
    
    public String toString(){
        return Math.ceil(saldo) + "/" +Math.ceil(tilavuus);
    }
    
}

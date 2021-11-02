
public class Maksukortti {
    private double saldo;

    public Maksukortti(double alkusaldo) {
        this.saldo = alkusaldo;
    }

    public void syoEdullisesti() {
        if(this.saldo>=2.6){
            this.saldo = this.saldo - 2.6;
        }
}

    public void syoMaukkaasti() {
        if(this.saldo>=4.6){
            this.saldo = this.saldo - 4.6;
        }
}
    
    public String toString() {
        return "Kortilla on rahaa " + this.saldo + " euroa";
    }
    
    
    public void lataaRahaa(double rahamaara) {
        int rahaa = 0;
        if(this.saldo<150 && rahamaara>=0){
            
            while(saldo < 150 && rahaa<rahamaara){
            saldo = saldo + 1;
            rahaa = rahaa + 1;
        }
        }
    }

}

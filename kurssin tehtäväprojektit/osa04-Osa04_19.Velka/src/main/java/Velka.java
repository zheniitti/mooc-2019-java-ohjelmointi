public class Velka {
    private double korkokerroin;
    private double saldo;
    
    public Velka(double saldoAlussa, double korkokerroinAlussa){
        this.korkokerroin = korkokerroinAlussa;
        this.saldo = saldoAlussa;
    }
    
     public void tulostaSaldo(){
         System.out.println(saldo);
     }
     
     public void odotaVuosi(){
         saldo =  saldo*korkokerroin;
     }
    
}

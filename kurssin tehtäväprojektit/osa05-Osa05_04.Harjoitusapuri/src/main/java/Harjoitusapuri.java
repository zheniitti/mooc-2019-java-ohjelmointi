
public class Harjoitusapuri {
    private double ikä;
    private int leposyke;
    
    
     public Harjoitusapuri(int ika, int leposyke){
         this.ikä = ika;
         this.leposyke = leposyke;
     }
     
     public double tavoitesyke(double prosenttiaMaksimista){
         return (((206.3 - (0.711 * this.ikä))-this.leposyke)*prosenttiaMaksimista + this.leposyke);
     }
}


public class MuistavaTuotevarasto extends Tuotevarasto{
    private Muutoshistoria historia;
    
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo){ 
            super(tuotenimi, tilavuus);
            super.lisaaVarastoon(alkuSaldo);
            this.historia = new Muutoshistoria();
            this.historia.lisaa(alkuSaldo);
    }
            
              
    public String historia(){        
        return this.historia.toString();
    }
    
    public void lisaaVarastoon(double maara){
        super.lisaaVarastoon(maara);
        this.historia.lisaa(super.getSaldo());
    }
    
    @Override
    public double otaVarastosta(double maara){
        double määrä = super.otaVarastosta(maara);
        this.historia.lisaa(super.getSaldo());
        return määrä;
    }
    
    public void tulostaAnalyysi(){
        System.out.println("Tuote: " + super.getNimi()+ "\nHistoria: " + this.historia + "\n" + 
                "Suurin tuotemäärä: " + this.historia.maxArvo() + "\n" + "Pienin tuotemäärä: " + 
                this.historia.minArvo() + "\n" +"Keskiarvo: " + historia.keskiarvo());
    }
}

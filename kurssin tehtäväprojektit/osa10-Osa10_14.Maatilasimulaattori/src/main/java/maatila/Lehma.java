package maatila;
import java.util.Random;
import java.lang.Math;

public class Lehma implements Eleleva, Lypsava{

    private String nimi; 
    private double V_utareet; 
    private double saldo;
    
    public Lehma(String nimi){
        this.nimi = nimi;
        V_utareet = 15.0 + new Random().nextInt(26);
        saldo = 0.0;
    }
    public Lehma(){
        this.nimi = NIMIA[new Random().nextInt(NIMIA.length)];
        V_utareet = 15.0 + new Random().nextInt(26);
        saldo = 0.0;
    }
    public double lypsa(){
        double maara = saldo;
        saldo = 0.0;
        return Math.ceil(maara);
    }   
    
    public void eleleTunti(){
        double kasvavaMaara = 0.7 + 1.3*(new Random().nextDouble());
        if((saldo+kasvavaMaara) > V_utareet){
            saldo = V_utareet;
        }else{
            saldo = saldo + kasvavaMaara;
        }
    }    
    
    private static final String[] NIMIA = new String[]{
    "Anu", "Arpa", "Essi", "Heluna", "Hely",
    "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
    "Jaana", "Jami", "Jatta", "Laku", "Liekki",
    "Mainikki", "Mella", "Mimmi", "Naatti",
    "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
    "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public String getNimi(){
        return nimi;
    }
    
    public double getTilavuus(){
        return Math.ceil(V_utareet);
    }
    
    public double getMaara(){
        return Math.ceil(saldo);
    }
    
    public String toString(){
        return nimi + " " + Math.ceil(saldo) + "/" + Math.ceil(V_utareet); 
    }
}

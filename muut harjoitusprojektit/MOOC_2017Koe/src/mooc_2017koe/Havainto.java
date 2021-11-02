/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc_2017koe;

/**
 *
 * @author zheny
 */
public class Havainto {
    String muoto;
    String kuvaus;
    String kestoSekunteina;
    Sijainti sijainti;
    Paivamaara paivamaara;
    
    public Havainto(String rivi, Sijainti sij, Paivamaara paiv){
        kestoSekunteina = rivi.split(";")[5].trim();
        sijainti = sij;
        paivamaara = paiv;
        muoto = rivi.split(";")[4];
        kuvaus = rivi.split(";")[8];
    }
    
       // 0.0   0.5  1.0  1.5
   public double getKestoAsDouble(){ //kesto sekunteina
       return Double.valueOf(this.kestoSekunteina);
   }
   
   public int getkestonRyhma(){
       if(this.getKestoAsDouble()>=0 && this.getKestoAsDouble()<=60.0){
           return 1;
       }
       if(this.getKestoAsDouble()>60.0 && this.getKestoAsDouble()<1200.0){
           return 2;
       }
       if(this.getKestoAsDouble()>=1200.0 && this.getKestoAsDouble()<=3600.0){
           return 3;
       }
       return -1;
   }
}

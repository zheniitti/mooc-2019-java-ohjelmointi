/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc18koet3jaakiekkotilastot;

import java.util.Objects;

/**
 *
 * @author zheny
 */
public final class Joukkue {
     private String nimi;
    private int pisteet;
     private int voittoja;
    private int tappioita;
     private int tasapelit;
     
     public Joukkue(String nimi, int omajou, int toinenjou){
        this.nimi = nimi;
        voittoja = 0;
        tappioita = 0;
        tasapelit = 0;
        pisteet = 0;
        lisaa(omajou, toinenjou);
    }

    public String getNimi() {
        return nimi;
    }

    public void lisaa(Joukkue j){
        this.pisteet += j.getPisteet();
        this.tappioita += j.getTappioita();
        this.voittoja += j.getVoittoja();
        this.tasapelit += j.getTasapelit();
    }
    

    public int getPisteet() {
        return pisteet;
    }

    public void setPisteet(int pisteet) {
        this.pisteet = pisteet;
    }

    public int getVoittoja() {
        return voittoja;
    }

    public void setVoittoja(int voittoja) {
        this.voittoja = voittoja;
    }

    public int getTappioita() {
        return tappioita;
    }

    public void setTappioita(int tappioita) {
        this.tappioita = tappioita;
    }

    public int getTasapelit() {
        return tasapelit;
    }

    public void setTasapelit(int tasapelit) {
        this.tasapelit = tasapelit;
    }
    
    
    
    
    public void lisaa(int omajou, int toinenjou){
        if(omajou==toinenjou){
            tasapelit++;
            pisteet++;
        }
        else if(omajou>toinenjou){
            voittoja++;
            pisteet +=3;        
        }
        else{
            tappioita++;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nimi);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Joukkue other = (Joukkue) obj;
        if (!Objects.equals(this.nimi, other.nimi)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    public String toString(){
        String s = this.nimi +"\t\t\t"+ voittoja + "\t" + tappioita+"\t"+ tasapelit +"\t"+ pisteet;
        if(this.nimi.length() >= 4*2){
             s = this.nimi +"\t\t"+ voittoja + "\t" + tappioita+"\t"+ tasapelit +"\t"+ pisteet;            
        }
        if(this.nimi.length() >= 4*3){
             s = this.nimi +"\t"+ voittoja + "\t" + tappioita+"\t"+ tasapelit +"\t"+ pisteet;    
        }
            
        return s;
    }
    
}

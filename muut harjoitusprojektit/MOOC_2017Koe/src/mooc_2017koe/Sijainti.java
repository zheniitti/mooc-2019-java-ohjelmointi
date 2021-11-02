/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc_2017koe;


public class Sijainti {
    String paikka;
    String osavaltio;
    String maa;
    String leveysaste;
    String pituusaste;
    
    public Sijainti(String r){        
        paikka = r.split(";")[1];
        osavaltio = r.split(";")[2];
        maa = r.split(";")[3];
        pituusaste = r.split(";")[6];
        leveysaste = r.split(";")[7];
    }
    
    public double getAsteetAsDouble(String s){
        return Double.valueOf(s);
        
    }
}

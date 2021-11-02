/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc18koe_t4_lippuvaraamo;

import java.util.*;

/**
 *
 * @author zheny
 */
public class Matka {
    private String lahtopaikka;
    private String kohde;
    private int paikkoja;    
    private ArrayList<Lippu> liput;
    
    
    public Matka(String l, String k, int p){
        lahtopaikka = l;
        kohde = k;
        paikkoja = p;
        liput = new ArrayList<>();
    }

    public void varaaLippu(Lippu l){
        if(paikkoja >0){
            
            liput.add(l);
            paikkoja--;
        }
    }
    public ArrayList<Lippu> getLiput(){
        return liput;
    }
    public String toString(){
        
        return lahtopaikka+"-"+kohde+", paikkoja jäljellä: "+paikkoja;
    }
}

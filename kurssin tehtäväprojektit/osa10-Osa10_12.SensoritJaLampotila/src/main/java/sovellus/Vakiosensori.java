/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;

/**
 *
 * @author Zhenyu
 */
public class Vakiosensori implements Sensori{
    private int arvo;
   
    public Vakiosensori(int a){
        this.arvo = a;
        
    }
    public boolean onPaalla(){
        return true;
    }
    
    public void paalle(){
        
    }
    public void poisPaalta(){
        
    }
    public int mittaa(){
        return this.arvo;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sovellus;
import java.util.Random;
public class Lampomittari implements Sensori{
    private int paallako; 
    private int arvo;
    public Lampomittari(){
        paallako = 0;
        
    }
    public int mittaa(){
        if(paallako == 0){
            throw new IllegalStateException();
        }
        this.arvo = (new Random().nextInt(31) - new Random().nextInt(31));
        return this.arvo;
    }
    public void paalle(){
        paallako = 1;
    }
    public void poisPaalta(){
        paallako = 0;
    }
    public boolean onPaalla(){
        if(paallako==1){
            return true;
        }
        return false;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logiikka;
import mooc.ui.Kayttoliittyma;
import mooc.ui.Tekstikayttoliittyma;
/**
 *
 * @author Zhenyu
 */
public class Sovelluslogiikka {
     private Kayttoliittyma li;
    
    public Sovelluslogiikka(Kayttoliittyma kayttoliittyma){
        kayttoliittyma = new Tekstikayttoliittyma();
        li = kayttoliittyma;
    }
    
    public void suorita(int montaKertaa){
        for(int i = 1; i <= montaKertaa; i++){
            System.out.println("Sovelluslogiikka toimii");
            li.paivita();
        }
    }
}

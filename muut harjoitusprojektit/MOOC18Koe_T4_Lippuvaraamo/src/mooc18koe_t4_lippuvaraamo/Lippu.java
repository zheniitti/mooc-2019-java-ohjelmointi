/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc18koe_t4_lippuvaraamo;

/**
 *
 * @author zheny
 */
public class Lippu {

    private Matka matka;
    private String sposti;
    
    public Lippu(Matka m, String sp){
        matka = m;
        sposti = sp;
        
    }

    public String toString(){
        return this.sposti;        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zhenyu
 */
public class Opiskelija extends Henkilo{
    private int piste;
    public Opiskelija(String nimi, String osoite){
        super(nimi, osoite);
        this.piste = 0;
    }
    public void opiskele(){
        this.piste ++;
    }
    
    public int opintopisteita(){
        return this.piste;
    }
    
    public String toString(){
        return super.toString() + "\n  opintopisteitä " + this.opintopisteita();
    }
    
}

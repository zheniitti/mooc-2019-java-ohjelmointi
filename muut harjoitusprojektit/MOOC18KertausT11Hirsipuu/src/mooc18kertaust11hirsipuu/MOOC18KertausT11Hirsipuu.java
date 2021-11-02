/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc18kertaust11hirsipuu;

/**
 *
 * @author zheny
 */
import java.util.*;
public class MOOC18KertausT11Hirsipuu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Sanalista s = new Sanalista(Arrays.asList("yksi", "kaksi", "kolme",
                "neljä", "viisi", "kuusi", "seitsemän", "kahdeksan", "yhdeksän", "kymmenen") );
        
        Hirsipuu peli = new Hirsipuu(s, 5);
        
        while(peli.arvaustajaljella>0 ){
            System.out.println("Sinulla on "+ peli.arvaustajaljella+" arvausta jäljellä.");
            System.out.println("Olet käyttänyt merkit: " + peli.kaytetyt);
            System.out.println(peli.sana());
            System.out.print("Arvaus: ");
            
            
            
            if(!peli.onLoppu()){
                String arvaus = lukija.nextLine();
                while(arvaus.isEmpty() ){
                    System.out.print("Syötä kelvollinen: ");
                    arvaus = lukija.nextLine();
                }
                Character c = arvaus.charAt(0);if(peli.arvaa(c)){
                        System.out.println("Löytyi ainakin yksi "+c+" kirjain.");
                }
                else{
                    System.out.println("Ei "+c+" kirjaimia.");
                }                
            }    
            else{
                break;
            }
        }
        
        if(peli.onLoppu()){
            System.out.println("Hienoa! Voitit pelin!");
        }
        else{
            System.out.println("Parempaa onnea ensi kerralla!\n" +
                            "Sana oli: " + peli.oikeaSana());        
        }

    }
    
}

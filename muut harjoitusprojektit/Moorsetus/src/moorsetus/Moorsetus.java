/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moorsetus;
import java.util.*;
/**
 *
 * @author zheny
 */
public class Moorsetus {

    
    public static void main(String[] args) {
        System.out.println("Sana: ");
        String sana = new Scanner(System.in).nextLine().toLowerCase();
        
        for(int i =0; i<sana.length(); i++ ){
            System.out.println(käännös().get(sana.charAt(i)+""));
        }
    }
    
    public static HashMap<String, String> käännös(){
        String data =   "A . _\n" +
                        "B _ . . .\n" +
                        "C _ . _ .\n" +
                        "D _ . .\n" +
                        "E .\n" +
                        "F . . _ .\n" +
                        "G _ _ .\n" +
                        "H . . . .\n" +
                        "I . .\n" +
                        "J . _ _ _\n" +
                        "K _ . _\n" +
                        "L . _ . .\n" +
                        "M _ _\n" +
                        "N _ .\n" +
                        "O _ _ _\n" +
                        "P . _ _ .\n" +
                        "Q _ _ . _\n" +
                        "R . _ .\n" +
                        "S . . .\n" +
                        "T _\n" +
                        "U . . _\n" +
                        "V . . . _\n" +
                        "w . _ _\n" +
                        "X _ . . _\n" +
                        "Y _ . _ _\n" +
                        "Z _ _ . .\n" +
                        "Å . -";
        String[] parit = data.split("\n");
        HashMap<String, String> map = new HashMap();
        for(int i=0; i<parit.length; i++){
            String norm = parit[i].charAt(0)+"";
            String mo = parit[i].replace(" ", "").substring(1);
            
            map.put(norm.toLowerCase(), mo);
        }
        return map;
    }
    
}

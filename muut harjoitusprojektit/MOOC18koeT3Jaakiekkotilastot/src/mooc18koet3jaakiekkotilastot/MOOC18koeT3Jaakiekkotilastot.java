/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc18koet3jaakiekkotilastot;
import java.io.File;
import java.util.*;
/**
 *
 * @author zheny
 */
public class MOOC18koeT3Jaakiekkotilastot {

    /**
     * @param args the command line arguments
     */        // TODO code application logic here

    public static void main(String[] args) {
        
        

        System.out.print("Syötä tiedoston nimi(tai enter) -> ");
        String tiedosto = new Scanner(System.in).nextLine();
        
        
        try(Scanner lukija = new Scanner(new File("data.txt"))){
            
            ArrayList<Joukkue> joukkueet = new ArrayList();
            
            while(lukija.hasNextLine()){
                String[] palat = lukija.nextLine().split(";");
                String nimi1 = palat[0];
                String nimi2 = palat[1];
                int p1 = Integer.valueOf(palat[2]);
                int p2 = Integer.valueOf(palat[3]);
                
                Joukkue j1 = new Joukkue(nimi1, p1, p2);
                Joukkue j2 = new Joukkue(nimi2, p2, p1);
                
                if(joukkueet.contains(j1)){
                    joukkueet.get(joukkueet.indexOf(j1)).lisaa(j1);
                }
                else{
                    joukkueet.add(j1);
                }
                if(joukkueet.contains(j2)){
                    joukkueet.get(joukkueet.indexOf(j2)).lisaa(j2);
                }
                else{
                    joukkueet.add(j2);
                }
                
                
            }   
            
            
            //tulostetaan joukkueet
            joukkueet.stream().sorted((j1, j2)-> j1.getNimi().compareTo(j2.getNimi()))
                    .forEach(j -> System.out.println(j.getNimi()));
            
            
            System.out.println("");
            //tulostetaan sarjataulukko
            System.out.println("Sarjataulukkko");
            joukkueet.stream().sorted((j1, j2) -> {
                if(j1.getPisteet() == j2.getPisteet()){
                    return j1.getNimi().compareTo(j2.getNimi());
                }
                return j2.getPisteet() - j1.getPisteet();
            })
                    .forEach(j -> System.out.println(j.getNimi()) );
            
        }
        
        catch(Exception e){
            System.out.println("Virhe: " + e);
        }
        
    }
    
    
    
}

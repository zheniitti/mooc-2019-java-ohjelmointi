
package sanakirja;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;

public class MuistavaSanakirja {
    private HashMap<String, String> sanakirja;
    private HashMap<String, String> sanakirjaKaannosToiseenSuuntaan;
    private String tiedosto;
    
    public MuistavaSanakirja(String t){
        sanakirja = new HashMap<>();
        sanakirjaKaannosToiseenSuuntaan = new HashMap<>();
        tiedosto = t;        
    }
    
    public MuistavaSanakirja(){
        sanakirja = new HashMap<>();
        sanakirjaKaannosToiseenSuuntaan = new HashMap<>();
                
    }
    
    public boolean lataa(){
        try(Scanner skan = new Scanner(new File(tiedosto))){            
            
            while(skan.hasNextLine()){
                
                String[] rivi= skan.nextLine().split(":");
                if(rivi.length==2 && !rivi[0].isEmpty() && !rivi[1].isEmpty()){
                    String sana = rivi[0].trim();
                    String kaannos = rivi[1].trim();
                    sanakirja.putIfAbsent(sana, kaannos);
                    sanakirjaKaannosToiseenSuuntaan.putIfAbsent(kaannos, sana);
                }                
            }
            return true;
            
        }catch (Exception e) {
        System.out.println("Virhe lataamisessa: " + e.getMessage());
        return false;
            }        
    }
    
    public boolean tallenna(){
        try {
            PrintWriter kirjoittaja = new PrintWriter(tiedosto); 
            ArrayList<String> rivit = new ArrayList<>();
            
            sanakirja.forEach((key,value)-> rivit.add(key+":"+value));  
            for(int i=0; (i<rivit.size()-1)&&rivit.size()>0; i++){
                kirjoittaja.println(rivit.get(i));
            }
            if(rivit.size()>0){
                kirjoittaja.print(rivit.get(rivit.size()-1));
            }
            kirjoittaja.close();
            
        }                
        catch(IOException ex){
            System.out.println("Virhe tallennuksessa:" + ex.getMessage());
            return false;
        }                        
        return true;
    }
    
    public void poista(String sana){
        String kaannos = "";
        if(sanakirja.containsKey(sana)){
            kaannos = sanakirja.get(sana);
            sanakirjaKaannosToiseenSuuntaan.remove(kaannos);
            sanakirja.remove(sana);
        }   
        else if(sanakirjaKaannosToiseenSuuntaan.containsKey(sana)){
            kaannos = sanakirjaKaannosToiseenSuuntaan.get(sana);
            sanakirja.remove(kaannos);
            sanakirjaKaannosToiseenSuuntaan.remove(sana);
        }
    }
    
    public void lisaa(String sana, String kaannos){
        sanakirja.putIfAbsent(sana, kaannos);
        sanakirjaKaannosToiseenSuuntaan.putIfAbsent(kaannos, sana);
    }
    
    public String kaanna(String sana){
        if(sanakirja.containsKey(sana)){
            return sanakirja.get(sana);
        }
        if(sanakirjaKaannosToiseenSuuntaan.containsKey(sana)){
            return sanakirjaKaannosToiseenSuuntaan.get(sana);
        }
        return null;
    }
    
    public void tulostaSanat(){
        if(!(sanakirja.isEmpty()&& sanakirjaKaannosToiseenSuuntaan.isEmpty())){                    
            System.out.println("");
            System.out.println("tulostetaan sanat:");
            sanakirja.forEach((k,v)-> System.out.println(k+"-"+v));
            System.out.println("|");
            sanakirjaKaannosToiseenSuuntaan.forEach((k,v)-> System.out.println(k+"-"+v));
            System.out.println("loppu\n");    
        }
        else{
            System.out.println("\nSanakirja on tyhjä.\n");
        }
    }
}

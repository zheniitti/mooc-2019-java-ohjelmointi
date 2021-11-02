import java.util.HashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class Reseptihaku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        
        System.out.println("Mitä luetaan?"); 
        String luettuTiedosto = lukija.nextLine();
        if(luettuTiedosto.equals("")){
            luettuTiedosto="reseptit.txt";
        }
        ArrayList<String> tiedostoListana = new ArrayList<>();
        LinkedHashMap<String, ArrayList> ruoat = new LinkedHashMap<>();
        
        try (Scanner tiedostonLukija = new Scanner(new File(luettuTiedosto))) {

            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                tiedostoListana.add(rivi);
            }
        } catch (Exception e) {
            System.out.println("Tiedoston lukeminen epäonnstui :(");
        }
        
        
        //listaa...
        
        int i = 0;
        while(i<tiedostoListana.size()){
            ArrayList <String> tiedotMappiin = new ArrayList<>();            
            if(tiedostoListana.get(i).equals("") || tiedostoListana.get(i).isEmpty() || tiedostoListana.get(i).equals(" ")){
                i++; 
                continue;
            }
            
            String ruoka = tiedostoListana.get((i)); 
            tiedotMappiin.add(tiedostoListana.get(i+1)); //lisätään aika listaan 
            i = i + 2;
            tiedotMappiin.add(tiedostoListana.get(i)); // lisätään ensimmäinen ruokaaine 
            i++; 
            
            if(i>=tiedostoListana.size()){            // jos lista loppuu, lisätään ruoka ja tiedot hashmappiin, ja lopetetaan looppi;
                ruoat.put(ruoka, tiedotMappiin);
                break;
                }   

                    // jos lista ei loppunut ja seuraava rivi ei ole tyhjä; lisätään seuraavat ruokaaineet
                    while(!(tiedostoListana.get(i).equals(" ") || tiedostoListana.get(i).isEmpty() || tiedostoListana.get(i).equals(""))){
                        tiedotMappiin.add(tiedostoListana.get(i)); //lisätään loput ruokaineet
                        i++;
                        if(i>=tiedostoListana.size()){
                            break;
                        }
                        if(tiedostoListana.get(i).equals("") || tiedostoListana.get(i).isEmpty() || tiedostoListana.get(i).equals(" ")){
                            break;
                        }

                    }

            ruoat.put(ruoka, tiedotMappiin);    // lisätään ruoka ja sen tiedot hashmappiin
                             
            
            }
               
        System.out.println(tiedostoListana); System.out.println("");System.out.println(ruoat);
        while(true){
            System.out.println("Syötä komento: ");
            String komento = lukija.nextLine();
            
            if(komento.equals("lopeta")){
            break;
            }
            
            if(komento.equals("listaa")){
                System.out.println("Reseptit:");
                for(String ruoka: ruoat.keySet()){
                System.out.println(ruoka+", keittoaika: "+ ruoat.get(ruoka).get(0));
                }   
                    
            }

            if(komento.equals("hae nimi")){
                System.out.println("Mitä haetaan?"); String haettava = lukija.nextLine();
                haettava.toLowerCase().trim();
                System.out.println("Reseptit:");
                for(String ruoka : ruoat.keySet()){
                    ruoka.toLowerCase().trim();
                    if(ruoka.contains(haettava)){                        
                        System.out.println(ruoka+", keittoaika: "+ ruoat.get(ruoka).get(0));
                    }
                }
            }
            
            
            if(komento.equals("hae aine")){
                System.out.println("Mitä raaka-ainetta haetaan:"); String aine = lukija.nextLine();
                aine = aine.toLowerCase().trim();
                System.out.println("Reseptit:");
                for(String ruoka : ruoat.keySet()){
                    ArrayList<String> tiedot = ruoat.get(ruoka);
                    for(String rivi: tiedot){
                        rivi.trim().toLowerCase();
                        if(rivi.equals(aine)){
                        System.out.println(ruoka+", keittoaika: "+ ruoat.get(ruoka).get(0));
                    }
                        
                }}
            }
            
            
            if(komento.equals("hae keittoaika")){
                System.out.println("Keittoaika korkeintaan:"); 
                String syöte = lukija.nextLine(); 
                syöte.trim(); 
                if(isNumeric(syöte)){
                    int max = Integer.valueOf(syöte);
                    System.out.println("Reseptit:");
                    for(String ruoka : ruoat.keySet()){
                        ArrayList<String> tiedot = ruoat.get(ruoka);
                        int aika = Integer.valueOf(tiedot.get(0));
                        if(aika<=max){

                            System.out.println(ruoka+", keittoaika: "+ ruoat.get(ruoka).get(0));
                        }
                    }
            }
            }

        }

    }
   
    
    


public static boolean isNumeric(String str)  
{  
  try  
  {  
    int d = Integer.parseInt(str);  
  }  
  catch(NumberFormatException nfe)  
  {  
    return false;  
  }  
  return true;  
}

}

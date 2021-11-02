
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList nimet = new ArrayList<>();
        
        int indeksi = -1;
        int lukumäärä = 0;
        int ikiensumma = 0;
        int nimenpituus = 0;   
            
        while(true){
            String syöte = lukija.nextLine();
            
            
            if(!(syöte.equals(""))){
                String[] taulukko = syöte.split(",");
                nimet.add(taulukko[0]);
            
                ikiensumma = ikiensumma + Integer.valueOf(taulukko[1]);
                lukumäärä++;
            
             if (nimenpituus<=taulukko[0].length()){
                nimenpituus = taulukko[0].length();
                indeksi ++;
            }}
             
             
             
            if(syöte.equals("")){
                break;
             }
        }
        
        if(nimet.size()!=0){
            System.out.println("Pisin nimi: "+ nimet.get(indeksi));
            System.out.println("Syntymävuosien keskiarvo: "+ 1.0*ikiensumma/lukumäärä);
        }
        }
       
    
}

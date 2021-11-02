
import java.util.Scanner;

public class Nestesailiot {

    public static void main(String[] args) {
        
        Scanner lukija = new Scanner(System.in);
        int ensimmainen = 0;
        int toinen = 0;

        while (true) {
            System.out.println("");
            System.out.println("Ensimmäinen: "+ ensimmainen + "/100");
            System.out.println("Toinen: "+ toinen +"/100");
            
            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            
            String[] osat = luettu.split(" ");

            String komento = osat[0];
            int maara = Integer.valueOf(osat[1]);
            
            
            
            if(komento.equals("lisaa")){
                if(maara>0){
                    ensimmainen = ensimmainen + maara;
                    if(ensimmainen>=100){
                        ensimmainen = 100;
                    }
                }
            }
            
            if(komento.equals("siirra")){
                if(maara>0 && maara <= ensimmainen){
                    toinen = toinen + maara;
                    ensimmainen = ensimmainen - maara;
                    if(toinen >= 100){
                    toinen = 100;
                }
                }
                else if(maara>=ensimmainen){
                    toinen = toinen + ensimmainen;
                    if(toinen >= 100){
                    toinen = 100;
                    
                }
                    ensimmainen = 0;
                }
            }
            
            if(komento.equals("poista")){
                if(maara>0){
                    toinen = toinen - maara;
                }
                if(toinen <0){
                    toinen = 0;
                }
            }

        }
        
        
    }

}

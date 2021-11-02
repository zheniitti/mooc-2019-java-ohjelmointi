
import java.util.Scanner;

public class NestesailiotOlioilla {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Sailio ensimmainen = new Sailio();
        Sailio toinen = new Sailio();

        while (true) {
            System.out.println("");
            System.out.println("Ensimmäinen: "+ ensimmainen);
            System.out.println("Toinen: "+ toinen);
            
            String luettu = lukija.nextLine();
            if (luettu.equals("lopeta")) {
                break;
            }
            String[] osat = luettu.split(" ");
            if(osat.length==1 && !(luettu.equals("lopeta") || luettu.equals("lisaa")  || luettu.equals("poista") || luettu.equals("siirra"))){
                System.out.println("Tuntematon komento"); continue;
            }
            
            
            String komento = osat[0];
            
            
            int maara = Integer.valueOf(osat[1]);
            
            
            
            
            if(komento.equals("lisaa")){
                ensimmainen.lisaa(maara);
                
            }
            
            if(komento.equals("poista")){
                toinen.poista(maara);
                
            }
            
            if(komento.equals("siirra")){
                
                if(maara>=0 && maara <= ensimmainen.sisalto()){
                    toinen.lisaa(maara);
                    ensimmainen.poista(maara);
                    
                }
                
                else if(maara >= ensimmainen.sisalto()){
                    toinen.lisaa(ensimmainen.sisalto());
                    ensimmainen.poista(ensimmainen.sisalto());
                }
                
                if(toinen.sisalto() >= 100){
                    toinen.maara = 100;
                }
            }

        }
    }

}

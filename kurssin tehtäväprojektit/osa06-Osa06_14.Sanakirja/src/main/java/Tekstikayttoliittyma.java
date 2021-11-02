import java.util.Scanner;
public class Tekstikayttoliittyma {
    private Scanner lukija;
    private Sanakirja sanakirja;
    
    public Tekstikayttoliittyma(Scanner lukija, Sanakirja sanakirja){
        this.lukija = lukija;
        this.sanakirja = sanakirja;
    }
    
    public void kaynnista(){
        while(true){
            System.out.println("Komento: ");
            String komento = this.lukija.nextLine();
            if(komento.equals("lopeta")){
                System.out.println("Hei hei!");
                break;
            }
            if(komento.equals("lisaa")){
                System.out.println("Suomeksi: ");
                String suomeksi = lukija.nextLine();
                System.out.println("Käännös: ");
                String kaannos = lukija.nextLine();
                sanakirja.lisaa(suomeksi, kaannos);
                continue;
            }
            
            if(komento.equals("kaanna")){
                System.out.println("Anna sana: ");
                String sana = lukija.nextLine();
                System.out.println("Käännös: " + sanakirja.kaanna(sana));
                continue;
            }
            else{
                System.out.println("Tuntematon komento.");
            }
        
        }
    }
        
}

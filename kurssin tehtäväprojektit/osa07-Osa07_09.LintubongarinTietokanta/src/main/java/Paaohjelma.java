import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Paaohjelma {

    public static void main(String[] args) {
        // HUOM! Älä luo ohjelmassa muita Scanner-olioita. Jos ja toivottavasti
        // kun teet muita luokkia, anna allaoleva Scanner-olio niille
        // tarvittaessa parametrina.

        Scanner lukija = new Scanner(System.in);
        ArrayList<Lintu> linnut = new ArrayList<>();
        
        while(true){
            System.out.println("?");
            String komento = lukija.nextLine();
            if(komento.equals("Lopeta")){
                break;
            }
            
            if(komento.equals("Lisaa")){
                System.out.println("Nimi:"); String nimi = lukija.nextLine();
                System.out.println("Latinankielinen nimi:"); String lnimi = lukija.nextLine();
                Lintu lintu = new Lintu(nimi, lnimi); linnut.add(lintu);
                
            }
            
            if(komento.equals("Havainto")){
                System.out.println("Mikä havaittu?"); String havaittulintu = lukija.nextLine();
                int i = 0;
                for ( Lintu lintu: linnut){
                    if(lintu.getNimi().trim().toLowerCase().equals(havaittulintu.trim().toLowerCase())){
                        lintu.lisaaHavainto();
                        i++;
                    }
                }
                if(i==0){
                    System.out.println("Ei ole lintu!");
                }
            }
            
            if(komento.equals("Tilasto")){
                for (Lintu lintu: linnut){
                    System.out.println(lintu + " havaintoa");
                }
            }
            
            if(komento.equals("Nayta")){
                System.out.println("Mikä?"); String mikälintu = lukija.nextLine();
                for(Lintu lintu: linnut){
                    if(lintu.getNimi().trim().toLowerCase().equals(mikälintu.trim().toLowerCase())){
                        System.out.println(lintu + " havaintoa");
                }
            }
            
        }

    }

}
}
    

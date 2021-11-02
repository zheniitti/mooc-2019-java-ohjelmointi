import java.util.ArrayList;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Pisteet pistelista = new Pisteet();
        System.out.println("Syötä yhteispisteet, -1 lopettaa:");
        
        while(true){
            int piste = Integer.valueOf(lukija.nextLine());
            if(piste == -1){
                break;
            }
            pistelista.lisaa(piste);
        }
        System.out.println(pistelista.ka()); 
        System.out.println(pistelista.hyvaksyttyjenKA());
        System.out.println(pistelista.hyvaksymisprosentti());
        pistelista.tulostaJakauma();
        
    }
    
    
}

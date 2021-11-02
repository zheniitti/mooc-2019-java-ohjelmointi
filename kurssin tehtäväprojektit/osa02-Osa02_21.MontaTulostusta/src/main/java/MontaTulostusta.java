
import java.util.Scanner;

public class MontaTulostusta {

    public static void main(String[] args) {
        System.out.println("Kuinka monta?");// kysy käyttäjältä, montako kertaa teksti tulostetaan
        // kutsu metodia tulostaTeksti while-komennon avulla useita kertoja
        Scanner lukija = new Scanner(System.in);
        int määrä=Integer.valueOf(lukija.nextLine());
        int mones=0;
        while(mones<määrä){
            tulostaTeksti();
            mones++;
        }
    }
    
    // HUOM: älä muuta metodin määrittelevää eli seuraavaa riviä!
    // (tässä tehtävässä ei ole vielä tarkoitus laittaa metodille parametria)
    public static void tulostaTeksti() {
        System.out.println("Alussa olivat suo, kuokka ja Java.");// kirjoita koodia tähän
    }
}

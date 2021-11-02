
import java.util.Scanner;

public class NimenPituus {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna nimi:"); String nimi = lukija.nextLine();
        int määrä = laskeKirjaimet(nimi);
        System.out.println("Kirjainmäärä: "+määrä);
    }
     public static int laskeKirjaimet(String merkkijono){
         int määrä = merkkijono.length();
         return määrä;
         }
     
    
    
}

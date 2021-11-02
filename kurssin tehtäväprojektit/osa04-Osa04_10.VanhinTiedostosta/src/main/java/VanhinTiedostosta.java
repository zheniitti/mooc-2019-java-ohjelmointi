
import java.io.File;
import java.util.Scanner;

public class VanhinTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mikä tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        int vanhinikä = -1;
        String vanhinhenkilö = "";
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {
            while( tiedostonLukija.hasNextLine()){
                String rivi = tiedostonLukija.nextLine();
                String[] taulukkoOsista = rivi.split(",");
                int ikä = Integer.valueOf(taulukkoOsista[1]);
                String nimi = taulukkoOsista[0];
                if(ikä >= vanhinikä){
                    vanhinhenkilö = nimi;
                    vanhinikä = ikä;
                }
                
            }
            
        }catch (Exception e) {
    System.out.println("Virhe: " + e.getMessage());
        }
        System.out.println("Vanhin oli:"+vanhinhenkilö);
    }
}

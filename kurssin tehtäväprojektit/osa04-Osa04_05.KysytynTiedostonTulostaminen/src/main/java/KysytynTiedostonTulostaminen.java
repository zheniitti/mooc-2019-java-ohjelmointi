
import java.io.File;
import java.util.Scanner;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä tiedoston sisältö tulostetaan?");
        String tiedosto = lukija.nextLine();
        try (Scanner tiedostonlukija = new Scanner(new File(tiedosto))){
            while (tiedostonlukija.hasNextLine()){
                String rivi = tiedostonlukija.nextLine();
                System.out.println(rivi);
            }
        }
        catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
    }
}
}

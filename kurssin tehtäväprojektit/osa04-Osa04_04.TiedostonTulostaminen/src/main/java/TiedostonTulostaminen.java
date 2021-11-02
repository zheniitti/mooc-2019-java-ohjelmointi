
import java.io.File;
import java.util.Scanner;

public class TiedostonTulostaminen {

    public static void main(String[] args) {
        try (Scanner tlukija = new Scanner(new File(data.txt))){
            while (tlukija.hasNextLine()) {
        String rivi = tlukija.nextLine();
        System.out.println(rivi);
    }
} 
        catch (Exception e) {
    System.out.println("Virhe: " + e.getMessage());
        }

    }
}

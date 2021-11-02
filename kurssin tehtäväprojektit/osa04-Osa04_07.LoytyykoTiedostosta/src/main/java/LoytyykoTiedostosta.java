
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();
        
        ArrayList<String> lista = new ArrayList<>();
        
        try(Scanner tietosdonlukija = new Scanner(new File(tiedosto))){
            while(tietosdonlukija.hasNextLine()){
                lista.add(tietosdonlukija.nextLine());      
            }
        } 
        catch (Exception e){
                    System.out.println("Tiedoston olematon.txt lukeminen epäonnistui.");
                    }
        
        if (lista.contains(etsittava)) {
                System.out.println("Löytyi!");
            }
        if(!(lista.contains(etsittava))&&tiedosto.equals("nimet.txt")||tiedosto.equals("toiset-nimet.txt")) {
                System.out.println("Ei löytynyt.");
            }
        
    }
}

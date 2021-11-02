
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while(true){
            System.out.println("Nimi: ");
            String nimi = lukija.nextLine();
            if(nimi.equals("")){
                break;
            }
            System.out.println("Pituus: ");
            int pituus = Integer.valueOf(lukija.nextLine());
            TelevisioOhjelma ohjelma = new TelevisioOhjelma(nimi, pituus);
            ohjelmat.add(ohjelma);
            
        }
        System.out.println("Ohjelman maksimipituus?");
        int maksimipituus = Integer.valueOf(lukija.nextLine());
        for(TelevisioOhjelma xohjelma: ohjelmat){
            int xohjelmanpituus = xohjelma.getPituus();
            String xohjelmannimi = xohjelma.getNimi();
            if(xohjelmanpituus<= maksimipituus){
            System.out.println( xohjelmannimi + ", "+ xohjelmanpituus+" mituuttia");
            System.out.println("");
            }
        }
    }
}

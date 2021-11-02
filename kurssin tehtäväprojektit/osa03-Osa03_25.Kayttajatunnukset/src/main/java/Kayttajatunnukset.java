
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna tunnus:"); 
        String tunnus = lukija.nextLine();
        if(tunnus.equals("aleksi")){
            System.out.println("Anna salasana:");
            String salasana = lukija.nextLine();
            if(salasana.equals("tappara")){
                System.out.println("Olet kirjautunut järjestelmään");
            }else System.out.println("Virheellinen tunnus tai salasana!");
        }
        if(tunnus.equals("elina")){
            System.out.println("Anna salasana:");
            String salasana = lukija.nextLine();
            if(salasana.equals("kissa")){
                System.out.println("Olet kirjautunut järjestelmään");
            }else System.out.println("Virheellinen tunnus tai salasana!");
        }
        if(!tunnus.equals("aleksi") && !tunnus.equals("elina")){
            System.out.println("Anna salasana:");
            String salasana = lukija.nextLine();
            System.out.println("Virheellinen tunnus tai salasana!");
        }
    }
}


import java.util.Scanner;

public class OnkoTotta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Kirjoita merkkijono:");
        String sana = lukija.nextLine();
        if(sana.equals("totta")){
            System.out.println("Oikein meni!");
        }else {
            System.out.println("Koitappa uudelleen!");
        }
    }
}

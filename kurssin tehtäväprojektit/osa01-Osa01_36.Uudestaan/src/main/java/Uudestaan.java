
import java.util.Scanner;

public class Uudestaan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            System.out.println("Syötä luku");
            String syote = lukija.nextLine();
            if (syote.equals("4")){
                break;
            }
        }
    }
}

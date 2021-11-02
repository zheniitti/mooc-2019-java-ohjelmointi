
import java.util.Scanner;

public class LukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int määrä = 0;
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku==0){
                break;
            }
            if (luku!=0){
             määrä = määrä+1;
        }
        }
        System.out.println("Lukuja yhteensä "+määrä);
    }
}

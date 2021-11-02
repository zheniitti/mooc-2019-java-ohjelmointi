
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int määrä = 0;
        while (true){
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku==0){
                break;
            }
            if (luku!=0){
                summa=summa+luku;
                määrä=määrä+1;
            }
            
        }
        double ka = 1.0*summa/määrä;
        System.out.println("Lukujen keskiarvo "+ka);
        
    }
}

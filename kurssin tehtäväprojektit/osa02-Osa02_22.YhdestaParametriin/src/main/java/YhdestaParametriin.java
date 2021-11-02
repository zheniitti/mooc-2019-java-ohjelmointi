
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int määrä=Integer.valueOf(lukija.nextLine());
        tulostaLukuunAsti(määrä);
        
    }
    public static void tulostaLukuunAsti(int määrä){
        int mones=1;
        while(mones<=määrä){
            System.out.println(mones);
            mones++;
        }
    }

}

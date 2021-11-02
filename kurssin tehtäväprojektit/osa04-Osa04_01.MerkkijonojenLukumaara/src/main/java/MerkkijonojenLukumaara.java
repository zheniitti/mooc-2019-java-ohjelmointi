
import java.util.ArrayList;
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int määrä = 0;
        while(true){
            String syöte = lukija.nextLine();
            if(syöte.equals("loppu")){
                break;
            }
            määrä++;
        }
        System.out.println(määrä);
    }
}


import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
       int määrä=0;
        while (true){
            String syöte=lukija.nextLine();
            
            if(syöte.equals("loppu")){                
                 break;
            }
           määrä = määrä+1;
        }
        System.out.println(määrä);
    }
}

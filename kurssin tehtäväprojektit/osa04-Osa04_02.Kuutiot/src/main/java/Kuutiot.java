
import java.util.Scanner;

public class Kuutiot {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while(true){
            String syöte = lukija.nextLine();
            if(syöte.equals("loppu")){
                break;
            }
            int luku = Integer.valueOf(syöte);
            int kuutio = luku*luku*luku;
            System.out.println(kuutio);
                    
        }
    }
}

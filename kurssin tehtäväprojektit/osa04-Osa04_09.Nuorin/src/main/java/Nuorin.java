
import java.util.Scanner;

public class Nuorin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int nuorin = 200;
        String nuorinnimi = "";
        
        while(true){
        String nimijaikä = lukija.nextLine();
        
        if(nimijaikä.equals("loppu")){
            break;
        }
        
        String[] osat = nimijaikä.split(",");
        String nimi = osat[0];
        int ikä = Integer.valueOf(osat[1]);
        
        if(ikä<=nuorin){
            nuorin = ikä;
            nuorinnimi = nimi;
        }
      
        
        
        }
        
        System.out.println("Nuorin oli: " + nuorinnimi);
    
}
}


import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int pluvut=0;
        int summa=0;
        while(true){
            int luku=Integer.valueOf(lukija.nextLine());
            
            if(luku==0){
                break;
            }
            
            if(luku>0){
                pluvut=pluvut+1;
                summa=summa+luku;
            }
            
            }
        if (pluvut==0){
                System.out.println("keskiarvon laskeminen ei ole mahdollista");
                
        }
        System.out.println(1.0*summa/pluvut);
        
                
    }
}

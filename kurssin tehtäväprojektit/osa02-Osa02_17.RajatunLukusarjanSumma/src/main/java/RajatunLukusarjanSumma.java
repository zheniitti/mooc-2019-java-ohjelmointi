
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int eka=Integer.valueOf(lukija.nextLine());
        int toka=Integer.valueOf(lukija.nextLine());
        int summa=0;
        
        while(eka<=toka){ 
            
            summa=summa+eka;
            eka=eka+1;
            if(eka>toka){
            break;
            }
            
            
        }
        System.out.println(summa);
    }
}

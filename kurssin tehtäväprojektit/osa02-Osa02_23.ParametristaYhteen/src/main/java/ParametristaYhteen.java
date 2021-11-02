
import java.util.Scanner;

public class ParametristaYhteen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int määrä=Integer.valueOf(lukija.nextLine());
        
        tulostaLuvustaYhteen(määrä);
    }
    public static void tulostaLuvustaYhteen(int määrä){
        int i=1;
        while(true){
            System.out.println(määrä);
            määrä--;
            if(i>määrä){
                break;
            }
        }
    }
    
    

}

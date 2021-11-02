
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mihin asti?");
        
        int asti = Integer.valueOf(lukija.nextLine());
        int summa=1;
        int määrä=1;
        
        while(määrä<=asti){
            
            määrä++;
            summa=määrä+summa;
            if(määrä==asti){
                break;
            }
            
        }
        System.out.println(summa);
        
    }
}

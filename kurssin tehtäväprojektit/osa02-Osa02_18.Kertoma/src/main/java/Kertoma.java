
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna luku:"); 
        int asti = Integer.valueOf(lukija.nextLine());
        int kertoma =1 ;
        int määrä=1;
        while(määrä<=asti){
            kertoma=kertoma*määrä;
            määrä++;
            if(määrä>asti){
                break;
            }
        }
        System.out.println("Kertoma on " + kertoma);
    }
}


import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // KIRJOITA OHJELMASI TÄNNE
        System.out.println("Mihin asti?");
        int asti=Integer.valueOf(lukija.nextLine());
        System.out.println("Mistä lähtien?");
        int lähtien=Integer.valueOf(lukija.nextLine());
        int arvo=1;
        while(lähtien<=asti){
            System.out.println(lähtien);
            lähtien++;
            
        }
        if(asti<lähtien){
                
                }
    }
}

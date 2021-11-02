
import java.util.Scanner;

public class IanTarkistus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Kuinka vanha olet?");
        int ikä=Integer.valueOf(lukija.nextLine());
        if(ikä>-1 && ikä <121){
            System.out.println("OK");
        }else{
            System.out.println("Mahdotonta!");
        }
        
    }
}


import java.util.Scanner;

public class LukujenSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int summa=0;
        while(true){
            int luku=Integer.valueOf(lukija.nextLine());
            summa=luku+summa;
            if(luku==0){
                break;
            }
            
        }
        System.out.println(summa);
    }
}

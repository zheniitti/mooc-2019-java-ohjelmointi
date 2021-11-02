
import java.util.Scanner;

public class KolmellaJaolliset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku1= Integer.valueOf(lukija.nextLine());
        int luku2= Integer.valueOf(lukija.nextLine());
        kolmellaJaollisetValilta(luku1, luku2);
    }
    public static void kolmellaJaollisetValilta(int luku1, int luku2){
        while(luku1<=luku2){
            
            if(luku1%3==0){
                
                System.out.println(luku1);
            }
            luku1++;
        }
        while(luku1>luku2){
            if(luku1%3==0){
                System.out.println(luku1);
                
            }
            luku1--;
        }
    }

}

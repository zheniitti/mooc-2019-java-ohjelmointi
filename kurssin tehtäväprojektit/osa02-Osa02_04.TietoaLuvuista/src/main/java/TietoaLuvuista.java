
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = Integer.valueOf(lukija.nextLine());
        int luku2 = Integer.valueOf(lukija.nextLine());
        if (luku>luku2){
            System.out.println("Luku "+luku+" on suurempi kuin luku "+luku2+".");
        }
        if (luku<luku2){
            System.out.println("Luku "+luku+" on pienempi kuin luku "+luku2+".");
        }
        if(luku == luku2){
            System.out.println("Luku "+luku+" on yhtä suuri kuin luku "+luku2+".");
        }
    }
}

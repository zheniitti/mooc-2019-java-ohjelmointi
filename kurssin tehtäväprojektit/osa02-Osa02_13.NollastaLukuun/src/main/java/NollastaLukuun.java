
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku=Integer.valueOf(lukija.nextLine());
        int nolla=0;
        while(nolla<=luku){
            System.out.println(nolla);
            nolla++;
        }
    }
}

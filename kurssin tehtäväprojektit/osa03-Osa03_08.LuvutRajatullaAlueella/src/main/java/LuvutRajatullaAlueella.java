
import java.util.ArrayList;
import java.util.Scanner;

public class LuvutRajatullaAlueella {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }
            luvut.add(luku);
        }
        int i = 0;
        System.out.println("Mistä?"); int mistä = Integer.valueOf(lukija.nextLine());
        System.out.println("MIhin?"); int mihin = Integer.valueOf(lukija.nextLine());
        while(mistä<=mihin){
            System.out.println(luvut.get(mistä));
            mistä++;
        }
    }
}

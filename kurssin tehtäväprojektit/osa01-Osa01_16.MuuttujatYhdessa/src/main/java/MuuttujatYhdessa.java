
import java.util.Scanner;

public class MuuttujatYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä merkkijono!");
        String teksti = lukija.nextLine();
        System.out.println("Syötä kokonaisluku!");
        int kokluku = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä liukuluku!");
        double liukuluku = Double.valueOf(lukija.nextLine());
        System.out.println("Syötä totuusarvo!");
        boolean arvo = Boolean.valueOf(lukija.nextLine());
        System.out.println("Syötit merkkijonon "+teksti);
        System.out.println("Syötit kokonaisluvun "+kokluku);
        System.out.println("Syötit liukuluvun "+liukuluku);
        System.out.println("Syötit totuusarvon "+arvo);

    }
}

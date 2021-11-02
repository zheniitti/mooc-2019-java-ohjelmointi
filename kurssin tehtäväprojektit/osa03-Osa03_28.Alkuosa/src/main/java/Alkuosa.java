
import java.util.Scanner;

public class Alkuosa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna sana: "); String sana = lukija.nextLine();
        System.out.println("Alkuosan pituus: "); int pituus = Integer.valueOf(lukija.nextLine());
        String tulos = sana.substring(0,pituus);
        System.out.println("Tulos: "+tulos);
    }
}

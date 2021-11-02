
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna pisteet[0-100]");
        int piste = Integer.valueOf(lukija.nextLine());
        if (piste < 0){
            System.out.println("Arvosana: mahdotonta!");
        }
        else if (piste > 100){
            System.out.println("Arvosana: uskomatonta!");
        }
        else if (piste < 50){
            System.out.println("Arvosana: hylätty");
        }
        else if (piste < 60){
            System.out.println("Arvosana: 1");
        }
        else if (piste < 70){
            System.out.println("Arvosana: 2");
        }
        else if (piste < 80){
            System.out.println("Arvosana: 3");
        }
        else if (piste < 90){
            System.out.println("Arvosana: 4");
        }
        else if (piste <101){
            System.out.println("Arvosana: 5");
        }
    }
}

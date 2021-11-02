
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit testata luokkaasi täällä
        Hajautustaulu<String, Integer> t = new Hajautustaulu<>();
        
        t.lisaa("yksi", 1);
        t.lisaa("kaksi", 2);
        t.lisaa("kolme", 3);
        
        System.out.println(t.hae("kolme"));
        System.out.println(t.poista("kolme"));
        System.out.println(t.hae("kolme"));
        System.out.println(t.hae("kaksi"));

        
    }

}

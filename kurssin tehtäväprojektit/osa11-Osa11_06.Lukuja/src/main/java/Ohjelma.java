
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int maara = Integer.valueOf(lukija.nextLine());
        for(int i = 1; i <= maara; i++){
            System.out.println(new Random().nextInt(11));
        
    }
        
    }

}

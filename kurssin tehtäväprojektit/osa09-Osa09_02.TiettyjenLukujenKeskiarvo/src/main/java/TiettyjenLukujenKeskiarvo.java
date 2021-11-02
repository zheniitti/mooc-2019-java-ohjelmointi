
import java.util.ArrayList;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
         ArrayList<String> syotteet = new ArrayList<>();
         String kumpi = "";
        while (true) {
    String rivi = lukija.nextLine();
    if (rivi.equals("loppu")) {
        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
        kumpi = lukija.nextLine();
        break;
    }
    syotteet.add(rivi);
}
        if(kumpi.equals("p")){
            double keskiarvo = syotteet.stream()
                .mapToInt(s -> Integer.valueOf(s))
                 .filter(s -> s>0)
                .average()
                .getAsDouble();
                        System.out.println("Lukujen keskiarvo: " + keskiarvo);

        }else{
            double keskiarvo = syotteet.stream()
                .mapToInt(s -> Integer.valueOf(s))
                 .filter(s -> s<0)
                .average()
                .getAsDouble();
                    System.out.println("Lukujen keskiarvo: " + keskiarvo);

        }
        
        

    }
}

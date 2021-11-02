
import java.util.Scanner;

public class JokaToinenSana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while(true){
                String merkkijono = lukija.nextLine();
                if(merkkijono.length()==0){
                    break;
                }
                String[] jononOsa = merkkijono.split("\\s+");
                int i = 1;
                while(i<jononOsa.length){
                    System.out.println(jononOsa[i]);
                    i=i+2;
                }
                i=1;
            }

    }
}

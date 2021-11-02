
import java.util.ArrayList;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        while(true){
            String syöte = lukija.nextLine();
            if(syöte.isEmpty()){
                break;
            }
            lista.add(syöte);
        }
        
        lista.stream().forEach(s-> System.out.println(s));

    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        while(true){
            int syöte = Integer.valueOf(lukija.nextLine());
            if(syöte<0){
                break;
            }
            lista.add(syöte);
        }
        
        lista.stream().filter(s-> s>0 && s<6).forEach(s-> System.out.println(s));
    }
}

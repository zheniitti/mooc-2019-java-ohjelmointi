package testausta;

import java.util.ArrayList;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println(suorita(lukija));
    }

    public static String suorita(Scanner lukija) {
        ArrayList<Integer> lista = new ArrayList<>();
        while(true){
            int maara = Integer.parseInt(lukija.nextLine());
            if(maara==-1){
                break;
            }
            if(maara>=0){
                lista.add(maara);
            }
        }
        int summa = 0;
        for(int luku: lista){
            summa+=luku;
        }
        if(lista.size()==0||summa ==0){
            return "Keskiarvoa ei voida laskea";
        }
        double ka = 1.0*summa/lista.size();
        String pulloja = "Pulloja: "+summa;
        String oppilaita = "Oppilaita: "+lista.size();
        
        String keskiarvo = "Keskiarvo: " + ka;
        
        return pulloja+"\n" + oppilaita +"\n" + keskiarvo;
    }
    
    
}

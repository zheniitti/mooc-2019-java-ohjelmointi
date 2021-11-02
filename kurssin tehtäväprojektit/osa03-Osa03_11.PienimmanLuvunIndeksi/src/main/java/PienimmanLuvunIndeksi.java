
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while(true){ 
            int luku = Integer.valueOf(lukija.nextLine());
            if(luku==9999){
             break;   
            }
            
            luvut.add(luku);
        }
        int i = 0;
        int pienin= luvut.get(0);
        while(i<luvut.size()){
            if(pienin>luvut.get(i)){
                pienin = luvut.get(i);
            }
            i++;
        }
        System.out.println("Pienin luku on "+pienin);
        
        int ii = 0;
        while(ii < luvut.size()){
            if(pienin==luvut.get(ii)){
                System.out.println("Pienin luku löytyy indeksistä "+ii);
                
            }
            ii++;
        }
        
// toteuta tänne ohjelma, joka lukee käyttäjältä lukuja
        // kunnes käyttäjä syöttää luvun 9999
        
        // tämän jälkeen ohjelma tulostaa pienimmän luvun
        // sekä sen indeksin -- pienin luku voi esiintyä
        // useammassa indeksissä
        
    }
}

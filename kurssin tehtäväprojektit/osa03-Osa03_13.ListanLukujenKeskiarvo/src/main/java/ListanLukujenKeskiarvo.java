
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta tänne ohjelma, joka ensin lukee käyttäjältä
        // lukuja listalle kunnes käyttäjä syöttää luvun -1.
        // ohjelma laskee tämän jälkeen listalla olevien lukujen
        // keskiarvon, ja tulostaa sen käyttäjän näkyville
        ArrayList<Integer> lista = new ArrayList<>();
        while(true){
            int luku = Integer.valueOf(lukija.nextLine());
            if(luku==-1){
                break;
            }
            lista.add(luku);
        }
        int summa = 0;
        for (Integer luku: lista){
            summa = summa+luku;
        }
        System.out.println("Keskiarvo; "+ 1.0*summa/lista.size());
    }
}

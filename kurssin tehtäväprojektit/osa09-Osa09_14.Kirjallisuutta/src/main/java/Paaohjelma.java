import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> lista = new ArrayList<>();
        
        while (true){
            System.out.println("Syötä kirjan nimi, tyhjä lopettaa:");
            String nimi = lukija.nextLine();
            if(nimi.isEmpty()){
                break;
            }
            System.out.println("Syötä kirjan pienin kohdeikä:");
            int kohdeika = Integer.valueOf(lukija.nextLine());
            lista.add(new Kirja(nimi, kohdeika));
        }
               
        System.out.println("Yhteensä " + lista.size() + " kirjaa.");
        Comparator<Kirja> vertailija = Comparator.comparing(Kirja::getIka).thenComparing(Kirja::getNimi);
        Collections.sort(lista, vertailija);
        System.out.println("Kirjat:");
        lista.stream().forEach(k-> System.out.println(k));
    }

}

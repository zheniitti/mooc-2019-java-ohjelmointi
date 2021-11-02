
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Kirja> kirjatiedotlista = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> kirjannimilista = new ArrayList<>();
                
        while(true){
            System.out.println("Nimi:"); String nimi = lukija.nextLine();
            if(nimi.isEmpty()){
                break;
            }
            System.out.println("Sivuja:"); int sivuja = Integer.valueOf(lukija.nextLine());
            System.out.println("Kirjoitusvuosi:"); int kirjoitusvuosi = Integer.valueOf(lukija.nextLine());
            Kirja kirja = new Kirja(nimi, sivuja, kirjoitusvuosi);
            kirjatiedotlista.add(kirja);
            String kirjannimi = kirja.getNimi();
            kirjannimilista.add(kirjannimi);
        }
        
        System.out.println("Mitä tulostetaan?"); String kaikkivainimi = lukija.nextLine();
        if(kaikkivainimi.equals("kaikki")){
            for(Kirja kaikkitiedot: kirjatiedotlista){
                System.out.println(kaikkitiedot);
            }
        }
        int indeksi = 0;
        if(kaikkivainimi.equals("nimi")){
            for (String nimi : kirjannimilista){
                System.out.println(nimi);
        }
        }
    }
}

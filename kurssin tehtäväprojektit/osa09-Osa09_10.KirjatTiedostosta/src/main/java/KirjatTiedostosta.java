
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KirjatTiedostosta {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä

    }
    public static List<Kirja> lueKirjat(String tiedosto){
        ArrayList<Kirja> kirjat = new ArrayList<>();
        try{
            Files.lines(Paths.get(tiedosto)).map(rivi -> rivi.split(","))
                    .filter(palat -> palat.length==4)
                    .map(p -> new Kirja(p[0],Integer.valueOf(p[1]),Integer.valueOf(p[2]),p[3]))
                    .forEach(e->kirjat.add(e));
        }catch (Exception omena){
            System.out.println(omena);
        }
        return kirjat;
    }

}

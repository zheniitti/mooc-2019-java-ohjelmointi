
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import javafx.scene.shape.Path;

public class TiedostonRivit {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // testaa metodia täällä

    }
    
    public static List<String> lue(String tiedosto){
        ArrayList<String> rivit = new ArrayList<>();
        try{
            Files.lines(Paths.get(tiedosto)).forEach(x -> rivit.add(x));
        }catch(Exception x){
            System.out.println(x);
        }
        return rivit;
    }

}

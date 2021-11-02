import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiivisetLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
    }    
      
    public static List<Integer> positiiviset(List<Integer> luvut){
            return luvut.stream().filter(s->s>0).collect(Collectors.toCollection(ArrayList::new));
                    
        }
}


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Lukutaitovertailu {
    
    public static void main(String[] args) {
        ArrayList <String> lista = new ArrayList<>();
        
        try{
            Files.lines(Paths.get("lukutaito.csv")).map(rivi->rivi.split(","))
                    .forEach(t -> lista.add(t[3].trim() + " ("+t[4].trim()+"), " 
                            + t[2].trim().split(" ")[0] + ", "+t[5].trim())); 
            
            //System.out.println(lista);
        }catch(Exception omena){
            System.out.println(omena.getMessage());
        }
        ArrayList<String> uusi = lista.stream().sorted((r1,r2)->{return Double.valueOf(r1.split(",")[2].trim()).compareTo(Double.valueOf(r2.split(",")[2].trim()));})
                    .collect(Collectors.toCollection((ArrayList::new)));
        uusi.stream().forEach(rivi-> System.out.println(rivi));
    }
    
    
}
//3425.sorted(this -> {return Integer.valueOf(rivi1.split(",")[5])-Integer.valueOf(rivi2.split(",")[5]);}).forEach(rivi->lista.add(rivi))




import java.util.HashMap;

public class Ohjelma {

    public static void main(String[] args) {
        
    }
    
    public static void tulostaArvot(HashMap<String, Kirja> hajautustaulu){
        System.out.println(hajautustaulu.values().toString());
    }
    
    public static void tulostaArvoJosNimessa(HashMap<String, Kirja> hajautustaulu, String merkkijono){
        siistiMerkkijono(merkkijono);
        for (Kirja kirja: hajautustaulu.values()){
            if(kirja.getNimi().contains(merkkijono)){
                System.out.println(kirja);
            }
        }
    }
    
    
    
    public static String siistiMerkkijono(String merkkijono){
        return merkkijono.toLowerCase().trim();
        
    }
}

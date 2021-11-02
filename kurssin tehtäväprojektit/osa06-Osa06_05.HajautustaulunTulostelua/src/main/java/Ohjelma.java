
import java.util.HashMap;
import java.util.ArrayList;
public class Ohjelma {

    public static void main(String[] args) {
        
    }
    
    public static void tulostaAvaimet(HashMap<String, String> hajautustaulu){
            for(String avain: hajautustaulu.keySet()){
                System.out.println(avain);
            }
        }
    
    public static void tulostaAvaimetJoissa(HashMap<String, String> hajautustaulu, String merkkijono){
        merkkijono = siistiMerkkijono(merkkijono);
        for(String avain: hajautustaulu.keySet()){
                if(avain.contains(merkkijono)){
                    System.out.println(avain);
        }
            }
        
    }
    
    public static void tulostaArvotJosAvaimessa(HashMap<String, String> hajautustaulu, String merkkijono){
        merkkijono = siistiMerkkijono(merkkijono);
        for(String avain: hajautustaulu.keySet()){
                if(avain.contains(merkkijono)){
                    System.out.println(hajautustaulu.get(avain));
        }
            }
    }
    public static String siistiMerkkijono(String merkkijono) {
        if (merkkijono == null) {
            return "";
        }
        merkkijono = merkkijono.toLowerCase();
        return merkkijono.trim();
    }
    
    
}

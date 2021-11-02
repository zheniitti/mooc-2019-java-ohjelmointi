import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Ohjelma {

    public static void main(String[] args) {        
        HashMap<String, String> parit = new HashMap<>();
parit.put("eka", "1");
parit.put("toka", "2");
parit.put("one", "1");


HashMap<String, String> uudet = kaanna(parit);

for(String avain: uudet.keySet()) {
    System.out.println(avain + " " + uudet.get(avain));
}

  }
    public static void poistaOsa(ArrayList<Integer> luvut){
        int i = 0;
        ArrayList<Integer> lista = new ArrayList<>();
        for(int luku: luvut){
            if((luku%3==0 || luku%7==0)&&luku!=0){
                System.out.println(luku);
                lista.add(i);
            }
            i++;
        }
        int x = 0;
        
            for(int indeksi: lista){
                luvut.remove(indeksi-x);
                x++;
            }
        
    }
    
    public static HashMap<String, String> kaanna(HashMap<String, String> parit){
        HashMap<String,String> map = new HashMap<>();
        for(String avain: parit.keySet()){
            String arvo = parit.get(avain);
            map.putIfAbsent(arvo, avain);
        }
        
        return map;
    }
}

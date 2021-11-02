import java.util.ArrayList;
import java.util.HashMap;

public class Arvosanarekisteri {
    private ArrayList<Integer> pisteetlista;
    private HashMap<Integer, Integer> arvosanat;

    public Arvosanarekisteri() {
        this.arvosanat = new HashMap<>();
        this.pisteetlista = new ArrayList<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        pisteetlista.add(pisteet);
        int arvosana = pisteetArvosanaksi(pisteet);
        int lkm = this.arvosanat.getOrDefault(arvosana, 0);
        this.arvosanat.put(arvosana, lkm + 1);
    }

    public int montakoSaanutArvosanan(int arvosana) {
        return this.arvosanat.getOrDefault(arvosana, 0);
    }

    public double arvosanojenKeskiarvo(){
        int summa=0;
        int lkm = 0;
        if(!arvosanat.isEmpty()){
            for(int arvosana : arvosanat.keySet()){
            summa = summa + arvosana * arvosanat.get(arvosana);
            lkm = lkm + arvosanat.get(arvosana);
        }
        }
        return 1.0*summa/lkm;
    }
    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
    
    public double koepisteidenKeskiarvo(){
        int summa = 0;
        if(!pisteetlista.isEmpty()){
            for(Integer piste: pisteetlista){
                summa = summa + piste;
            }
            return 1.0*summa/pisteetlista.size();
        }
        return 0.0;
    }
}

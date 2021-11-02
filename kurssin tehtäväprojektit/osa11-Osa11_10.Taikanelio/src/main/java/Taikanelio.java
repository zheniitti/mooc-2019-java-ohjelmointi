
import java.util.ArrayList;
import java.util.Collections;

public class Taikanelio {

    private int[][] nelio;

    // valmis konstruktori
    public Taikanelio(int koko) {
        if (koko < 2) {
            koko = 2;
        }

        this.nelio = new int[koko][koko];
    }

    // toteuta nämä kolme metodia
    public ArrayList<Integer> rivienSummat() {
        ArrayList<Integer> lista = new ArrayList<>();
        for(int a = 0; a < this.nelio.length; a++){
            int summa = 0;
            for(int b = 0; b < this.nelio.length; b++){
                summa += nelio[b][a];
                if(b==nelio.length-1){
                    lista.add(summa);
                }
            }
        }
        
        return lista;
    }

    public ArrayList<Integer> sarakkeidenSummat() {
        ArrayList<Integer> lista = new ArrayList<>();
        for(int a = 0; a < this.nelio.length; a++){
            int summa = 0;
            for(int b = 0; b < this.nelio.length; b++){
                summa += nelio[a][b];
                if(b==nelio.length-1){
                    lista.add(summa);
                }
            }
        }
        
        return lista;
    }

    public ArrayList<Integer> lavistajienSummat() {
        ArrayList<Integer> lista = new ArrayList<>();
        
            int summa = 0;
            for(int b = 0; b < this.nelio.length; b++){
                summa += nelio[b][b];
                if(b==nelio.length-1){
                    lista.add(summa);
                }
            }
            summa = 0;
            for(int b = 0; b < this.nelio.length; b++){
                summa += nelio[b][nelio.length-b-1];
                if(b==nelio.length-1){
                    lista.add(summa);
                }
            }
        
        return lista;
    }

    // valmiit apumetodit -- älä koske näihin
    public boolean onTaikanelio() {
        return summatSamat() && kaikkiNumerotEri();
    }

    public ArrayList<Integer> annaKaikkiNumerot() {
        ArrayList<Integer> numerot = new ArrayList<>();
        for (int rivi = 0; rivi < nelio.length; rivi++) {
            for (int sarake = 0; sarake < nelio[rivi].length; sarake++) {
                numerot.add(nelio[rivi][sarake]);
            }
        }
        return numerot;
    }

    public boolean kaikkiNumerotEri() {
        ArrayList<Integer> numerot = annaKaikkiNumerot();

        Collections.sort(numerot);
        for (int i = 1; i < numerot.size(); i++) {
            if (numerot.get(i - 1) == numerot.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean summatSamat() {
        ArrayList<Integer> summat = new ArrayList<>();
        summat.addAll(rivienSummat());
        summat.addAll(sarakkeidenSummat());
        summat.addAll(lavistajienSummat());

        if (summat.size() < 3) {
            return false;
        }

        for (int i = 1; i < summat.size(); i++) {
            if (summat.get(i - 1) != summat.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int annaArvo(int x, int y) {
        if (x < 0 || y < 0 || x >= getLeveys() || y >= getKorkeus()) {
            return - 1;
        }

        return this.nelio[x][y];
    }

    public void asetaArvo(int x, int y, int arvo) {
        if (x < 0 || y < 0 || x >= getLeveys() || y >= getKorkeus()) {
            return;
        }

        this.nelio[x][y] = arvo;
    }

    private int getLeveys() {
        return this.nelio.length;
    }

    private int getKorkeus() {
        return this.nelio.length;
    }

    @Override
    public String toString() {
        StringBuilder palautus = new StringBuilder();
        for (int rivi = 0; rivi < nelio.length; rivi++) {
            for (int sarake = 0; sarake < nelio[rivi].length; sarake++) {
                palautus.append(nelio[rivi][sarake]).append("\t");
            }

            palautus.append("\n\n");
        }

        return palautus.toString();
    }
}

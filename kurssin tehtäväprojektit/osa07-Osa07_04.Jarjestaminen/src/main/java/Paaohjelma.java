import java.util.Arrays;
public class Paaohjelma {

    public static void main(String[] args) {
        int[] luvut = {8, 3, 7, 9, 1, 2, 4};
        Paaohjelma.jarjesta(luvut);
    }
    
    
    public static int pienin(int[] taulukko) {
        if(taulukko.length>0){
        int pienin = taulukko[0];
        for (int luku: taulukko){
            if(luku<pienin){
                pienin = luku;
            }
        }
        return pienin;
    }
        return -1;
    }
    
    
    public static int pienimmanIndeksi(int[] taulukko){
        if(taulukko.length>0){
            int i = 0;
            while(i<taulukko.length){
                if(taulukko[i]==pienin(taulukko)){
                break;
            }
                i++;
            }
        return i;
    }
        return -1;
    }
    
    
    public static int pienimmanIndeksiAlkaen(int[] taulukko, int alkaen){
        int pienin = taulukko[alkaen];
        int i = alkaen;
        while (i < taulukko.length){
            if(pienin>taulukko[i]){
                pienin = taulukko[i];
            }
            
            i ++;
        }
        
        if(taulukko.length>0){
            while(alkaen<taulukko.length){
                if(taulukko[alkaen]==pienin){
                break;
            }
                alkaen++;
            }
        return alkaen;
    }
        return -1;
    }
    
    
    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int i1 = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = i1;
    }
    
    public static void jarjesta(int[] taulukko) {
        int i = 0;
        while(i<taulukko.length){
            vaihda(taulukko, i, pienimmanIndeksiAlkaen(taulukko, i));
            i ++;
            System.out.println(taulukko);
        }
}}
    


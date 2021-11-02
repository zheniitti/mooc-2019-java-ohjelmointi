
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        int i = 0;
        while(i<taulukko.length-1){
            System.out.print(taulukko[i]+",");
            i++;
        }
        System.out.print(taulukko[taulukko.length-1]);
    }
}

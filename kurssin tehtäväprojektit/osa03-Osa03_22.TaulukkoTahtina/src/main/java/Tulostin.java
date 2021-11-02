
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        int i = 0;
        int a=1;
        while(i<taulukko.length){
            
            while(a<=taulukko[i]){
            System.out.print("*");
            a++;
        }
        i++;
        System.out.println("");
        a = 1;
        }
    }

}

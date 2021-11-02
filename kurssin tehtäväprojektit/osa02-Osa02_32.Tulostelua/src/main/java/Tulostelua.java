
public class Tulostelua {

    public static void main(String[] args) {

        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        int i = 1;
        while(i<=maara){
            System.out.print("*");
            
            i++;
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        int a=1;
        while (a<=sivunpituus){
            tulostaTahtia(sivunpituus);
            a++;
            
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        int a=1;
        while(a<=korkeus){
            tulostaTahtia(leveys);
            
            a++;
        }
    }

    public static void tulostaKolmio(int koko) {
        int a=1;
        int luku=1;
        while(a<=koko){
            tulostaTahtia(luku);
            
            a++;
            luku++;
        }
    }
}

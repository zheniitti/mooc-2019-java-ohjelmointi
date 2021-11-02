
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        
        int i = 1;
        while(i<=maara){
            System.out.print("*");          
            i++;
        }
        System.out.println("");
    
    }

    public static void tulostaTyhjaa(int maara) {
        {
        int i = 1;
        while(i<=maara){
            System.out.print(" ");
            
            i++;
        }
       
    }
    }

    public static void tulostaKolmio(int koko) {
        int a=1;
        while(a<=koko){
            tulostaTyhjaa((koko-a));
            tulostaTahtia(a);
            a++;
            
        }
        
    }

    public static void jouluKuusi(int korkeus) {
        int a=1;
        int b=1;
        while(a<=korkeus){
            tulostaTyhjaa((korkeus-a)); tulostaTahtia(b);
            
            a++; b=b+2;
        }
        tulostaTyhjaa(korkeus-2);tulostaTahtia(3);
        tulostaTyhjaa(korkeus-2);tulostaTahtia(3);
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}



public class Main {

    public static void main(String[] args) {
        MuistavaTuotevarasto mehu = new MuistavaTuotevarasto("Juice", 1000.0, 500.0);
        mehu.otaVarastosta(50.0);
        System.out.println(mehu);
        mehu.lisaaVarastoon(1.0);
        System.out.println(mehu);           
        mehu.otaVarastosta(450.0);
        System.out.println(mehu);
        System.out.println(mehu.otaVarastosta(2));
        System.out.println(mehu);
        
        System.out.println("");
        System.out.println(mehu.historia());mehu.tulostaAnalyysi(); // [1000.0]
        // saadaan siis vasta konstruktorin asettama historian alkupiste... 
    }

}

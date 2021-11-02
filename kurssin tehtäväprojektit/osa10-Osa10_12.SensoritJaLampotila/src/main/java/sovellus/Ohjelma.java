package sovellus;

public class Ohjelma {

    public static void main(String[] args) {
        
        Keskiarvosensori ka = new Keskiarvosensori();
ka.lisaaSensori( new Vakiosensori(3) );
ka.lisaaSensori( new Vakiosensori(7) );
ka.mittaukset();
    }

}

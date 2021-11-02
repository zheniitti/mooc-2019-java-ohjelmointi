
public class Main {

    public static void main(String[] args) {
      Kirjasto kirjasto = new Kirjasto();
      
        Kirja cheese = new Kirja("Cheese Problems Solved", "Woodhead Publishing", 2007);
        kirjasto.lisaaKirja(cheese);

        Kirja nhl = new Kirja("NHL Hockey", "Stanley Kupp", 1952);
        kirjasto.lisaaKirja(nhl);

        kirjasto.lisaaKirja(new Kirja("Battle Axes", "Tom A. Hawk", 1851));

        kirjasto.tulostaKirjat();
    }
}

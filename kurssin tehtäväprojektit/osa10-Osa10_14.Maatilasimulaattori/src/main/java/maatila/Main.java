package maatila;


public class Main {

    public static void main(String[] args) {
        Lypsyrobotti robo = new Lypsyrobotti();
        Maatila tila = new Maatila("Kalle", new Navetta(new Maitosailio(100)));

        tila.lisaaLehma(new Lehma("lehma1"));        
        System.out.println(tila);
        
        tila.eleleTunti();
        tila.lisaaLehma(new Lehma("lehma2"));        
        System.out.println(tila);
        
        tila.eleleTunti();
        System.out.println(tila);

        tila.asennaNavettaanLypsyrobotti(robo);
        tila.hoidaLehmat();
        System.out.println(tila);
    }
}

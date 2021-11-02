
public class Kappale {

    private String esittaja;
    private String nimi;
    private int pituusSekunteina;

    public Kappale(String esittaja, String nimi, int pituusSekunteina) {
        this.esittaja = esittaja;
        this.nimi = nimi;
        this.pituusSekunteina = pituusSekunteina;
    }
    
     public boolean equals(Object verrattava) {
        // jos muuttujat sijaitsevat samassa paikassa, ovat ne samat
        if (this == verrattava) {
            return true;
        }

        // jos verrattava olio ei ole Henkilo-tyyppinen, oliot eivät ole samat
        if (!(verrattava instanceof Kappale)) {
            return false;
        }

        // muunnetaan olio Henkilo-olioksi
        Kappale verrattavaKappale = (Kappale) verrattava;

        // jos olioiden oliomuuttujien arvot ovat samat, ovat oliot samat
        if (this.nimi.equals(verrattavaKappale.nimi) &&
            this.esittaja == verrattavaKappale.esittaja &&
            this.pituusSekunteina == verrattavaKappale.pituusSekunteina) {
            return true;
        }

        // muulloin oliot eivät ole samat
        return false;
    }

    @Override
    public String toString() {
        return this.esittaja + ": " + this.nimi + " (" + this.pituusSekunteina + " s)";
    }


}

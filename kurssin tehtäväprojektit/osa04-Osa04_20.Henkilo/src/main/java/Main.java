
public class Main {

    public static void main(String[] args) {
Henkilo pekka = new Henkilo("Pekka");
Henkilo antti = new Henkilo("Antti");

antti.tulostaHenkilo();

pekka.vanhene();
pekka.vanhene();

antti.vanhene();

System.out.println("Pekan ikä: " + pekka.palautaIka());
System.out.println("Antin ikä: " + antti.palautaIka());

int yht = pekka.palautaIka() + antti.palautaIka();

System.out.println("Pekka ja Antti yhteensä " + yht + " vuotta");
    }
}

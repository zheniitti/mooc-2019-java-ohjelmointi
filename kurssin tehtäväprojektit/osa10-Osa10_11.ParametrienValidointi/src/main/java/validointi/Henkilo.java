package validointi;

public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimi, int ika) {
        if (nimi == null || nimi.isEmpty() || nimi.length() > 40) {
            throw new IllegalArgumentException("Henkilön nimi ei saa olla tyhjä "
                    + "ja sen tulee olla korkeintaan 40 merkkiä pitkä.");
        }

        if (ika < 0 || ika > 120) {
            throw new IllegalArgumentException("Henkilön iän pitäisi olla välillä [0-120].");
        }

        this.nimi = nimi;
        this.ika = ika;
    }

    public String getNimi() {
        return nimi;
    }

    public int getIka() {
        return ika;
    }
}

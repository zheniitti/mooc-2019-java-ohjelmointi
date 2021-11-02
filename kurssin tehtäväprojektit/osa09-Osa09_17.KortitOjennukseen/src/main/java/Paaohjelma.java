import java.util.ArrayList;
import java.util.Collections;

public class Paaohjelma {

    public static void main(String[] args) {
ArrayList<Kortti> kortit = new ArrayList<>();

kortit.add(new Kortti(3, Maa.PATA));
kortit.add(new Kortti(2, Maa.RUUTU));
kortit.add(new Kortti(14, Maa.PATA));
kortit.add(new Kortti(12, Maa.HERTTA));
kortit.add(new Kortti(2, Maa.PATA));

SamatMaatVierekkainArvojarjestykseen samatMaatVierekkainJarjestaja = new SamatMaatVierekkainArvojarjestykseen();
Collections.sort(kortit, (k1,k2) -> {if (k1.getMaa() == k2.getMaa()) {
            return k1.getArvo() - k2.getArvo();
        }

        return k1.getMaa().compareTo(k2.getMaa());});

kortit.stream().forEach(k -> System.out.println(k));
    }
}

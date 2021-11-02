package lentokentta;
import java.util.Scanner;
import lentokentta.ui.Tekstikayttoliittyma;
import lentokentta.domain.Lento;
import lentokentta.domain.Lentokone; import lentokentta.domain.Paikka; 
import lentokentta.logiikka.Lentohallinta;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Tekstikayttoliittyma te = new Tekstikayttoliittyma(new Lentohallinta(), lukija);
        
        te.kaynnista();
    }
}

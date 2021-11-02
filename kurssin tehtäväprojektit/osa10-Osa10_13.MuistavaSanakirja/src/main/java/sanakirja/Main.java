package sanakirja;

public class Main {
    public static void main(String[] args) {
        MuistavaSanakirja uusiSanakirja = new MuistavaSanakirja("sanat.txt");
        System.out.println("onnistuiko lataaminen: " + uusiSanakirja.lataa());
        uusiSanakirja.tulostaSanat();
       
        System.out.println("");
        uusiSanakirja.poista("2");
        uusiSanakirja.tulostaSanat();
        System.out.println("");
        System.out.println("onnistuiko tallennus: " + uusiSanakirja.tallenna());


    }
}

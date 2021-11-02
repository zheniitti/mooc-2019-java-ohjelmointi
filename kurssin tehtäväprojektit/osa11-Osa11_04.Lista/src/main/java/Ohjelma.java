
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Lista<Integer> lista = new Lista<>();
        for(int i = 0; i<1000; i++){
            lista.lisaa(i);
        }
        
        System.out.println(lista.koko());
        System.out.println(lista.sisaltaa(555));
        System.out.println(lista.sisaltaa(-1));
        lista.poista(555);
        System.out.println(lista.sisaltaa(555));
        System.out.println(lista.koko());
        System.out.println(lista.arvonIndeksi(111));
        System.out.println(lista.arvonIndeksi(88888));
        lista.lisaa(Integer.SIZE);
    }

}

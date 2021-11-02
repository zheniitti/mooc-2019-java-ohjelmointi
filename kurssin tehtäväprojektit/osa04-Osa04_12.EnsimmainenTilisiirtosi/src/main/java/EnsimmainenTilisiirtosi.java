
public class EnsimmainenTilisiirtosi {

    public static void main(String[] args) {
        Tili matintili = new Tili("Matin tili", 1000);
        Tili omatili = new Tili("Oma tili", 0);
        matintili.otto(100);
        omatili.pano(100);
        System.out.println(matintili);
        System.out.println(omatili);
    }
}

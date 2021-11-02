
public class Ohjelma {

    public static void main(String[] args) {
Harjoitusapuri apuri = new Harjoitusapuri(30, 60);

double prosenttiosuus = 0.5;

while (prosenttiosuus < 1.0) {
    double tavoite = apuri.tavoitesyke(prosenttiosuus);
    System.out.println("Tavoite " + (prosenttiosuus * 100) + "% maksimista: " + tavoite);
    prosenttiosuus = prosenttiosuus + 0.1;
}

    }
}

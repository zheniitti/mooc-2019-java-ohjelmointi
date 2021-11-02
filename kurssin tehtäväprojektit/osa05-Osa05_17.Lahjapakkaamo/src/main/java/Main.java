
public class Main {

    public static void main(String[] args) {
         Lahja kirja = new Lahja("Aapiskukko", 2);
         Lahja kirja2 = new Lahja("Aapiskukko", 2);

        Pakkaus paketti = new Pakkaus();
        paketti.lisaaLahja(kirja); 
        paketti.lisaaLahja(kirja2);
        System.out.println(paketti.yhteispaino());

    }
}


public class Main {

    public static void main(String[] args) {
        Laatikko isolaatikko = new Laatikko(100);
        Laatikko laa1 = new Laatikko(10);
        Kirja a = new Kirja("a","b",1.3);
        laa1.lisaa(a);
        Laatikko laa2 = new Laatikko(20);
        
        isolaatikko.lisaa(laa1);
        
        isolaatikko.lisaa(isolaatikko);
        System.out.println(isolaatikko);
    }

}

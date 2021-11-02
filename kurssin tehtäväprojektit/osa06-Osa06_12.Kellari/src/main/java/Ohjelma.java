
public class Ohjelma {

    public static void main(String[] args) {
 Kellari kellari = new Kellari();
kellari.lisaa("a14", "luistimet");
kellari.lisaa("a14", "maila");
kellari.lisaa("a14", "luistimet");

kellari.lisaa("f156", "rullaluistimet");
kellari.lisaa("f156", "rullaluistimet");

kellari.lisaa("g63", "six");
kellari.lisaa("g63", "pi");

System.out.println(kellari.sisalto("a14"));
System.out.println(kellari.sisalto("f156"));
    }
}

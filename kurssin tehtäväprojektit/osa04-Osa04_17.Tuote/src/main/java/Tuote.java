public class Tuote {
    private String tuotteennimi;
    private double hinta;
    private int maara;
    
    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa){
        this.hinta = hintaAlussa;
        this.tuotteennimi = nimiAlussa;
        this.maara = maaraAlussa;
    }
    public void tulostaTuote(){
        System.out.println(tuotteennimi + ", " + "hinta " + hinta + ", " + maara + " kpl");
}
}
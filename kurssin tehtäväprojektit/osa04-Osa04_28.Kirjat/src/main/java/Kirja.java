
public class Kirja {
    private String kirjannimi;
    private int sivujenlukumäärä;
    private int kirjoitusvuosi;
    
    public Kirja(String nimi, int sivujenmäärä, int kirjoitusvuosi){
        this.kirjannimi = nimi;
        this.kirjoitusvuosi = kirjoitusvuosi;
        this.sivujenlukumäärä = sivujenmäärä;

}
    public String getNimi(){
        return this.kirjannimi;
}
    
    @Override
    public String toString(){
        return this.kirjannimi + ", " + this.sivujenlukumäärä + " sivua, " + this.kirjoitusvuosi;
    }
}
